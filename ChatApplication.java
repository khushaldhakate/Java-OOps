class MessageSender extends Thread {
    private String[] messages;
    private String senderName;

    public MessageSender(String senderName, String[] messages) {
        this.senderName = senderName;
        this.messages = messages;
        this.setName("Sender-" + senderName);
    }

    @Override
    public void run() {
        System.out.println(senderName + " sender thread started");
        
        for (String message : messages) {
            System.out.println(senderName + " sending: " + message);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(senderName + " sender interrupted: " + e.getMessage());
                break;
            }
        }
        
        System.out.println(senderName + " sender thread finished");
    }
}

class MessageReceiver extends Thread {
    private String[] expectedMessages;
    private String receiverName;

    public MessageReceiver(String receiverName, String[] expectedMessages) {
        this.receiverName = receiverName;
        this.expectedMessages = expectedMessages;
        this.setName("Receiver-" + receiverName);
    }

    @Override
    public void run() {
        System.out.println(receiverName + " receiver thread started");
        
        for (String message : expectedMessages) {
            System.out.println(receiverName + " received: " + message);
            
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(receiverName + " receiver interrupted: " + e.getMessage());
                break;
            }
        }
        
        System.out.println(receiverName + " receiver thread finished");
    }
}

public class ChatApplication {
    public static void main(String[] args) {
        System.out.println("--- Chat Application with Thread Lifecycle ---");
        
        String[] messages1 = {"Hello", "How are you?", "Goodbye"};
        String[] messages2 = {"Hi", "I'm fine", "See you later"};
        
        MessageSender sender1 = new MessageSender("Alice", messages1);
        MessageReceiver receiver1 = new MessageReceiver("Bob", messages1);
        
        MessageSender sender2 = new MessageSender("Charlie", messages2);
        MessageReceiver receiver2 = new MessageReceiver("Diana", messages2);
        
        System.out.println("Starting chat sessions...");
        
        sender1.start();
        receiver1.start();
        
        sender2.start();
        receiver2.start();
        
        try {
            Thread.sleep(500);
            System.out.println("Main thread: All chat threads are running");
            
            sender1.join();
            receiver1.join();
            sender2.join();
            receiver2.join();
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("\n--- Second Chat Session ---");
        
        String[] messages3 = {"Good morning", "Have a nice day"};
        MessageSender sender3 = new MessageSender("Eve", messages3);
        MessageReceiver receiver3 = new MessageReceiver("Frank", messages3);
        
        sender3.start();
        receiver3.start();
        
        try {
            Thread.sleep(300);
            System.out.println("Main thread: Second session active");
            
            sender3.join();
            receiver3.join();
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Chat application completed all sessions!");
    }
}

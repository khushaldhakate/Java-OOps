class WorkerThread extends Thread {
    private String taskName;
    private int duration;

    public WorkerThread(String taskName, int duration) {
        this.taskName = taskName;
        this.duration = duration;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started with priority: " + getPriority());
        
        for (int i = 1; i <= duration; i++) {
            System.out.println(taskName + " - Progress: " + i + "/" + duration);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted: " + e.getMessage());
                break;
            }
        }
        
        System.out.println(taskName + " completed");
    }
}

public class ThreadPrioritySystem {
    public static void main(String[] args) {
        System.out.println("--- Thread Priority System ---");
        
        WorkerThread highPriorityTask = new WorkerThread("High Priority Task", 4);
        WorkerThread normalPriorityTask = new WorkerThread("Normal Priority Task", 6);
        WorkerThread lowPriorityTask = new WorkerThread("Low Priority Task", 5);
        
        highPriorityTask.setPriority(Thread.MAX_PRIORITY);
        normalPriorityTask.setPriority(Thread.NORM_PRIORITY);
        lowPriorityTask.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("Thread Priorities:");
        System.out.println("High Priority Task: " + highPriorityTask.getPriority());
        System.out.println("Normal Priority Task: " + normalPriorityTask.getPriority());
        System.out.println("Low Priority Task: " + lowPriorityTask.getPriority());
        
        lowPriorityTask.start();
        normalPriorityTask.start();
        highPriorityTask.start();
        
        try {
            lowPriorityTask.join();
            normalPriorityTask.join();
            highPriorityTask.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("\n--- Second Round of Tasks ---");
        
        WorkerThread task1 = new WorkerThread("Task 1", 3);
        WorkerThread task2 = new WorkerThread("Task 2", 3);
        WorkerThread task3 = new WorkerThread("Task 3", 3);
        
        task1.setPriority(8);
        task2.setPriority(5);
        task3.setPriority(2);
        
        System.out.println("Starting tasks with different priorities...");
        
        task3.start();
        task2.start();
        task1.start();
        
        try {
            task3.join();
            task2.join();
            task1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All tasks completed!");
    }
}

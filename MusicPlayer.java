class MusicPlayer extends Thread {
    private String songName;
    private int duration;

    public MusicPlayer(String songName, int duration) {
        this.songName = songName;
        this.duration = duration;
    }

    @Override
    public void run() {
        System.out.println("Starting to play: " + songName);
        
        for (int i = 1; i <= duration; i++) {
            System.out.println("Playing " + songName + " - " + i + "s");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Playback interrupted: " + e.getMessage());
                break;
            }
        }
        
        System.out.println("Finished playing: " + songName);
    }

    public static void main(String[] args) {
        System.out.println("--- Music Player System ---");
        
        MusicPlayer song1 = new MusicPlayer("Song A", 3);
        MusicPlayer song2 = new MusicPlayer("Song B", 2);
        MusicPlayer song3 = new MusicPlayer("Song C", 4);
        
        song1.start();
        
        try {
            song1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        song2.start();
        
        try {
            song2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        song3.start();
        
        try {
            song3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All songs played successfully!");
    }
}

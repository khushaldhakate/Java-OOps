class DownloadTask implements Runnable {
    private String fileName;
    private int fileSize;

    public DownloadTask(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        
        for (int i = 1; i <= fileSize; i++) {
            System.out.println("Downloading " + fileName + ": " + i + "/" + fileSize + " MB");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted: " + fileName);
                return;
            }
        }
        
        System.out.println("Download completed: " + fileName);
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        System.out.println("--- Download Manager ---");
        
        DownloadTask file1 = new DownloadTask("document.pdf", 5);
        DownloadTask file2 = new DownloadTask("video.mp4", 8);
        DownloadTask file3 = new DownloadTask("image.jpg", 3);
        
        Thread thread1 = new Thread(file1);
        Thread thread2 = new Thread(file2);
        Thread thread3 = new Thread(file3);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All downloads completed successfully!");
        
        DownloadTask file4 = new DownloadTask("archive.zip", 6);
        DownloadTask file5 = new DownloadTask("presentation.pptx", 4);
        
        Thread thread4 = new Thread(file4);
        Thread thread5 = new Thread(file5);
        
        thread4.start();
        thread5.start();
        
        try {
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All files downloaded successfully!");
    }
}

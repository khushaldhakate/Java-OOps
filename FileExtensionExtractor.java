public class FileExtensionExtractor {
    public static void main(String[] args) {
        String fileName1 = "report.pdf";
        System.out.println("File Name: " + fileName1);
        
        int dotIndex1 = fileName1.lastIndexOf('.');
        String extension1 = fileName1.substring(dotIndex1 + 1);
        System.out.println("Extension: " + extension1);
        
        String fileName2 = "presentation.pptx";
        System.out.println("\nFile Name: " + fileName2);
        
        int dotIndex2 = fileName2.lastIndexOf('.');
        String extension2 = fileName2.substring(dotIndex2 + 1);
        System.out.println("Extension: " + extension2);
        
        String fileName3 = "document.docx";
        System.out.println("\nFile Name: " + fileName3);
        
        int dotIndex3 = fileName3.lastIndexOf('.');
        String extension3 = fileName3.substring(dotIndex3 + 1);
        System.out.println("Extension: " + extension3);
        
        String fileName4 = "image.jpg";
        System.out.println("\nFile Name: " + fileName4);
        
        int dotIndex4 = fileName4.lastIndexOf('.');
        String extension4 = fileName4.substring(dotIndex4 + 1);
        System.out.println("Extension: " + extension4);
        
        String fileName5 = "spreadsheet.xlsx";
        System.out.println("\nFile Name: " + fileName5);
        
        int dotIndex5 = fileName5.lastIndexOf('.');
        String extension5 = fileName5.substring(dotIndex5 + 1);
        System.out.println("Extension: " + extension5);
        
        String fileName6 = "video.mp4";
        System.out.println("\nFile Name: " + fileName6);
        
        int dotIndex6 = fileName6.lastIndexOf('.');
        String extension6 = fileName6.substring(dotIndex6 + 1);
        System.out.println("Extension: " + extension6);
    }
}

package Principle.withPrinciple;
class Video {
    private String title;
    private double size;
    public Video(String title,double size) {
        this.title = title;
        this.size = size;
    }
}
class VideoFactory {
    public static Video createVideo(String title,double size) {
        return new Video(title,size);  // Factory creates the Video object
    }
}

public class VSM{
   
    public Video getNewVideo(String title,double size) {
        return VideoFactory.createVideo(title,size);  // Delegation to Factory
    
}
}

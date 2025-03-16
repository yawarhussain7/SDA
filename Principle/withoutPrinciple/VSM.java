package Principle.withoutPrinciple;

 class Video {
    private String title;
    private double size;
    public Video(String title,double size) {
        this.title = title;
        this.size = size;
    }
}

public class VSM{
    public Video createVideo(String title,double size) {
        return new Video(title,size);  // Directly creating Video
    }
}
package Principle.withPrinciple;
class Video {
    private String title;
    public Video(String title) {
        this.title = title;
    }
}
class VideoFactory {
    public static Video createVideo(String title) {
        return new Video(title);  // Factory creates the Video object
    }
}


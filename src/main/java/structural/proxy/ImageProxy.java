package structural.proxy;

public class ImageProxy implements Image {
    private HighResolutionImage highResImage;
    private String imagePath;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    public void display() {
        if (highResImage == null) {
            highResImage = new HighResolutionImage(imagePath);
        }
        highResImage.display();
    }
}


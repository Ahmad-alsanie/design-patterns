package structural.proxy;

public class HighResolutionImage implements Image {
    public HighResolutionImage(String imagePath) {
        // expensive operation that loads a high-resolution image
        loadFromDisk(imagePath);
    }

    private void loadFromDisk(String imagePath) {
        System.out.println("Loading " + imagePath);
    }

    public void display() {
        System.out.println("Displaying image");
    }
}


package structural.proxy;

public class Application {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        // Images are not loaded; only proxies are created.

        // Image is loaded and displayed only when it's actually needed.
        image1.display();
    }
}


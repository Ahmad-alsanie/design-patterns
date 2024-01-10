package structural.bridge;

// Refined Abstraction 2
public class TextBox extends UIElement {
    private String text;

    public TextBox(Renderer renderer, String text) {
        super(renderer);
        this.text = text;
    }

    public void draw() {
        renderer.renderTextBox(text);
    }
}
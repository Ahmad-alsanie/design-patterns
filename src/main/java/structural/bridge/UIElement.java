package structural.bridge;

// Abstraction
public abstract class UIElement {
    protected Renderer renderer;

    public UIElement(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

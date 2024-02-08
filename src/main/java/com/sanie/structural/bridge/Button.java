package com.sanie.structural.bridge;

// Refined Abstraction 1
public class Button extends UIElement {
    private String label;

    public Button(Renderer renderer, String label) {
        super(renderer);
        this.label = label;
    }

    public void draw() {
        renderer.renderButton(label);
    }
}
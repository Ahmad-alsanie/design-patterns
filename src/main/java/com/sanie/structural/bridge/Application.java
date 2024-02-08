package com.sanie.structural.bridge;

public class Application {
    public static void main(String[] args) {
        Renderer htmlRenderer = new HtmlRenderer();
        Renderer svgRenderer = new SvgRenderer();

        UIElement button = new Button(htmlRenderer, "Submit");
        UIElement textBox = new TextBox(svgRenderer, "Input Text");

        button.draw(); // Renders button using HTML
        textBox.draw(); // Renders text box using SVG
    }
}

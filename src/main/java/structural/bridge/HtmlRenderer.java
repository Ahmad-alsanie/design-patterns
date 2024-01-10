package structural.bridge;

// Concrete Implementer 1
public class HtmlRenderer implements Renderer {
    public void renderButton(String label) {
        System.out.println("<button>" + label + "</button>");
    }

    public void renderTextBox(String text) {
        System.out.println("<input type='text' value='" + text + "'/>");
    }
}

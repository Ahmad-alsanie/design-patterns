package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterFlyweight> chars = new ArrayList<>();
    private CharacterFactory factory = new CharacterFactory();

    public void addCharacter(char glyph, int fontSize, String fontFamily, int x, int y) {
        CharacterFlyweight character = factory.getCharacter(glyph, fontFamily, fontSize);
        chars.add(character);
        character.display(x, y);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addCharacter('a', 12, "Arial", 10, 10);
        editor.addCharacter('a', 12, "Arial", 15, 15);
        // Reuses the 'a' character flyweight
    }
}

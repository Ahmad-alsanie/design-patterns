package com.sanie.structural.flyweight;

public class Character implements CharacterFlyweight {
    private char glyph; // Intrinsic state
    private String fontFamily; // Intrinsic state
    private int fontSize; // Intrinsic state

    public Character(char glyph, String fontFamily, int fontSize) {
        this.glyph = glyph;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public void display(int positionX, int positionY) {
        System.out.println("Displaying character '" + glyph
                + "' at position (" + positionX + "," + positionY + ")");
    }
}

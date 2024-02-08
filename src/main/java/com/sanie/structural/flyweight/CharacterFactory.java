package com.sanie.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(char glyph, String fontFamily, int fontSize) {
        String key = "" + glyph + fontFamily + fontSize;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(glyph, fontFamily, fontSize));
        }
        return characters.get(key);
    }
}

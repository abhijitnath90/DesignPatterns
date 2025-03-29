package structural.flyweight.flyweightfactory;

import structural.flyweight.concreteflyweight.ConcreteCharacter;
import structural.flyweight.flyweightinterface.Character;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<java.lang.Character, Character> characterCache = new HashMap<>();

    public static Character getCharacter(char c) {
        //The below code simplifies to
        /*Character character = characterCache.get(c);
        if(character == null) {
            character = new ConcreteCharacter(c);
            characterCache.put(c, character);
        }
        return character;*/
        return characterCache.computeIfAbsent(c, ConcreteCharacter::new);
    }
}

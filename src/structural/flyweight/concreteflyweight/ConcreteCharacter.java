package structural.flyweight.concreteflyweight;

import structural.flyweight.flyweightinterface.Character;

public class ConcreteCharacter implements Character {

    private char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    @Override
    public void display(String font) {
        System.out.println("Character: "+character+", Font: "+font);
    }
}

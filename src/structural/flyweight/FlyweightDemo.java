package structural.flyweight;

import structural.flyweight.flyweightfactory.CharacterFactory;
import structural.flyweight.flyweightinterface.Character;

public class FlyweightDemo {

    public static void main(String[] args) {
        Character character1 = CharacterFactory.getCharacter('A');
        character1.display("Arial");
        Character character2 = CharacterFactory.getCharacter('B');
        character2.display("Times New Roman");
        Character character3 = CharacterFactory.getCharacter('A');
        character3.display("Calibri");
    }
}

package src.fabrics;

import src.enums.PetType;
import src.models.Cat;
import src.models.Dog;
import src.models.Hamster;
import src.models.Pet;

public class PetBuilder extends Builder {
    @Override
    protected Pet createNewPet(PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

}
package src.enums;

public enum PetType {
    Dog,
    Cat,
    Hamster;

    public static PetType getType(int typeId) {
        switch (typeId) {
            case 1:
                return PetType.Dog;
            case 2:
                return PetType.Cat;
            case 3:
                return PetType.Hamster;
            default:
                return null;
        }
    }
    
}

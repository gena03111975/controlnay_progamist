package src;

import src.controllers.PetController;
import src.models.Pet;
import src.repositories.IRepository;
import src.repositories.PetRepository;
import src.userinterfaces.ConsoleMenu;

public class Main {
    public static void main(String[] args) {
        IRepository<Pet> pet_system = new PetRepository();
        PetController controller = new PetController(pet_system);
        new ConsoleMenu(controller).start();
    }
}
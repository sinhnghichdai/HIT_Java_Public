import Bai1.Pet;
import Bai2.Cage;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {



        Pet dogA = new Pet("A", 12,"dog");
        Pet dogB = new Pet("B", 12,"dog");
        Pet dogC = new Pet("C", 12,"dog");

        ArrayList<Pet> petArrayListA = new ArrayList<>();
        ArrayList<Pet> petArrayListB = new ArrayList<>();

        petArrayListA.add(dogA);
        petArrayListA.add(dogC);



        Cage a = new Cage("0001", petArrayListA);
        Cage b = new Cage("0002", petArrayListB);

        System.out.println("Số lồng đã tạo " + b.getToolCages());
        a.addPet(dogD);
        a.printAllPets(dogA);
        a
    }
}
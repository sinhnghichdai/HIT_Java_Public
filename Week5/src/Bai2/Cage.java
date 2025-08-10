package Bai2;

import Bai1.Pet;

import java.util.ArrayList;

public class Cage {

    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int toolCages = 0;
    private final int MAX_CAPACITY = 3;



    public Cage(String cageCode, ArrayList<Pet> pets) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = this.pets.size();
        Cage.toolCages++;
    }

    public void addPet(Pet pet){
        if(pets.size() >= MAX_CAPACITY){
            System.out.println("Lồng đã đầy");
            return;
        }
        else {
            pets.add(pet);
            System.out.println("Thêm thành công");
        }
    }

    public void printAllPets(){
        for(Pet x: pets){
            System.out.println(x);
        }
        System.out.println();
    }


    public void printOverTen(){
        for(Pet x : pets){
            if(x.getWeight() > 10){
                System.out.println(x);
            }
        }
        System.out.println();
    }




    public Cage() {
        Cage.toolCages++;
    }


    public String getCageCode() {
        return cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public  int getToolCages() {
        return toolCages;
    }

    public static void setToolCages(int toolCages) {
        Cage.toolCages = toolCages;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }
}

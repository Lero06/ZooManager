/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;
import animals.animal_register;
import java.time.LocalDate;
/**
 *
 * @author llean
 */
public class zookeeper extends employee {
    private String speciality;
    private String[] log = new String[200];

    public String getSpeciality() {
        return speciality;
    }

    public int searchFree(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].isBlank()) {
                return i;
            }
        }
        return -1;
    }
    
     public String FeedAnimal(animal_register animal) {
        int i = searchFree(this.log);
        if ( i >= 0) {
            this.log[i] = "Se alimento a " + animal.getName();
        }
        return animal.getName() + " has been fed";
    }

    public String CheckHealth(animal_register animal) {
        int i = searchFree(this.log);
        if ( i >= 0) {
            this.log[i] = "Se reviso a " + animal.getName();
        }
        return animal.getName() + " is healthy";
    }
    
    public zookeeper( String ID, String name, LocalDate birthDate, String phone, int salary,String speciality) {
        super(ID, name, birthDate, phone, salary);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Zookeeper:"+super.toString() + "speciality=" + speciality ;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;
import java.time.LocalDate;
/**
 *
 * @author llean
 */
public class animal_register {
    //attributes
    private String id;
    private String name;
    private String specie;
    private LocalDate dateBirth;
    private animal_zone zone;
    //getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }
    //validations
    private static boolean verifyId(String id) {
        String regex = "^[A-Z]-\\d{4}$";
        return id.matches(regex);
    }
    private static boolean verifyDateBirth(LocalDate dateBirth) {
        return dateBirth.isBefore(LocalDate.now());
    }
    //setters
    public void setZone(animal_zone zone) {
        this.zone = zone;
    }

    public animal_register(String id, String nombre, String specie, LocalDate datebirth) {
       if(verifyId(id)) {
           this.id = id;
       }
        this.name = nombre;
        this.specie = specie;
        if(verifyDateBirth(dateBirth)) {
             this.dateBirth = datebirth;
        }
        this.zone = animal_zone.CONSERVATIONANDRESCUE;
    }

    @Override
    public String toString() {
        return "animal_register:" + "id=" + id + ", nombre=" + name + ", specie=" + specie + ", datebirth=" + dateBirth + ", zone=";
    }
    
    
    
    
}

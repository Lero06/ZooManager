/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author llean
 */
public class animal_register {
    //attributes
    private String id;
    private String nombre;
    private String specie;
    private LocalDateTime dateBirth;
    private animal_zone zone;
    //getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSpecie() {
        return specie;
    }

    public LocalDateTime getDateBirth() {
        return dateBirth;
    }
    //validations
    private static boolean verifyId(String id) {
        String regex = "^[A-Z]-\\d{4}$";
        return id.matches(regex);
    }
    private static boolean verifyDateBirth(LocalDateTime dateBirth) {
        return dateBirth.isBefore(LocalDateTime.now());
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZone(animal_zone zone) {
        this.zone = zone;
    }

    public animal_register(String id, String nombre, String specie, LocalDateTime datebirth) {
       if(verifyId(id)) {
           this.id = id;
       }
        this.nombre = nombre;
        this.specie = specie;
        if(verifyDateBirth(dateBirth)) {
             this.dateBirth = datebirth;
        }
        this.zone = animal_zone.CONSERVATIONANDRESCUE;
    }

    @Override
    public String toString() {
        return "animal_register:" + "id=" + id + ", nombre=" + nombre + ", specie=" + specie + ", datebirth=" + dateBirth + ", zone=";
    }
    
    
    
    
}

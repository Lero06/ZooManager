/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;
import java.time.LocalDate;
import Utils.UtilDate;

/**
 *
 * @author llean
 */
public abstract class person {
    private String ID;
    private String name;
    private LocalDate birthDate;
    private String phone;
    
     public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }
    
     public void setPhone(String phone) {
        this.phone = phone;
    }

     public int age (LocalDate birthdate) {
         return UtilDate.getAge(birthdate);
     }

    private static boolean verifyPhone(String phone) {
        String regex = "^\\d{2}-\\d{2}-\\d{2}-\\d{2}$";
        return phone.matches(regex);
    }
    
    public person(String ID, String name, LocalDate birthDate, String phone) {
        this.ID = ID;
        this.name = name;
        if(UtilDate.verifyDateBirth(birthDate))
        this.birthDate = birthDate;
        if(verifyPhone(phone)) {
                 this.phone = phone;
        }
    }
    
    public person(String ID, String name, LocalDate birthDate) {
        this.ID = ID;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
        return "person{" + "ID=" + ID + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + '}';
    }
    
}

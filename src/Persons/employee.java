/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author llean
 */
public abstract class employee {
    private String ID;
    private String name;
    private LocalDate birthDate;
    private String phone;
    private int salary;
    
    //getters

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

    public int getSalary() {
        return salary;
    }
    //setters

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    private static boolean verifyPhone(String phone) {
        String regex = "^\\d{2}-\\d{2}-\\d{2}-\\d{2}$";
        return phone.matches(regex);
    }
    
    public boolean verifyLegalAge(LocalDate birthdate) {
    Period edad = Period.between(birthdate,LocalDate.now());
    return edad.getYears() >= 18;
    }
    
    //constructor

    public  employee(String ID, String name, LocalDate birthDate, String phone, int salary) {
        this.ID = ID;
        this.name = name;
        if(verifyLegalAge(birthDate)) {
            this.birthDate = birthDate;
        }
        if(verifyPhone(phone)) {
             this.phone = phone;
        }
      if(salary>=300000){
        this.salary = salary;
      }
    }
    
    //toString

    @Override
    public String toString() {
        return "employee:" + "ID=" + ID + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + ", salary=" + salary ;
    }
    
    
}

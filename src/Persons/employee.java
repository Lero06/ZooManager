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
public abstract class employee extends person {
    private int salary;
    
    //getters
    public int getSalary() {
        return salary;
    }
    //setters
       public void setSalary(int salary) {
        this.salary = salary;
    }
       
    
    //constructor
    public employee( String ID, String name, LocalDate birthDate, String phone,int salary) {
        if (!UtilDate.verifyLegalAge(birthDate)) {
            throw new IllegalArgumentException("Employee must be at least 18 years old");
        }
        super(ID, name,birthDate, phone);
        if(salary>=300000){
        this.salary = salary;
      }
    }
    
    //toString
    @Override
    public String toString() {
        return "employee:" + super.toString() + "salary=" + salary + '}';
    }
}

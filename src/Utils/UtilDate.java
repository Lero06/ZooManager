/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author llean
 */
public abstract class UtilDate {
    
    public static int getAge (LocalDate age ) {
        return Period.between(age, LocalDate.now()).getYears();
    }
    
     public static boolean verifyLegalAge(LocalDate birthdate) {
    Period edad = Period.between(birthdate,LocalDate.now());
    return edad.getYears() >= 18;
    }
     
        public static boolean verifyDateBirth(LocalDate dateBirth) {
        return dateBirth.isBefore(LocalDate.now());
    }
}

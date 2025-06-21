/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;
import Persons.guide;
import Persons.visitor;
import animals.animal_register;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author llean
 */
public class Tour {
    private String[] log = new String[200];
    animal_register[] animals = new animal_register[10];
    visitor[] visitors = new visitor[10];
    
    public void animals(animal_register animal) {
        int max = animals.length;
        for (int i = 0; i < max; i++) {
             if(log[i]==null || log[i].isBlank()) {
                 animals[i] = animal;
             }
        }
    }
    
    public void visitors(visitor visitor) {
        int max = visitors.length;
        for (int i = 0; i < max; i++) {
             if(log[i]==null || log[i].isBlank()) {
                   visitors[i] = visitor;
             }
        }
    }
    
    public void tourLog(guide guide) {
    int max = log.length;
        for (int i = 0; i < max; i++) {
             if(log[i]==null || log[i].isBlank()) {
                  log[i]= guide.getID() + "/" + LocalDate.now() + "/" + Arrays.toString(visitors) + "/" + Arrays.toString(animals); 
             }
        }
    }
}

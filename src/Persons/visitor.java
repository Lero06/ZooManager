/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

import java.time.LocalDate;

/**
 *
 * @author llean
 */
public class visitor extends person {
    private String[] log = new String[200];

    public visitor(String ID, String name, LocalDate birthDate, String phone) {
        super(ID, name, birthDate, phone);
    }
    
        public visitor(String ID, String name, LocalDate birthDate) {
        super(ID, name, birthDate);
    }
    
        public void visitorLog() {
            int max = log.length;
            for (int i = 0; i < max; i++) {
                 if(log[i]==null || log[i].isBlank()){
                     log[i] = super.getID() +"/"+ LocalDate.now();
                 }
            }
        }
        
}

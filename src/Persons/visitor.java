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

    public visitor(String ID, String name, LocalDate birthDate, String phone) {
        super(ID, name, birthDate, phone);
    }
    
        public visitor(String ID, String name, LocalDate birthDate) {
        super(ID, name, birthDate);
    }
    
}

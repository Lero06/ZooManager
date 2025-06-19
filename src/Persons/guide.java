/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

import java.time.LocalDate;
import animals.animal_register;
/**
 *
 * @author llean
 */
public class guide extends employee{
    private String[] languages = new String[20];
    private String[] log = new String[200];

    public String[] getLanguagues() {
        return languages;
    }
public boolean addLangages(String idioma){
          int max = languages.length;
          for (int i = 1; i < max ; i++) {
              if(languages[i]==null){
                  languages[i]=idioma;
                  return true;
              }
          }
          return false;
    }

public String tour() {
   return "Se realizo el tour";
}

public void tourlog() {
         int max = log.length;
        for (int i = 0; i < max; i++) {
            if(log[i]==null || log[i].isBlank()){
                this.log[i] = tour()+"["+i+"]";
            }
        }
    }

public String animalInfo(animal_register animal) {
    return "Informacion acerca de este animal: "+ animal.toString();
}
    public guide(String ID, String name, LocalDate birthDate, String phone, int salary) {
        super(ID, name, birthDate, phone, salary);
        this.languages[0] = "spanish";
    }

    @Override
    public String toString() {
        return "guide:" +super.toString()+ "languages=" + languages.toString();
    }
    
    
    
    
}

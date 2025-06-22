/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import animals.animal_register;
import Persons.guide;
import Persons.zookeeper;
import java.time.LocalDate;
import java.util.Arrays;
import Persons.visitor;
import Tours.Tour;
/**
 *
 * @author llean
 */
public class zoo {
    private static animal_register[] animalList = new animal_register[200];
    private static guide[] guideList = new guide[200];
    private static zookeeper[] zookeeperList = new zookeeper[200];
    private static String[] zookeeperActivities = new String[200];
    private static String[] guideActivities = new String[200];
    private static String[] visitorActivities = new String[200];
    
    // Agregar, buscar y mostrar animales.
     public static int findFree(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static boolean addAnimal(String id, String name, String species, LocalDate birthDate) {
        animal_register a = new animal_register(id, name, species, birthDate);
        int i = findFree(animalList);
        if (i >= 0) {
            animalList[i] = a;
            return true;
        }
        return false;
    }
    public static animal_register searchAnimal(animal_register id) {
        int max = animalList.length;
        for (int i = 0; i < max; i++) {
            if (animalList[i] == id || animalList[i] != null) {
                return animalList[i];
                }
             }
        return null;
         }
    
    public static String showAnimal() {
                  String show = Arrays.toString(animalList);
                  return show;
    }
    //Agregar empleados (cuidador o guía).
        public static boolean addGuide(String id, String name, LocalDate birthDate, String phoneNum, int Salary) {
        guide g = new guide(id, name, birthDate, phoneNum, Salary);
        int i = findFree(guideList);
        if (i >= 0) {
            guideList[i] = g;
            return true;
        }
        return false;
    }

    public static boolean addZookeeper(String id, String name, LocalDate birthDate, String phoneNum, int salary, String speciality) {
        zookeeper z = new zookeeper(id, name, birthDate, phoneNum, salary, speciality);
        int i = findFree(zookeeperList);
        if (i >= 0) {
            zookeeperList[i] = z;
            return true;
        }
        return false;
    }
    //Registrar actividades de los cuidadores.
  public static boolean registerZookeeperActivity(zookeeper zookeeper){
        int max = zookeeperActivities.length;
        for (int i = 0; i < max; i++) {
            if (zookeeperActivities[i]==null){
                String zklog = Arrays.toString(zookeeper.getLog());
                    zookeeperActivities[i] = zklog;
                    return true;
            }
        }
        return false;
    }
    //Registrar recorridos realizados por los guías.
    public static boolean registerGuideActivity(guide guide){
        int max = guideActivities.length;
        for (int i = 0; i < max; i++) {
            if (guideActivities[i]==null){
                String gklog = Arrays.toString(guide.getLog());
                    guideActivities[i] = gklog;
                    return true;
            }
        }
        return false;
    }
    //Registrar visitas de los visitantes.
        public static boolean registerVisitActivity(visitor visitor){
        int max = visitorActivities.length;
        for (int i = 0; i < max; i++) {
            if (visitorActivities[i]==null){
                String gklog = Arrays.toString(visitor.getLog());
                    visitorActivities[i] = gklog;
                    return true;
            }
        }
        return false;
    }
       // Recorridos realizados por un guía.
        public static String showGuideLog(guide guideLog) {
            return Arrays.toString(guideLog.getLog());
        }
        //Actividades realizadas por un cuidador.
         public static String showZookeeperLog(zookeeper zookeeperLog) {
            return Arrays.toString(zookeeperLog.getLog());
        }
        //Animales observados en un recorrido.
         public static String showAnimalsTour(Tour animal) {
            return Arrays.toString(animal.getAnimals());
        }
    }
    


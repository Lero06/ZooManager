/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package animals;

/**
 *
 * @author llean
 */
public enum animal_zone {
    CONSERVATIONANDRESCUE("conservation_and_rescue"),
    FARM("farm"),
    CONTACT("contact"),
    FEEDING("feeding"),
   NIGHTTUNNEL("night_tunnel"),
   LOCALBIODIVERSITY("Local_Biodiversity.");

   private final String status;

    public String getStatus() {
        return status;
    }

    private animal_zone(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
   
}

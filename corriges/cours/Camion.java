/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.cours;


public class Camion extends Vehicule {

    @Override
    public void rouler() {
        this.compteurKilometrique++;
        System.out.println("Je transporte des marchandises.");
    }
    
}

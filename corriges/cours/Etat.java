/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.cours;

/**
 *
 * @author francois
 */
public enum Etat {
    
    DEMARRAGE(true), ARRET(false), PAUSE(false), AVANCE_RAPIDE(true);
    
    private boolean actif = false;
    
    private Etat(boolean actif){
        this.actif = actif;
    }
    
    public boolean isActif(){
        return this.actif;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.cours.nouveau;

import corriges.cours.Etat;

/**
 *
 * @author francois
 */
public class ClasseAvecEnum {
    
    private EtatPropre etatEnCours;
    
    public EtatPropre getEtat(){
        return this.etatEnCours;
    }
    
    public void demarre(){
        this.etatEnCours = EtatPropre.DEMARRAGE;
    }
    
    public void stop(){
        if(etatEnCours == EtatPropre.ARRET){
            //Je ne fais rien
            return;
        }else{
            //Je fais des opération compliquées...
            this.etatEnCours = EtatPropre.ARRET;
        }
    }
    
    public enum EtatPropre{
        DEMARRAGE, ARRET;
    }
    
    public enum EtatPropre2{
        DEMARRAGE, ARRET;
    }
    
    
    
}

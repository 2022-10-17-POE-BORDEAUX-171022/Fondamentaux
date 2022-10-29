/**
 * Exemple sur les enuméartions
 */

package corriges.cours;

// Enumeration

import corriges.cours.nouveau.ClasseAvecEnum;

// Avec enum on ne cree pas autant de constante qu'il y a de jours.
// On cree un ensemble de constantes affectees a un seul nom.

// Classe principale
public class Enumerations {
    // Methode
    

    // Methode principale
    public static void main(String[] args) {
        
        //Utilisation d'un classe ayant des valeurs static final (à ne plus
        // utiliser depuis l'apparition des enums)
        String unEtat = MesValeursFixes.ETAT_ACTIF;
        
        //Utilisation de Enum avec IF
        Activite etat = Activite.ETAT_INACTIF;
        if(etat == Activite.ACTIF_POUR_DE_VRAI){
            System.out.println("Est actif");
        }else if(etat == Activite.ETAT_INACTIF){
            System.out.println("Est inactif");
        }else if(etat == Activite.NE_SAIT_PAS){
            System.out.println("Ne sait pas");
        }
        
        //Utilisation de Enum avec switch
        switch(etat){
            case ACTIF_POUR_DE_VRAI :
                System.out.println("Est actif");
                break;
            default : 
                System.out.println("N'est pas actif ou ne sait pas");
        }
        
        //Récupération de toutes les valeurs possibles d'enum avec la méthode .values()
        Etat etatEnCours = Etat.AVANCE_RAPIDE;
        for(Etat etatDansBoucle : Etat.values()){
            System.out.println("L'état vaut : " + etatDansBoucle);
        }
        
        //Utilisation de .ordinal sur une valeur de l'enum (à éviter fonctionnellement : l'ordre peut changer)
        System.out.println("ordinal vaut : " +Activite.ACTIF_POUR_DE_VRAI.ordinal());
        
        //Mise de l'enum dans une classe pour gérer un état interne
        //l'enum n'est plus accessible en modification, elle a été encapsulée.
        ClasseAvecEnum objet = new ClasseAvecEnum();
        objet.demarre();
        System.out.println("Le pojo est à l'état :" + objet.getEtat() );
        objet.stop();
        System.out.println("Le pojo est à l'état :" + objet.getEtat() );
        
        
        
        
    }
}
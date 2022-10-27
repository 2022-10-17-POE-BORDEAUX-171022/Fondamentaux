/**
 * Exercice Heritage
 * 
 * Definissez une classe Cercle. Les objets construits a partir de cette classe
 * seront des cercles de tailles variees. En plus de la methode constructeur
 * (qui utilisera donc un parametre rayon), vous definirez les methodes surface et perimetre
 * qui devront renvoyer la surface et le perimetre du cercle.
 * Definissez ensuite une classe Cylindre derivee de la precedente.
 * Le constructeur de cette nouvelle classe comportera les deux parametres rayon et hauteur.
 * Vous y ajouterez une methode volume qui devra renvoyer le volume du cylindre
 * (rappel : volume d'un cylindre = surface de section x hauteur).
 */

package corriges.exercices.heritage;

// Classe principale
public class ExHeritage2 {
    public static void main(String[] args) {
        
        Cylindre cylindre = new Cylindre(3, 4);
        System.out.println("La surface du cylindre vaut " + cylindre.surface());
        
        Cercle cercleQuiEstEnFaitUnCylindre = cylindre;
        System.out.println("La surface du cercle qui est en fait un cylindre vaut " + cercleQuiEstEnFaitUnCylindre.surface());
        System.out.println("Le volume  du cylindre vaut " + cylindre.volume());
        
        Cercle cercle = new Cercle(4);
        System.out.println("Le perimetre du cercle vaut  " + cercle.perimetre());
        
        
    }
    
    
    
    
}
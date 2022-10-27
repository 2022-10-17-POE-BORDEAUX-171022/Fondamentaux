/**
 * Exemple sur l'abstraction et le polymorphisme
 */

package corriges.cours;

public class AbstractionPolymorphisme {
    public static void main(String[] args) {
        
	// Appel de la methode rouler() possible 
	// car rouler() a ete declaree dans Vehicule.
	// A l'execution, c'est la methode definie 
	// sur l'objet reel qui est appelee ! -> Polymorphisme.
        Voiture voiture = new Voiture();
        voiture.rouler();
        
        Vehicule vehiculeVoiture = voiture;
	// Appel de la methode definie dans la classe abstraite Vehicule
	// mais executee sur la classe voiture (polymorphisme).
        vehiculeVoiture.rouler();
        
        Camion camion = new Camion();
        camion.rouler();
        
    }
}
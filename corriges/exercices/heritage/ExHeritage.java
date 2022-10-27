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

// Classe Cercle

import cours_exercices.exercices.hertiage.*;
import cours_exercices.exercices.hertiage.autre.CompteBancaire;
import cours_exercices.exercices.hertiage.autre.CompteEntreprise;

    // Propriete
    
    // Constructeur
    
    // Getters
    
    // Setters
    
    // Methodes

// Classe Cylindre
    // Propriete
    
    // Constructeur
    
    // Getters
    
    // Setters
    
    // Methode

// Classe principale
public class ExHeritage {
    public static void main(String[] args) {
        
        //Compte compte = new Compte();
        //System.out.println(compte.calculeInterets());
        
        CompteBancaire compteBancaire = new CompteBancaire();
        System.out.println(compteBancaire.calculeInterets());
        
        CompteBancaire compteBancaire2 = new CompteBancaire();
        Compte compte3 = new CompteBancaire();
        
        
        Compte compte2 = compteBancaire2;
        
        compteBancaire2.methodeEnPlus();
        compteBancaire2.calculeInterets();
        compteBancaire2.methodeNonSurchargee();
        
        
       // System.out.println(compteBancaireCache.calculeInterets());
        
        
        System.out.println("\n\nCréation de la banque");
        Banque banque = new Banque();
        banque.setCompte(new CompteBancaire());
        banque.afficheLeCompte();
        
        //banque.setCompte(new Compte());
        banque.afficheLeCompte();
    }
    
    
    
    
}
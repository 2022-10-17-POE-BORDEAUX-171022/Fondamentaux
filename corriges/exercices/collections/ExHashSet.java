/**
/**
 * Exercice Collections
 *
 * Creer une liste vide
 * Ajouter des elements de type String a cette liste
 * Inserer un element au debut de la liste
 * Afficher le nombre d'element contenu dans la liste
 * Afficher la liste
 * Modifier un element par une autre valeur
 * Parcourir la liste et afficher ses elements un par un
 * Supprimer un element de la liste et reafficher la liste
 */
package corriges.exercices.collections;

// Classe principale

import java.util.HashSet;


public class ExHashSet {

    public static void main(String args[]) {
         HashSet<Boolean> hashSet = new HashSet<>();
        // Ajouter des doublons
        hashSet.add(Boolean.TRUE);
        hashSet.add(Boolean.FALSE);
        hashSet.add(Boolean.TRUE);
        
        // Afficher la taille du set
        System.out.println("La taille du set vaut  : " + hashSet.size());
        
        //Affichage du set (parcours de chaque élément)
        for(Boolean bool : hashSet){
            System.out.println("Le booléen vaut :  " + bool);
        }
        
        // Suppression d'un élément
        hashSet.remove(Boolean.FALSE);
        
        // Parcour avec la methode ForEach() et une lambda
        hashSet.forEach(System.out::println);
        
    }

   

}

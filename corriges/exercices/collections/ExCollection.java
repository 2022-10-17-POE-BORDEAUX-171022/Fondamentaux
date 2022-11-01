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
import corriges.tp.Dirigeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ExCollection {

    public static void main(String args[]) {
        // Creer un ArrayList
        List<Dirigeable> dirigeables = new ArrayList<>();

        // Ajouter des elements a l'ArrayList
        dirigeables.add(new Dirigeable("Premier dirigeable"));
        dirigeables.add(new Dirigeable("Second dirigeable"));
        dirigeables.add(1, new Dirigeable("Troisième dirigeable"));

        // Insertion d'un element au debut de la liste
        // Afficher la taille de la liste
        System.out.println(
                "La taille de la liste vaut : " + dirigeables.size());
        // Afficher l'ArrayList
        affiche(dirigeables);
        // Modification d'un element de la liste

        dirigeables.set(
                1, new Dirigeable("Troisième dirigeable! "));

        // Parcour de la liste
        affiche(dirigeables);
        // Supprimer des elements de l'ArrayList
        dirigeables.remove(0);

        for (Iterator<Dirigeable> iterator = dirigeables.iterator(); iterator.hasNext();) {
            Dirigeable dirigeable = iterator.next();
            System.out.println("Je suis dans ITerator et je boucle : " + dirigeable.getIdentifiant());
            if (dirigeable.getIdentifiant().equals("Second dirigeable")) {
                iterator.remove();
            }
        }

        Predicate<Dirigeable> predicate = (dirigeable) -> {
            return "Second dirigeable".equals(dirigeable.getIdentifiant());
        };

        dirigeables.removeIf((dirigeable)
                -> "Second dirigeable".equals(dirigeable.getIdentifiant())
        );

        // Afficher l'ArrayList
        // Parcour avec la methode ForEach() et une lambda
        dirigeables.forEach((dirigeable) -> {
            System.out.println("Je suis une lambda qui affiche " + dirigeable.getIdentifiant());
        });

    }

    private static void affiche(List<Dirigeable> dirigeables) {
        System.out.println("\n\nJ'itère sur ma liste");
        for (Dirigeable dirigeable : dirigeables) {
            System.out.println(dirigeable.getIdentifiant());
        }
    }

}

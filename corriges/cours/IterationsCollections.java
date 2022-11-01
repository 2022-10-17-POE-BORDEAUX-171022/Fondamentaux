/**
 * Exemple sur l'iteration de collection
 */
package corriges.cours;

// Classe principale
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
// Classe principale

public class IterationsCollections {

    public static void main(String[] args) {
        // LIST
        // Creation d'une liste de type List
        List<String> maPremiereListe = new ArrayList<>();

        maPremiereListe.add(new String("sdd"));
        maPremiereListe.clear();

        maPremiereListe.add("Element 1");
        maPremiereListe.add(0, "Element 2");
        maPremiereListe.add("Element 3");
        System.out.println(maPremiereListe.size());

        String monElement = maPremiereListe.get(0);
        System.out.println("Mon élément à l'index 0 vaut : " + monElement);

        // Utilisation de l'interface Iterator
        // Recuperation d'un "Iterator" sur la liste voulue
        // Parcours de la liste. La methode hasNext() verifie s'il y a encore un element dans la liste
        for (Iterator<String> ite = maPremiereListe.iterator(); ite.hasNext();) {
            System.out.println("Avec iterator : " + ite.next());
        }

        // Parcours de la liste avec une boucle for classique 
        for (int i = 0; i < maPremiereListe.size(); i++) {
            System.out.println("Avec un index : " + maPremiereListe.get(i));
        }

        // Parcours de la liste avec une boucle for "intelligente"
        // Note : utilise l'itérateur
        for (String string : maPremiereListe) {
            System.out.println("Avec un for intelligent" + string);
        }

        // Parcours de la liste avec une methode forEach() 
        // La fonction donnee dans forEach est une fonction lambda
        maPremiereListe.forEach((s) -> System.out.println("Avec une lambda" + s));

        /// MAP
        // Creation d'une Map (notez les deux types génériques : le premier
        // pour la clé, le second pour la valeur)
        Map<Integer, String> maPremiereMap = new HashMap();

        // La methode put permet de charger un ensemble cle / valeur
        maPremiereMap.put(1, "Valeur 1");
        maPremiereMap.put(2, "Valeur 2");
        maPremiereMap.put(3, "Valeur ... 3");

        // Parcours d'une Map avec la boucle "intelligente"
        for (Entry<Integer, String> entry : maPremiereMap.entrySet()) {
            System.out.println("sur la map dans une boucle intelligente : clé = " + entry.getKey() + " , valeur = " + entry.getValue());
        }

        // Parcours avec la methode forEach
        maPremiereMap.forEach((cle, valeur) -> {System.out.println("sur la map avec un foreach : clé = " + cle + " , valeur = " + valeur);});
    }
}

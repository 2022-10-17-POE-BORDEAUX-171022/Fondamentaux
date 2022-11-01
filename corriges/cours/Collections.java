package corriges.cours;

// Classe principale
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// Classe principale

public class Collections {

    public static void main(String[] args) {
        /// LIST
        // Creation d'une liste de type List
        List<String> chainesDeCaracteres = new ArrayList<>();

        // Ajout d'un element au premier index disponible
        chainesDeCaracteres.add("Première chaîne de caractères.");

        // Insert un element a l'index voulu
        chainesDeCaracteres.add(0, "Deuxième chaîne de caractères");

        // Creation d'une autre liste de type List charge avec le contenu de la premiere
        List<String> chainesDeCaracteresCopies = new ArrayList<>(chainesDeCaracteres);
        chainesDeCaracteresCopies.add("Hello !");

        // Parcours avec une boucle for intelligente
        for (String string : chainesDeCaracteres) {
            System.out.println("Dans ma première liste , j'ai " + string);
        }

        for (String string : chainesDeCaracteresCopies) {
            System.out.println("Dans ma deuxieme liste , j'ai " + string);
        }

        // Parcour avec la methode ForEach() et une lambda
        chainesDeCaracteres.forEach((e) -> {
            System.out.println(e);
        });

        // Acces a un element de la liste via son index
        System.out.println(chainesDeCaracteres.get(0));

        // Recupere le premier index de la liste ayant pour valeur "valeur 1"
        System.out.println(chainesDeCaracteres.indexOf("valeur 1"));

        // Recupere le dernier index de la liste ayant pour valeur "valeur 1"
        System.out.println(chainesDeCaracteres.lastIndexOf("valeur 1"));

        // Recherche de l'existence d'un element dans une liste
        System.out.println(chainesDeCaracteres.contains("valeur 1"));

        // Taille de la liste
        System.out.println(chainesDeCaracteres.size());

        // Suppression de l'element a l'index 1
        chainesDeCaracteres.remove(1);

        // Suppression de l'element ayant la valeur "Valeur doublon"
        chainesDeCaracteres.add("Valeur doublon");
        chainesDeCaracteres.add("Valeur doublon");
        chainesDeCaracteres.add("Valeur doublon");
        chainesDeCaracteres.add("Valeur doublon");
        afficheIterable(chainesDeCaracteres);

        // Suppression de tous les elements de la liste
        //chainesDeCaracteres.clear();
        /// SET
        // Definition d'une collection Set
        Set<String> setDeChainesDeCaracteres = new HashSet<>();

        // Charge monAutreListe de type List dans monSet de type Set
        setDeChainesDeCaracteres.addAll(chainesDeCaracteres);

        // Affichage du Set, on s'apercoit qu'il n'y a plus de doublons
        afficheIterable(setDeChainesDeCaracteres);

        // Tableau de String charge
        String[] tableauDeString = {"Valeur 1", "Valeur 2", "Valeur 3"};

        // Conversion du tableau en liste de type List
        List<String> tableauDeStringAsList = Arrays.asList(tableauDeString);

        // Affichage de la nouvelle liste
        afficheIterable(tableauDeStringAsList);

        // Creation d'une liste de type List 
        // Conversion en Set d'une liste d'int de type List, il n'y a plus de doublons
        // Ajout de la valeur 5, mais elle existe deja
        Set<Integer> setIntegers = new HashSet<>();
        setIntegers.add(Integer.valueOf(3));
        setIntegers.add(Integer.valueOf(3));
        setIntegers.add(Integer.valueOf(3));
        setIntegers.add(Integer.valueOf(3));
        afficheIterable(setIntegers);

        // Creation d'une liste de type List 
        // Conversion en Set d'une liste de String de type List, il n'y a plus de doublons
    }

    public static void afficheIterable(Iterable<?> affichable) {
        System.out.println("\n\n");
        for (Object object : affichable) {
            System.out.println("J'affiche dans afficheIterable : " + object);
        }
    }
}

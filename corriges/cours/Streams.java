/**
 * Exemple sur les stream
 */
package corriges.cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String... args) {
        // creer un tableau
        int[] tableauInt = {1, 3, 5};
        Integer[] tableauInteger = {2, 4, 6};
        
        // creer une liste de string        
        List<String> liste = new ArrayList<>();
        liste.add("Valeur 10");
        liste.add("Valeur 11");
        liste.add("Valeur 12");
        
        // transforme une liste en stream
        
        
        // operations intermediaires
        // transforme un stream en une collection
        List<String> listeFiltree = liste.stream().filter(s -> s.equals("Valeur 10")).toList();

        // creer un stream du tableau de int
        Arrays.stream(tableauInt);
        
        // creer un stream du tableau de Integer
        Arrays.stream(tableauInteger);
        
        // transforme un IntStream en Stream de Integer
        Arrays.stream(tableauInt).boxed();

        // transforme un Stream en une collection
        Arrays.stream(tableauInt).boxed().collect(Collectors.toSet());
        
        // creer un stream manuellement.
        Stream.iterate(1, i->i<10, i->i+3).forEach(System.out::println);
        
        // genere un stream d'int de 1 � 4.
        Stream.iterate(1, i->i<5, i->i+1).forEach(System.out::println);
        
        // genere un stream d'int de 1 � 5.
        // affiche un stream ou une collection
        Stream.iterate(1, i->i<6, i->i+1).forEach(System.out::println);
        
        // genere un stream selon une formule donnee
        // exemple les 10 premiers nombres impairs
        Stream.iterate(1, i->i<20, i->i+2).forEach(System.out::println);
        
    }
}

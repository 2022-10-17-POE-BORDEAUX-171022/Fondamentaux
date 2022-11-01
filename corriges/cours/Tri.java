package corriges.cours;

// Classe principale

import corriges.tp.Dirigeable;
import java.util.Set;
import java.util.TreeSet;



public class Tri {

    public static void main(String[] args) {
        
      //L'instanciation de TreeSet nous permettra de trier nos dirigeables.
      //Le TreeSet est une collection ordonnée et triée, qui 
      //met le dirigeable au bon endroit à chaque appel à add.
      //Le 'bon' endroit est celui définit par le Comparator que l'on passe
      //en paramètre du constructeur. Un Comparateur est une classe qui implémente
      //l'interface Comparable.
      Set<Dirigeable> dirigeables  = new TreeSet<>(new DirigeableComparator());
      //Cette interface étant une interface fonctionnelle, on peut utiliser une lambda
      //pour créer un Comparable.
      Set<Dirigeable> dirigeables2  = new TreeSet<>((o1,o2)->o1.getIdentifiant().compareTo(o2.getIdentifiant()));
      dirigeables.add(new Dirigeable("aaa"));
      dirigeables.add(new Dirigeable("zzz"));
      dirigeables.add(new Dirigeable("bbb"));
        
      for(Dirigeable d : dirigeables){
          System.out.println("J'itère sur le dirigeable : " + d.getIdentifiant());
      }
        
    }
    
    
}

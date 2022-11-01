package corriges.cours;

import corriges.tp.Dirigeable;
import java.util.Comparator;

/**
 *Cette classe implémente Comparator, elle DOIT implémenter
 * la méthode compare. Elle est typée avec le type Dirigeable
 */
public class DirigeableComparator implements Comparator<Dirigeable> {

    //Cette méthode compare o1 et o2. Si on veut obéir au contrat de Comparator,
    //il faut que cette méthode renvoie -1 si o1 est plus 'petit' que o2 (ou si o1
    //doit être placé avant o2 lors du tri. 0 si o1 == o2, et 1 si o1 est plus 'grand'
    //que o2 (ou si o1 doit être placé après o2 lors du tri).
    @Override
    public int compare(Dirigeable o1, Dirigeable o2) {
       return  o1.getIdentifiant().compareTo(o2.getIdentifiant());
    }

    
}

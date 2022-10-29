/**
 * Exemple sur les expressions lambda
 */

package corriges.cours;
// Interface fonctionnelle

import corriges.cours.nouveau.OperationDouble;
import corriges.cours.nouveau.OperationMultipliePar4;
import java.util.ArrayList;


// Classe principale
public class Lambda {
    
    // Methode principale
    public static void main(String args[]) {
        
        //Il y a trois manières d'implémenter notre interface
        //OperationUnitaire, qui est une interface fonctionnelle
        //puisqu'elle n'a qu'une seule méthode.
        
        //1. Utilisation d'une classe qui implémente notre interface fonctionnelle
        OperationDouble operation = new OperationDouble();
        afficheOperation(operation, 4);
        afficheOperation(new OperationMultipliePar4(), 4);
       
        
        //2. Utilisation d'une classe 'inline' : une classe déclarée en ligne, 
        //qui implémente notre interface fonctionnelle.
        OperationUnitaire operationCarre = new OperationUnitaire() {
            @Override
            public double effectueOperation(double d) {
                return d * d;
            }
        };
        afficheOperation(operationCarre, 7);
       
        
        //3. Utilisation d'une lambda : une classe créée pour nous
        //afin de réduire le code à écrire (et à lire)
        OperationUnitaire operationCube = (double paramD) -> {return paramD * paramD* paramD;};
        afficheOperation(operationCube, 7);
        
        double valeur = 3;
        OperationSansArgument operationGenereUnDouble = () -> {return valeur;};
        
        // La lambda indique au compilateur qu'il doit créer une classe.
        // Cette classe doit implémenter une interface définie par le type de la variable dans laquelle.
        // a lambda est stockée, 
        // ou le type de l'argument de la méthode. Donc le compilateur connaît l'interface.
        // Le compilateur retrouve la méthode que l'on définit, parce que l'interface ne contient qu'une
        // seule méthode.
        // Le compilateur connaît le type retour et le, ou les arguments (s'ils existent), parce qu'il 
        // connaît la signature de la méthode.
        // Avec tout ceci, le compilateur connaît la classe, la méthode , et on lui fournit le coeur de la méthode :
        // Il peut donc créer une classe qui implémente notre interface (fonctionnelle).
        
        afficheOperation(operationGenereUnDouble);
        
        afficheOperation(() -> {return 4;});
        
        // Quelques lambdas
        // Sans declaration de type, ni return, ni accolade
        OperationUnitaire operation4 = (a) -> a * 4;
        
        // Avec 'return' et les accolades
        OperationUnitaire operation5 = (a) -> {return a * 5;};

        // Sans 'return' et sans les accolades
        OperationUnitaire operation6 = (double a) ->  a * 5;

        
    }

    
    // Methode statique appelant la methode calc de notre objet fourni en parametres
    static void afficheOperation(OperationUnitaire operation, double value){
        System.out.println("J'effectue une opération avec argument : "+ operation.effectueOperation(value));
    }

    
    static void afficheOperation(OperationSansArgument operation){
        System.out.println("J'effectue une opération sans argument : "  + operation.effectueOperation());
    }

    
}
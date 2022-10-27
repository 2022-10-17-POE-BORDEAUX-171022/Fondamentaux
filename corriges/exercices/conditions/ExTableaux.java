/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Creer un autre tableau ayant un element de plus que le premier initialiser a 0.
* 3. Afficher les elements du premier tableau.
* 4. Afficher les elements du 2eme tableau.
* 5. Copier les valeurs du premier tableau dans le second et inserer une valeur arbitraire a la 3eme position.
* 6. Afficher le tableau apres l'operation d'insertion.
 */
package corriges.exercices.conditions;

// Classe principale

import cours_exercices.exercices.tableaux.*;
// Classe principale
public class ExTableaux {

    public static void main(String[] args) {
        int[] monTableau = new int[]{1, 1, 2, 3, 5, 8, 13, 21};
        int[] secondTableau = new int[monTableau.length + 1];

        afficheTableau(monTableau, "monTableau");

        // Afficher les elements du nouveau tableau
        afficheTableau(secondTableau, "secondTableau");

        // Copie des elements du premier tableau
        // et insertion d'un element a la 3eme position
        for (int i = 0; i < monTableau.length; i++) {
            secondTableau[i] = monTableau[i];
        }
        secondTableau[2] = -43847;

        // Afficher le tableau apres l'operation d'insertion
        afficheTableau(secondTableau, "secondTableau");

        // Messaged de fin
    }
    
    static void afficheTableau(int[] tableau, String nomTableau){
        for (int elementDeMonTableau : tableau) {
            System.out.println(nomTableau + " a l'élément : " + elementDeMonTableau);
        }
    }
    
}

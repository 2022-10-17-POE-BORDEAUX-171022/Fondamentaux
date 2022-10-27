/**
 * Exemple sur les tableaux
 */
package corriges.cours;

// Classe principale

public class Tableaux {

    public static void main(String[] args) {
        // Declaration d'un tableau sans l'alimenter
        int[] monPremierTableau = new int[3];

        // Affectation des valeurs a un tableau
        // Remarque : le premier indice du tableau est 0
        monPremierTableau[0] = 13;
        monPremierTableau[1] = 26;

        int premiereValeurDuTableau = monPremierTableau[0];
        // Affichage d'une valeur d'un tableau
        System.out.println("La valeur de l'index 0 du tableau vaut : " + premiereValeurDuTableau);
        System.out.println("La valeur de l'index 1 du tableau vaut : " + monPremierTableau[1]);
        System.out.println("La valeur de l'index 2 du tableau vaut : " + monPremierTableau[2]);

        // Affichage d'une valeur non attribue d'un tableau (cela est egale a null)
        String[] tableauDeString = new String[2];
        System.out.println("La valeur de l'index 0 du tableau de string vaut : " + tableauDeString[0]);
        tableauDeString[1] = "Salut";
        System.out.println("La valeur de l'index 1 du tableau de string vaut : " + tableauDeString[1]); 

        // Vouloir acceder a un index non inclus dans un tableau genere une exception
        //String valeurMystere = tableauDeString[2];
        
        // Declaration d'un tableau sans declarer son nombre d'elements et alimente directement
        String[] tableauDirectementRempli = {"maValeur1","maValeur2", null, "maValeur3"};
        for(String valeurIteree: tableauDirectementRempli){
            System.out.println("La valeur du tableau directement rempli est : " + valeurIteree);          
        }

        // Parcours du tableau pour afficher les elements
        for(int i=0; i < tableauDeString.length; i++){
            System.out.println("Dans la boucle, la valeur de l'élément : "  + i + " de tableauDeString est : " + tableauDeString[i]);
        }
        for(String valeurIteree : tableauDeString){
            System.out.println("Dans la boucle intelligente, la valeur du tableauDeString est : " + valeurIteree );
        }
        
        // Tableau a deux dimensions
        String[][] stringMatrix = new String[4][7];
        
        // Affichage des dimensions du tableau
        for(int i=0 ; i < 4; i++){
            for(int j=0; j<7;j++){
                stringMatrix[i][j] = "Ligne " + i +" , colonne " + j;
                System.out.println("La valeur du tableau à deux dimensions vaut : " + stringMatrix[i][j]);
            }
        }
        
        // Parcours du tableau pour afficher le contenu.
        for(String[] ligne : stringMatrix){
            for(String cellule : ligne){
                System.out.println("Cellule vaut : " + cellule);
            }
        }
    }
}

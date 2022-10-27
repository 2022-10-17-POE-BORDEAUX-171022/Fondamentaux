
package corriges.cours;

//Classe dans le même package


public class UtilisateurMemePackage {
    
    public static void main(String[] args) {
        Classes classes = new Classes();
        //Fonctionne car on est dans le même package et
        //la visibilité est package
        classes.nomPackage = "Nouveau nom";
        
        // Ne fonctionne pas car la visibilité de nomSecret est private
        //et que l'on est hors de la classe
        //classes.nomSecret = "Nouveau nom secret";
    }
    
}

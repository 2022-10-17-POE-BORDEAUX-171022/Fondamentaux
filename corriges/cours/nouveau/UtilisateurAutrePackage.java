
package corriges.cours.nouveau;

import corriges.cours.Classes;

public class UtilisateurAutrePackage {

    public static void main(String[] args) {
        Classes mc = new Classes("superSecret");
        mc.afficheNomSecret();
        //Ne fonctionne pas car la variable a la visibilité
        //package et que nous ne sommes pas dans le même package
        //mc.nomPackage = "nouveau nom";

    }

}

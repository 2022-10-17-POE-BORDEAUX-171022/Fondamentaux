/**
 * Exemple sur les exceptions
 */
package corriges.cours;

// Classe principale
public class Exceptions {

    public static void main(String[] args) throws Exception {

        //Notre méthode qui peut lancer (throw) quelque chose est 
        //dans un bloc de code de try{}
        try {
            double resultat = divise(4, 0);
            System.out.println("La division vaut  : " + resultat);
        } catch (DivisionParZeroException | IllegalArgumentException e) {
            //Si une DivisionParZeroException ou une IllegalArgumentException, ou une classe 
            //qui hérite de ces exceptions est jetée ce code est exécuté.
            System.out.println("Espèce de chafouin, diviser par 0 c'est mal. Cause : " + e.getLocalizedMessage());
        } catch (Exception e) {
            //Si une Exception, ou une classe qui hérite de Exception est jetée, 
            //et qu'un bloc catch précédent n'a pas été exécuté, le code qui suit est exécuté.
            System.out.println("error : " + e.getLocalizedMessage());
        } finally {
            //Ce bloc de code est exécuté qu'une exception soit lancée ou pas
            System.out.println("Ce code est exécuté à tous les coups.");
        }
    }

    /**
     * Divise a par b. Renvoie un double.
     *
     * @param a
     * @param b
     * @return
     * @throws Exception : si b vaut 0.
     */
    public static double divise(double a, double b) throws IllegalArgumentException, DivisionParZeroException, Exception {
        if (b == 0) {
            throw new DivisionParZeroException();
        }
        return a / b;
    }

    /*
     * Exemple d'un enchaînement de méthodes. 
       methodeIhm -> methodeService -> methodeBaseDeDonnees.
       methodeBaseDeDonnees lance une RuntimeException. Or ce genre
       d'Exceptions peut ne pas être attrappée (catch). Du coup,
       les couches de service (qui contiennent le code intelligent)
       ignorent ces exceptions : à juste titre, elles ne peuvent pas 
       faire grand chose si la base de données ne répond pas.
       L'Exception remonte jusqu'à l'IHM qui affiche les erreurs à l'utilisateur.
     */
    public static void methodeIhm() {
        try {
            methodeService();
        } catch (Exception e) {
            methodeLog(e);
            methodeAfficheDansLIhm(e.getMessage());
        }
    }

    private static void methodeService() {
        methodeBaseDeDonnees();
    }

    private static void methodeBaseDeDonnees() {
        throw new RuntimeException("Connexion JDBC impossible");

    }

    private static void methodeLog(Exception e) {
        System.out.println("Logge dans un fichier : " + e.getMessage());
    }

    private static void methodeAfficheDansLIhm(String message) {
        System.out.println("Affiche dans l'IHM : " + message);
    }
}

/**
 * On crée une classe DivisionParZeroException qui hérite de Exception : elle
 * peut être donc jetée (throw) et attrappée (catch). (plus précisèment, elle
 * peut être throw et catch, parce qu'elle hérite d'Exception qui hérite de
 * Throwable).
 */
 class DivisionParZeroException extends Exception {

    public DivisionParZeroException() {
        super("Division par zéro impossible.");
    }

}

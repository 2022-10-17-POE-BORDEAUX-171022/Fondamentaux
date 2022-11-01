/**
 * Exemple sur les exceptions
 */
package cours_exercices.cours;

// Classe Tableau
// Methode affichant le tableau
// Parcours de 5 elements
// Test si le numero de l'element en cours
// ne depasse pas le nombre d'elements dans le tableau.
// Sinon on leve une exception.
// Affichage du tableau si tout est OK.
// Classe principale
public class Exceptions {

    public static void main(String[] args) throws Exception {
        // Creation d'un objet tableaux de type Tableaux

        // Affiche le tableau si tout est OK
        // Sinon affiche une erreur
//        // Puis affiche un message quelque soit le resultat de l'affichage du tableau.
//        double resultat;
//          //On ouvre une connexion à la BDD
//         try(FileInputStream fileInputStream = new FileInputStream(new File("c:/text/java/test.txt"))) {
//            resultat = divise(3,1);
//            System.out.println("Le résultat de la division vaut " + resultat);
//         }catch (UnsupportedOperationException uoe){
//             uoe.printStackTrace();
//         } catch (Exception ex) {
//             System.out.println("Le fichier n'existe pas : " + ex);
//         }finally{
//             System.out.println("Je suis appelé quoiqu'il arrive.");
//         }
        try {
            double resultat = divise(4, 0);
              System.out.println("La division vaut  : " + resultat);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            e.getMessage();
            System.out.println("Espèce de chafouin, diviser par 0 c'est mal.");
        }catch(Exception e){
            System.out.println("error");
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
    public static double divise(double a, double b) throws IllegalArgumentException,   
                    UnsupportedOperationException, Exception {
        if (b == 0) {
            throw new UnsupportedOperationException();
        }
        return a / b;
    }

    public static void methodeIhm() {
        try {
            methodeService();
        } catch (Exception e) {
            //methodeLog(e);
            //methodeAfficheDansLIhm(e.getMessage());
        }
    }

    private static void methodeService() {
        methodeBaseDeDonnees();
    }

    private static void methodeBaseDeDonnees() {
        throw new RuntimeException("Connexion JDBC impossible");
    }
}

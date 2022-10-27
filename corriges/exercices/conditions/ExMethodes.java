/**
 * Exercices methodes
 *
 * 1. Definir une methode maximum(n1, n2, n3) qui renvoi le plus grand
 * des 3 nombres n1, n2, n3 fourni en arguments.
 * exemple : maximum(2, 15, 5) doit afficher : 15
 *
 * 2. Ecrire une fonction cube qui retourne le cube de son argument.
 * Ecrire une fonction volumeSphere qui calcule le volume d'une sphere de rayon r
 * fourni en argument et qui utilise la fonction cube.
 */
package corriges.exercices.conditions;

// Classe principale
public class ExMethodes {
    
    // Methode principale
    public static void main(String[] args) {
        int max = maximum(2, 15, 5);
        System.out.println("Le max vaut : " + max);
        System.out.println(cube(3));
        double volumeSphere = volumeSphere(3);
        System.out.println("Le volume de la sphère de rayon 3 vaut " + volumeSphere);
    }

    // Methode maximum
    static int maximum(int n1, int n2, int n3) {
        // return int max = Math.max(Math.max(n1,n2), n3);
        int maxN1N2 = Math.max(n1, n2);
        int maxN1N2N3 = Math.max(maxN1N2, n3);
        return maxN1N2N3;
    }

    // Methode maximum avec Math.max
    static int maximum2(int n1, int n2, int n3) {
        // return int max = Math.max(Math.max(n1,n2), n3);
        int maxN1N2 = Math.max(n1, n2);
        int maxN1N2N3 = Math.max(maxN1N2, n3);
        return maxN1N2N3;
    }
    
    static int maximum3(int n1, int n2, int n3) {
        // return int max = Math.max(Math.max(n1,n2), n3);
        int maxN1N2 = Math.max(n1, n2);
        int maxN1N2N3 = Math.max(maxN1N2, n3);
        return maxN1N2N3;
    }

    // Methode cube
    static int cube(int n) {
        return n * n * n;
    }
    

    // Methode volume
    static double volumeSphere(int r) {
        return (4f / 3) * Math.PI * cube(r);
    }
}

package corriges.cours;



// Import de la classe BigInteger

// Classe principale
public class Methodes {

	// Methode avec parametre et retournant une valeur.
	// Methode pour calculer factoriel n avec des grandes valeurs.
	static int factoriel(int n) {
		System.out.println("Le paramètre n vaut " + n);
		if (n <= 0) {
			return 1;
		} else {
			// Si n > 1, on boucle et on decremente n � chaque fois
			// Multiplication de f par n
			int factorielle = 1;
			for (int i = 1; i <= n; i++) {
				// équivaut à factorielle *= i;
				factorielle = factorielle * i;
			}
			return factorielle;
		}
	}

	// Methode sans parametre et ne retournant pas de valeur.
	static void uneMethodeSansParametre() {
		System.out.println("Cette méthode ne prend pas de paramètre, et ne renvoie rien.");
                //le return ci-dessous est optionnel
		return;
	}

	// Methode avec un parametre et ne retournant pas de valeur.
	static void uneMethodeAvecParametre(String uneChaineDeCaractere) {
		System.out.println(uneChaineDeCaractere);
		return;
	}

	// Methode avec plusieurs parametres et ne retournant pas de valeur.
	static void uneMethodeAvecPlusieursParametres(int param1, String param2) {
		param1 = 5 * param1;
		System.out.println(param2);
	}

	// Methode principale
	public static void main(String[] args) {
		int variableDeRetour = 0;
		variableDeRetour = factoriel(0);
		System.out.println("Pour n vaut 0 la variable de retour vaut : " + variableDeRetour);

		variableDeRetour = factoriel(3);
		System.out.println("Pour n vaut 3 variable de retour vaut : " + variableDeRetour);

		variableDeRetour = factoriel(10);
		// Affiche la valeur de factorielle n, puis la longuer du nombre
		System.out.println("Pour n vaut 10 variable de retour vaut : " + variableDeRetour);

		uneMethodeSansParametre();

		uneMethodeAvecParametre("Bonjour méthode");

		uneMethodeAvecPlusieursParametres(4, "Bonjour méthode avec plusieurs paramètres");

	}

}
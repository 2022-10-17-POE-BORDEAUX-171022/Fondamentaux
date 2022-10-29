/**
 * Exercice Interface
 * 
 * Ecrire une interface nommee IFigureGeometrique
 * cette interface doit avoir la declaration de 2 methodes :
 * getAire() et getPerimetre()
 * 
 * Ecrire les classes Carre, Cercle, Rectangle et TriangleRectangle implementant l'interface
 * 
 * Ecrire une classe principale appelant
 */

package corriges.exercices.interfaces;

// Interface FigureGeometrique
// Interface FigureGeometrique

// Classe Carre
    // proprietes
    
    // Constructeur
    
    // Getter
    
    // Setter
    
    // Implementation des methodes de l'interface

// Classe Cercle
    // Propriete
    
    // Constructeur
    
    // Getter
    
    // Setter
    
    // Implementation des methodes de l'interface

// Classe Rectangle
    // Proprietes
    
    // Constructeur
    
    // Getters
    
    // Setters

    // Implementation des methodes de l'interface

// Classe TriangleRectangle
    // Proprietes

    // Constructeur
    
    // Getters
    
    // Setters

    // Implementation des methodes de l'interface
    
    // Methode de la classe

// Classe principale
public class ExInterfaces {
    public static void main(String[] args) {
        
        Carre carre = new Carre(4);
        afficheAire(carre);
        
        
        TriangleRectangle tr = new TriangleRectangle(3, 4);
        afficheAire(tr);
    }
    
    public static void afficheAire(IFigureGeometrique figure){
        System.out.println("L'aire vaut " + figure.getAire());
    }
    
    public static void affichePerimetre(IFigureGeometrique figureGeometrique){
        System.out.println("Le périmètre vaut " + figureGeometrique.getPerimetre());
    }
}
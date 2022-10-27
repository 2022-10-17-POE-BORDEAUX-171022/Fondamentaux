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
        
        IFigureGeometrique carre = new Carre(4);
        afficheAire(carre);
        affichePerimetre(carre);
        
        IFigureGeometrique triangleRectangle = new TriangleRectangle(3,4);
        afficheAire(triangleRectangle);
        affichePerimetre(triangleRectangle);
        
        IFigureGeometrique rectangle = new Rectangle(3,4);
        afficheAire(rectangle);
        affichePerimetre(rectangle);
        
        IFigureGeometrique cercle = new Cercle(4);
        afficheAire(cercle);
        affichePerimetre(cercle);
    }
    
    public static void afficheAire(IFigureGeometrique figureGeometrique){
        System.out.println("L'aire vaut " + figureGeometrique.getAire());
    }
    
    public static void affichePerimetre(IFigureGeometrique figureGeometrique){
        System.out.println("Le périmètre vaut " + figureGeometrique.getPerimetre());
    }
}
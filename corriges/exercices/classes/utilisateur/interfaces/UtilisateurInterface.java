/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.classes.utilisateur.interfaces;

import corriges.exercices.interfaces.Carre;
import corriges.exercices.interfaces.IFigureGeometrique;
import corriges.exercices.interfaces.TriangleRectangle;

/**
 *
 * @author francois
 */
public class UtilisateurInterface {
    
    
    public void methodeDeCalculEn96Dimensions(IFigureGeometrique figure){
        //K........ ....
        
        double superNombre = figure.getAire() + figure.getPerimetre();
    }
    
    public static void main(String[] args){
        UtilisateurInterface newUser = new UtilisateurInterface();
        
        TriangleRectangle tr =  new TriangleRectangle(6, 7);
        newUser.methodeDeCalculEn96Dimensions(tr);
        
        Carre carre = new Carre(4);
        newUser.methodeDeCalculEn96Dimensions(carre);
        
        
    }
    
    
}

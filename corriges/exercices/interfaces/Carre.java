/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.interfaces;

/**
 *
 * @author francois
 */

public class Carre implements IFigureGeometrique{
    
    private double cote;
    
    public Carre(double cote){
        this.cote = cote;
    }

    @Override
    public double getAire() {
        return this.cote * this.cote;
    }

    @Override
    public double getPerimetre() {
        return this.cote * 4;
    }
    
}

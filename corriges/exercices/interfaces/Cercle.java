/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.interfaces;

/**
 *
 * @author francois
 */
public class Cercle implements IFigureGeometrique {
    
    private double rayon;
    
    public Cercle(double rayon){
        this.rayon = rayon;
    }

    @Override
    public double getAire() {
        return this.rayon * this.rayon * Math.PI;
    }

    @Override
    public double getPerimetre() {
        return this.rayon * Math.PI * 2;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.interfaces;

/**
 *
 * @author francois
 */
public class TriangleRectangle implements IFigureGeometrique {
    
    private double base;
    private double hauteur;
    
    public TriangleRectangle(double base, double hauteur){
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double getAire() {
        return this.base * this.hauteur / 2;
    }

    @Override
    public double getPerimetre() {
        return this.base + this.hauteur + Math.sqrt(this.base * this.base + this.hauteur * this.hauteur);
    }
    
}

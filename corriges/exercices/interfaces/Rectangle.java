/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.interfaces;

/**
 *
 * @author francois
 */
public class Rectangle implements IFigureGeometrique{
    
    private double coteA;
    private double coteB;
    
    public Rectangle(double coteA, double coteB){
        this.coteA = coteA;
        this.coteB = coteB;
    }

    @Override
    public double getAire() {
        return this.coteA * this.coteB;
    }

    @Override
    public double getPerimetre() {
       return 2*(this.coteA +this.coteB);
    }
    
}

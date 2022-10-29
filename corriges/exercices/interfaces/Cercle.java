package corriges.exercices.interfaces;

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

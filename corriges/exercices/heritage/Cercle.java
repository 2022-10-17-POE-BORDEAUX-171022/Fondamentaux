
package corriges.exercices.heritage;

public class Cercle {
    
    protected double rayon;
    
    public Cercle(double rayon){
        this.rayon = rayon;
    }
    
    public double surface(){
        return this.rayon * this.rayon * Math.PI;
    }
    
    public double perimetre(){
        return this.rayon * 2 * Math.PI;
    }
    
    public Cercle cloneThis(){
        return new Cercle(this.rayon);
    }
    
    
}

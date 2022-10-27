
package corriges.exercices.heritage;

public class Cylindre extends  Cercle{

    private double hauteur;
    
    public Cylindre(double rayon, double hauteur){
        super(rayon);
        this.hauteur = hauteur;
    }
    
    public double volume(){
        return surface() * this.hauteur;
    }
    
    @Override
    public double surface(){
        //Surface de la base +
        //Surface de la base +
        //Surface du pourtour.
        return super.surface() * 2 + super.perimetre() * this.hauteur;
    }
    
   
    @Override
    public Cercle cloneThis(){
        throw new UnsupportedOperationException();
    }
    
}

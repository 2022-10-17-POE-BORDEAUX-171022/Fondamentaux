
package corriges.cours;


public class Voiture extends Vehicule {

    @Override
    public void rouler() {
        this.compteurKilometrique++;
        System.out.println("Je transporte des passagers.");
    }
    
}

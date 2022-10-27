
package corriges.cours;


public class MachineALaverALaMain extends Vehicule implements IMachineALaver, IAppareil{
    
    
    
    public static String getNom(String nom){
        return "Je suis un appareil de type " + nom;
    }
    
    
    private static int nombreDeMachines = 0;
    
    private int masseDeLinge;
    
    public static int getNombreDeMachines(){
        return nombreDeMachines;
    }

    @Override
    public void chargeLinge(int masse) {
        this.masseDeLinge = masse;
    }

    @Override
    public void lave() {
        int indiceDeproprete = this.indiceDeProprete();
        System.out.println("OUlalala, c'est dur de faire tourner " + this.masseDeLinge + " !!!");
    }

    @Override
    public String dechargeLinge() {
        return "VOilà, " + this.masseDeLinge + " tout propre ! ";
    }
    
    public void changeDeBras(){
        System.out.println("Ca va mieux ! ");
    }

    @Override
    public String effectueTravail() {
       return "je lave du linge";
    }

    @Override
    public void rouler() {
        System.out.println("J'arrive pour laver  !");
    }
    
    @Override
    public int indiceDeProprete(){
        return 0;
    }
    
}

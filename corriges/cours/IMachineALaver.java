package corriges.cours;

public interface IMachineALaver{
    
    default int indiceDeProprete(){
        //définit une formule pour 
        //renvoyer une note de propreté de linge
        //en fonction de la masse, la lessive...
        return 0;
    }
    
    void chargeLinge(int masse);
    
    void lave();
    
    String dechargeLinge();

}

package corriges.cours;


public class InterfaceTest {
    
    public static void main(String[] args){
        MachineALaverALaMain machineALaverALaMain = new MachineALaverALaMain();
        machineALaverALaMain.chargeLinge(43);
        machineALaverALaMain.lave();
        machineALaverALaMain.dechargeLinge();
        
        IMachineALaver machineALaver = new MachineALaverALaMain();
        machineALaver.chargeLinge(43);
        machineALaver.lave();
        machineALaver.dechargeLinge();
        
        lave(machineALaverALaMain);
        afficheTache(machineALaverALaMain);
        
        IMachineALaver machineALaverElectrique = new MachineALaverElectrique();
        lave(machineALaverElectrique);
         
        
    }
    
    public static void lave(IMachineALaver machineALaver){
        machineALaver.lave();
    }
    
    public static  void afficheTache(IAppareil appareil){
        appareil.effectueTravail();
    }
    
}

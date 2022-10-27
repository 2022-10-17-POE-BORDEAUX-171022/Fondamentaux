
package corriges.cours;


public class MachineALaverElectrique implements IMachineALaver {

    private int masseDeLingeDansTambour;

    @Override
    public void chargeLinge(int masse) {
        this.masseDeLingeDansTambour = masse;
    }

    @Override
    public void lave() {
        System.out.println("Je consomme 343KWh");
    }

    @Override
    public String dechargeLinge() {
        return "bip bip";
    }
                
    
}

/**
 * Exercice sur les constructeurs
 */

package corriges.cours;

// Classe principale
public class Constructeurs {
    public static void main(String[] args) {
        //On ne peut pas appeler ici le constructeur par
        //défaut : il n'est pas présent parce que l'on a 
        //créé un constructeur sur Maison
        Maison maison = new Maison("maMaison");
        System.out.println("Nom de la maison : " + maison.getNom());
        System.out.println("Masse du bloc porte : " + maison.getBlocPorte().getMasse());
    }
}

class Maison{
    
    private String nom;
    private BlocPorte blocPorte;
    
    public Maison(String nom){
        //On appelle le constructeur par défaut, 
        // présent car aucun constructeur n'a été 
        //codé dans BlocPorte
        this.nom = nom;
        this.blocPorte = new BlocPorte();
    }

    public BlocPorte getBlocPorte() {
        return blocPorte;
    }

    public void setBlocPorte(BlocPorte blocPorte) {
        this.blocPorte = blocPorte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

}

class BlocPorte{
    
    //masse par défaut
    private int masse = 4;

    public int getMasse() {
        return masse;
    }

    public void setMasse(int masse) {
        this.masse = masse;
    }
    
    
    
    
}


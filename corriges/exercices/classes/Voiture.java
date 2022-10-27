
package corriges.exercices.classes;

public class Voiture {
    
    private int vitesseMaximum;
    private String identifiant;
    private String marque;
    private String modele;
    private String couleur;
    //IL n'y aura pas de setter sur etat : on 
    //peut le lire mais seule la classe peut y écrire
    private int kilometrage;
    
    public Voiture(){
        
    }
    
    public Voiture(String identifiant){
        this.identifiant = identifiant;
    }
    
    
    public void demarrer(){
        System.out.println("Je suis " + this.identifiant + " et je démarre !!!");
    }
    
    public void rouler(){
        System.out.println("Je suis " + this.identifiant + " et je roule !!!");
        System.out.println("Avez-vous vu ma belle couleur " + this.couleur + " ?");
        kilometrage++;
    }
    
    public void stopper(){
        System.out.println("Je suis " + this.identifiant + " et je freiiine !!!");
    }
    
    public void afficheInfos(){
        System.out.println("Je vais à " + vitesseMaximum + " max, et j'ai " + kilometrage + " kms.");
    }
    
    
    
    public void arreter(){
        System.out.println("Je m'arrête !");
    }

    /** Mes getters et mes setters */
    public int getVitesseMaximum() {
        return vitesseMaximum;
    }

    public void setVitesseMaximum(int vitesseMaximum) {
        this.vitesseMaximum = vitesseMaximum;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getKilometrage() {
        return kilometrage;
    }    
    
    
    
}

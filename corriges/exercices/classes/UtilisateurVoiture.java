
package corriges.exercices.classes;

public class UtilisateurVoiture {
    
    public static void main(String args[]){
        //On instancie une voiture1 grâce au constructeur
        Voiture voiture1 = new Voiture();
        //On modifie ses attributs via les setters
        voiture1.setCouleur("bleue");
        voiture1.setIdentifiant("Titine");
        voiture1.setMarque("Renault");
        voiture1.setModele("Scenic");
        voiture1.setVitesseMaximum(120);
        
        //voiture1 vit sa vie : les comportement sont définis
        //dans SES propres méthodes
        voiture1.demarrer();
        voiture1.rouler();
        System.out.println(voiture1.getKilometrage());
        voiture1.stopper();
        voiture1.arreter();
        
        System.out.println("\n\n");
        
        //Voiture2 est instanciée, 
        //Elle vit sa vie, différente de celle de voiture1
        //les deux instances sont indépendantes.
        Voiture voiture2 = new Voiture();
        voiture2.setCouleur("rouge");
        voiture2.setIdentifiant("Tuture");
        voiture2.setMarque("Ferrari");
        voiture2.setModele("F40");
        voiture2.setVitesseMaximum(340);
        voiture2.demarrer();
        voiture2.rouler();
        voiture2.rouler();
        voiture2.rouler();
        voiture2.rouler();
        voiture2.rouler();
        voiture2.afficheInfos();
        

    }
    
}

/**
 * Exemple sur les classes
 */

package corriges.cours;
    

// Classe publique Classes
public class Classes {
    
    // Attribut public
     public String nom;
     String nomPackage;
     protected String nomProtected;
     private String nomSecret;
     
     //Constructeur sans argument
     public Classes(){
         System.out.println("Le constructeur est appelé");
         this.nom = "Nouveau nom";
     }

    // Constructeur avec argument appelant le constructeur
     //sans argument grâce à this
     public Classes(String nomSecret){
         this();
         this.nomSecret = nomSecret;
     }
     
    // Methode private
     private String getNomSecret(){
         return this.nomSecret;
     }
     
    // Methode publique
     public String getNom(){
         return this.nom;
     }
     
     public void afficheNom(){
         System.out.println(this.nom);
     }
     
     public void afficheNomSecret(){
         System.out.println(this.nomSecret);
     }
    
    // Methode principale
    public static void main(String[] args){
        
        // Creation d'un nouvel objet de type Classes nomme mc
        Classes mc = new Classes();
        
        // Appel de la methode avecRetour
        System.out.println(mc.nomSecret);
        // Appel de la methode sansRetour
        mc.afficheNom();
        
        // Creation d'un objet de la classe uneClasse nomme uc
        Classes uc = new Classes();
        // Appel de l'attribut public d'une classe
        uc.nomSecret = "nouveauNomSecret";
        System.out.println(uc.nomSecret);
        System.out.println(mc.nomSecret);
    }    
        
        
}

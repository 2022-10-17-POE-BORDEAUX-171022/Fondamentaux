/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.exercices.heritage;

/**
 *
 * @author francois
 */
public class InterpreteTest {
    
    public static void main(String[] args){
        
        Interprete interpreteAnglais = new InterpreteAnglais();
        
        String messageRenvoye = interpreteAnglais.traduirePhrase();
        System.out.println(messageRenvoye);
        
        Interprete interpreteItalien = new InterpreteItalien();
        
        affiche(interpreteItalien);
        
        
        
    }
    
    public static void affiche(Interprete interprete){
        System.out.println(interprete.traduirePhrase());
    }
    
}

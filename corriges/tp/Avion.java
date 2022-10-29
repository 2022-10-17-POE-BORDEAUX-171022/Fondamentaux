/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corriges.tp;

/**
 *
 * @author francois
 */
public class Avion implements ObjetVolant {

    @Override
    public boolean prepareVole() {
        System.out.println("Je vole");
        return true;
    }

    @Override
    public void decolle() {
        
        System.out.println("Je vole");
    }

    @Override
    public void vole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atterrit() {
        
        System.out.println("Je vole");
    }

    @Override
    public void repare() {
        
        System.out.println("Je vole");
    }
    
}

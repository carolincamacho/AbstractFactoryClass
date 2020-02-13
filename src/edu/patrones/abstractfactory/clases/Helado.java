/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.abstractfactory.clases;

/**
 *
 * @author YULI GARCES
 */

public abstract class Helado {

    private String sabor;
    
    public abstract void mostrarSabor();

    public abstract String crearSabor();
    
      public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}

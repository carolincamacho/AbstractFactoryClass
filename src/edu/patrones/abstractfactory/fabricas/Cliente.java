/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.abstractfactory.fabricas;

import edu.patrones.abstractfactory.clases.Helado;
import edu.patrones.abstractfactory.interfaces.IFabricaDeHelado;

/**
 *
 * @Abstract Team
 */
public class Cliente {
    
     public static void crearHelado(IFabricaDeHelado factory) {
        Helado objetoHelado = factory.crearHelado();
        objetoHelado.mostrarSabor();
    }
}

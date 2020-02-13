package edu.patrones.abstractfactory.interfaces;

import edu.patrones.abstractfactory.clases.Helado;

/**
 *
 * @author Abstract Team. Interfaz donde se crea el tipo de helado
 */
public interface IFabricaDeHelado {
    public Helado crearHelado();
}


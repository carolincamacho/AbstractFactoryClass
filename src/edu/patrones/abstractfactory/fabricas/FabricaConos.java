package edu.patrones.abstractfactory.fabricas;

import edu.patrones.abstractfactory.clases.Helado;
import edu.patrones.abstractfactory.interfaces.*;
import edu.patrones.abstractfactory.clases.*;
/**
 *
 * @author Abstract Team. clase que define la fabrica específica
 * la creación de cada tipo de helado, implementa la Frabica de Helado general. 
 */
public class FabricaConos implements IFabricaDeHelado {

    @Override
    public Helado crearHelado() {
        Cono miCono = new Cono();
        miCono.setSabor(miCono.crearSabor());
        System.out.println("Se ha creado un nuevo helado tipo Cono");
        return miCono;
    }
}

package edu.patrones.abstractfactory.clases;

/**
 *
 * @author Abstract Team. Clase que establece el tipo de helado Cono
 */
import edu.patrones.abstractfactory.interfaces.*;

public class Cono extends Helado{

    private final String saborOpcion[] = {"Pistacho", "Cafe", "Chocolate"};
   

    @Override
    public String crearSabor() {
        int codigoSabor = (int) (Math.random() * 3);
        return saborOpcion[codigoSabor];
    }

    @Override
    public void mostrarSabor() {
        System.out.println("El sabor del Cono es: " + super.getSabor());
    }

}

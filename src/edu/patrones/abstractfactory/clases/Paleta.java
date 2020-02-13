package edu.patrones.abstractfactory.clases;

/**
 *
 * @author Abstract Team. Clase que establece el tipo de helado Paleta
 */
import edu.patrones.abstractfactory.interfaces.*;

public class Paleta extends Helado {

    private final String saborOpcion[] = {"Vainilla", "Mora", "Limón"};
    

    @Override
    public String crearSabor() {
        int codigoSabor = (int) (Math.random() * 3);
        return saborOpcion[codigoSabor];
    }

    @Override
    public void mostrarSabor() {
        System.out.println("El sabor de la Paleta es: " + super.getSabor());
    }
}

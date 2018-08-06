/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Maragarita
 */
public class Circulo extends Figuras implements Operaciones {
    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        
        return (radio*radio)*pi;

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerPerimetro() {
        
        
        return (2*pi*radio);
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class Rectangulo extends Figuras implements Operaciones{
    double lado1;
    double lado2;

    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1=lado1;
        this.lado2=lado2;
        
    }

    

    @Override
    public double obtenerArea() {
    
        return (lado1*lado2);

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerPerimetro() {
        
        return (lado1*2)+(lado2*2);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

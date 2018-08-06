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
public class Cuadrado extends Figuras implements  Operaciones{
    
    double lado;

    public Cuadrado(String nombre,double lado) {
    
    
    super(nombre);
    this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        
        
        return (lado*lado);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerPerimetro() {
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (lado*4);
    }
    
    
    
    
}

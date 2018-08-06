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
public class Triangulo extends Figuras implements Operaciones{
    
    
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public double obtenerArea() {
        
        double p=obtenerPerimetro()/2;
        double aux=p*(p-lado1)*(p-lado2)*(p-lado3);
        double res= (double)Math.sqrt(aux);
        return  res;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerPerimetro() {
        
        return (lado1+lado2+lado3);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

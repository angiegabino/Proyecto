

package com.gabino.proyecto;

/**
 *
 * @author Angie
 */
public class Pitonisa {
    Futuro futuro;
    
    public Pitonisa (Futuro futuro){
        this.futuro = futuro;
    }

    Pitonisa(Zodiaco zodiaco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String obtenerFuturo(String parametro){
     
      return futuro.leerFuturo(parametro);
  }
}

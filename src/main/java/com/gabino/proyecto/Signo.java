

package com.gabino.proyecto;

/**
 *
 * @author Angie
 */
public class Signo {
    private String signo;
    private String consulta;

    public Signo() {
    }

    public Signo(String signo, String consulta) {
        this.signo = signo;
        this.consulta = consulta;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    
}


package com.mycompany.mavenproject1;
import java.util.*;
public class Contato {
    private String tipo;
    private String contato;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Contato(String tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }
      
}

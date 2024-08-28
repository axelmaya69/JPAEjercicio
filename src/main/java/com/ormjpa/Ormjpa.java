 
package com.ormjpa;

import com.ormjpa.persistencia.ControladoraPersistencia;

/**
 *
 * @author axelmaya
 */
public class Ormjpa {

    public static void main(String[] args) {
        //se crea otro objeto a partir de la clase controladorapersistencia
        //cuya funcion tambien es crear un objeto de alumnojpa para controlarlo
        ControladoraPersistencia controler = new ControladoraPersistencia();
        //mensaje para probar tambien si funciona
        System.out.println("Hello World!");
    }
}

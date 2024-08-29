 
package com.ormjpa;

import com.ormjpa.logica.Alumno;
import com.ormjpa.logica.Controladora;
import com.ormjpa.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author axelmaya
 */
public class Ormjpa {

    public static void main(String[] args) {
        
        //Se debe implementar modelo de capas.

        //se crea otro objeto a partir de la clase controladorapersistencia
        //cuya funcion tambien es crear un objeto de alumnojpa para controlarlo
        
        //ControladoraPersistencia controler = new ControladoraPersistencia();
        //mensaje para probar tambien si funciona
        //System.out.println("Hello World!");
        
        
        Controladora control = new Controladora();
        Alumno alu = new Alumno(11,"Axel Daniel","Bartolo","Maya", new Date());
        
        control.crearAlumno(alu);
        
        
    }
}

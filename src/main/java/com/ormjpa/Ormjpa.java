 
package com.ormjpa;

import com.ormjpa.logica.Alumno;
import com.ormjpa.logica.Carrera;
import com.ormjpa.logica.Controladora;
import com.ormjpa.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.ArrayList;
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
        //Alumno alu2 = new Alumno(30,"May","FLowers","Antonio", new Date());
        //control.crearAlumno(alu2);
        
        
        
        
        //eliminando alumno con el id correspondiente
    //        control.deleteAlumno(226);
        
    
    //editando alumno
    /*alu.setNombre("AXEL DANIEL");
    control.updateAlumno(alu);
    */
    //trayendo un solo alumno: 
  /*  Alumno alu =control.bringAlumno(1);
        System.out.println(alu.toString());
        System.out.println("\n\n");
    //trayendo a todos los alunos
     ArrayList<Alumno> listaAlumnos = control.bringAlumnos();
     for(Alumno alumnos:listaAlumnos){
         System.out.println(alumnos.toString());
     }*/
  
     Carrera carre = new Carrera(1,"Fundamentos de programacion");
     control.crearCarrera(carre);
     
     Alumno alu4 = new Alumno(35,"Juan","Perez","Antonio", new Date(),carre);
     control.crearAlumno(alu4);
     
        System.out.println(control.bringAlumno(35));
     
    }
}

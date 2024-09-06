package com.ormjpa;

import com.ormjpa.logica.Alumno;
import com.ormjpa.logica.Carrera;
import com.ormjpa.logica.Controladora;
import com.ormjpa.logica.Materia;
import com.ormjpa.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author axelmaya
 */
public class Ormjpa {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();

        Carrera carr = new Carrera(43, "Ingenieria en sistemas computacionales", listaMaterias);
        Carrera carr1 = new Carrera(44, "Gastronomia", listaMaterias);
        Carrera carr2 = new Carrera(45, "Ingenieria en Gestion Empresarial", listaMaterias);
        control.crearCarrera(carr);
        control.crearCarrera(carr1);
        control.crearCarrera(carr2);

        Materia mat = new Materia(10, "Topicos selectos de programacion", "Semestral",carr);
        Materia mat1 = new Materia(11, "Matematicas Discretas", "Semestral",carr);
        Materia mat2 = new Materia(12, "Base de Datos", "Semestral",carr);
        Materia mat3 = new Materia(13, "Pozole", "Semestral",carr);

        listaMaterias.add(mat);
        listaMaterias.add(mat1);
        listaMaterias.add(mat2);
        listaMaterias.add(mat3);

        carr.setListaMaterias(listaMaterias);
        control.updateCarrera(carr);
        
        
        
        control.crearMateria(mat);
        control.crearMateria(mat1);
        control.crearMateria(mat2);
        control.crearMateria(mat3);

        Alumno al = new Alumno(1, "Axel Daniel", "Bartolo", "Maya", new Date(), carr);
        Alumno al2 = new Alumno(2, "Jorge", "Francisco", "Pedro", new Date(), carr);
        Alumno al3 = new Alumno(3, "Luis", "Cortez", "Yañez", new Date(), carr1);

        control.crearAlumno(al3);
        control.crearAlumno(al2);
        control.crearAlumno(al);
        //Se debe implementar modelo de capas.

        //se crea otro objeto a partir de la clase controladorapersistencia
        //cuya funcion tambien es crear un objeto de alumnojpa para controlarlo
        //ControladoraPersistencia controler = new ControladoraPersistencia();
        //mensaje para probar tambien si funciona
        //System.out.println("Hello World!");
        // Controladora control = new Controladora();
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
        //Carrera carre = new Carrera(1,"Fundamentos de programacion");
        // control.crearCarrera(carre);
        /*  
     Alumno alu4 = new Alumno(35,"Juan","Perez","Antonio", new Date(),carre);
     control.crearAlumno(alu4);
     
        System.out.println(control.bringAlumno(35));
         */
    }
}

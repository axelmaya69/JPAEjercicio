package com.ormjpa.logica;

import com.ormjpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author axelmaya Creando clase controladora para hacer el crud de alumnos.
 *
 */
public class Controladora {

    ControladoraPersistencia controlPer = new ControladoraPersistencia();

    //creacion de metodo para recibir a alumno ya estructurado
    public void crearAlumno(Alumno alu) {

        //se crea alumno a partir de esta instancia y siguienlo los 
        //warnings de la izquierda en la clase ControladoraPersistencia();
        controlPer.createAlumno(alu);
    }

    //creacion de metodo para borrar alumno
    public void deleteAlumno(int id) {
        controlPer.deleteAlumno(id);
    }

    //creando metodo para hacer un edit de alumno
    public void updateAlumno(Alumno alu) {
        controlPer.updateAlumno(alu);
    }

    //metodo para buscar alumno 
    public Alumno bringAlumno(int id) {
        return controlPer.bringAlumno(id);
    }

    //traer a todos los alumnos
    public ArrayList<Alumno> bringAlumnos() {
        return controlPer.bringAlumnos();
    }

    //metodos para carrera
    public void crearCarrera(Carrera carre) {
        controlPer.createCarrera(carre);
    }

    public void deleteCarrera(int id) {
        controlPer.deleteCarrera(id);
    }

    public void updateCarrera(Carrera carre) {
        controlPer.updateCarrera(carre);
    }

    public Carrera bringCarrera(int id) {
        return controlPer.bringCarrera(id);
    }

    public ArrayList<Carrera> bringCarreras() {
        return controlPer.bringCarreras();
    }

    
    //metodos para Materia
    public void crearMateria(Materia mat){
       controlPer.createMateria(mat);
    }
    public void deleteMateria(int id){
        controlPer.deleteMateria(id);
    }
    public void updateMateria(Materia mat){
        controlPer.updateMateria(mat);
    }
    public Materia bringMateria(int id){
        return controlPer.bringMateria(id);
    }
    public ArrayList<Materia> bringMaterias(){
        return controlPer.bringMaterias();
    }
}

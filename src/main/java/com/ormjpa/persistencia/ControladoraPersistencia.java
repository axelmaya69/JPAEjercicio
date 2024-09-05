
package com.ormjpa.persistencia;

import com.ormjpa.logica.Alumno;

import com.ormjpa.logica.Carrera;
import com.ormjpa.logica.Materia;
import com.ormjpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author axelmaya 
 */
public class ControladoraPersistencia {
    
    //se crea un nuevo objeto cuyo en esta clase a partir del alumnoJpa
    //y es su unica funcion.
    AlumnoJpaController alujpa = new AlumnoJpaController();
    CarreraJpaController carrerajpa = new CarreraJpaController();
    MateriaJpaController materiajpa = new MateriaJpaController();
    
    //metodo creado para usar en la clase Controladora.java
    public void createAlumno(Alumno alu) {
    alujpa.create(alu);
    }
    
    //eliminacion desde la controladora
    public void deleteAlumno(int id) {
        try {
            alujpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //editando desde la clase controladora
    //se usa try catch por si hay algun alumno que no este o ya se haya borrado
    public void updateAlumno(Alumno alu) {
        try {
            alujpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Alumno bringAlumno(int id) {
        return alujpa.findAlumno(id);
    }
 
    public ArrayList<Alumno> bringAlumnos() {
     List<Alumno> list= alujpa.findAlumnoEntities();
     ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>(list);
     return listaAlumnos;
    }

    
    public void createCarrera(Carrera carre) {
    carrerajpa.create(carre);
    }

    public void deleteCarrera(int id) {
        try {
            carrerajpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCarrera(Carrera carre) {
        try {
            carrerajpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera bringCarrera(int id) {
        return carrerajpa.findCarrera(id);
    }

    public ArrayList<Carrera> bringCarreras() {
        List<Carrera> listCarr= carrerajpa.findCarreraEntities();
     ArrayList<Carrera> listaCarreras=new ArrayList<Carrera>(listCarr);
     return listaCarreras;
    }

    public void createMateria(Materia mat) {
     materiajpa.create(mat);
    }

    public void deleteMateria(int id) {
        try {
            materiajpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMateria(Materia mat) {
        try {
            materiajpa.edit(mat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia bringMateria(int id) {
    return materiajpa.findMateria(id);
        
    }

    public ArrayList<Materia> bringMaterias() {
        List<Materia> listMaterias= materiajpa.findMateriaEntities();
     ArrayList<Materia> listaMaterias=new ArrayList<Materia>(listMaterias);
     return listaMaterias;
    }

   
}

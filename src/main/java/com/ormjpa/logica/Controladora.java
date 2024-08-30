
package com.ormjpa.logica;

import com.ormjpa.persistencia.ControladoraPersistencia;

/**
 *
 * @author axelmaya
 * Creando clase controladora para hacer el crud de alumnos.
 * 
 */
public class Controladora {
    
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
    //creacion de metodo para recibir a alumno ya estructurado
    public void crearAlumno(Alumno alu){
        
        //se crea alumno a partir de esta instancia y siguienlo los 
        //warnings de la izquierda en la clase ControladoraPersistencia();
        
        controlPer.createAlumno(alu);       
    }
    
    //creacion de metodo para borrar alumno
    public void deleteAlumno(int id){
        
        controlPer.deleteAlumno(id);
    }
    
}

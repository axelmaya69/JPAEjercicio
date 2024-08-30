
package com.ormjpa.persistencia;

import com.ormjpa.logica.Alumno;
import static com.ormjpa.logica.Alumno_.id;
import com.ormjpa.persistencia.exceptions.NonexistentEntityException;
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

    public void updateAlumno(Alumno alu) {
        try {
            alujpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
}

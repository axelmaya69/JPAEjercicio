
package com.ormjpa.persistencia;

import com.ormjpa.logica.Alumno;

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
}

package com.ormjpa.logica;

import com.ormjpa.logica.Carrera;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-04T23:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, String> apellidoP;
    public static volatile SingularAttribute<Alumno, String> apellidoM;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, Carrera> carreer;

}
package com.ormjpa.logica;

import com.ormjpa.logica.Carrera;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-05T21:31:22", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> tipo;
    public static volatile SingularAttribute<Materia, Carrera> carre;
    public static volatile SingularAttribute<Materia, Integer> id;
    public static volatile SingularAttribute<Materia, String> nombre;

}
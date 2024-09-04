package com.ormjpa.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //especifica la creacion de una entidad
public class Alumno implements Serializable {

    @Id     //el primary key de la entidad
    @GeneratedValue(strategy = GenerationType.AUTO) //indica la creacion del id 
    //en forma automatica y de la mejor manera
    private int id;
    @Basic //hace referencia a atrubutos comunes
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    @Temporal(TemporalType.DATE)  //para fechas
    //ya que solo se quiere fecha sin hora se usa el .DATE
    private Date fechaNacimiento;

    //constructor vacio
    public Alumno() {
    }

    //Se genera la relacion 1 a 1
    //agregando notacion JPA OtO
    @OneToOne
    private Carrera carreer;
    // se debe modificar el constructor para agregar carrera
    //y agregarle su getter y setter

    //constructor inicializado con parametros
    public Alumno(int id, String nombre, String apellidoP, String apellidoM, Date fechaNacimiento,
            Carrera carreer) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimiento = fechaNacimiento;
        this.carreer = carreer;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Carrera getCarreer() {
        return carreer;
    }

    public void setCarreer(Carrera carreer) {
        this.carreer = carreer;
    }

    //se va a "Other Sources" y en el archivo persistence.xml se agrega a la
    //clase Alumno en Include Entity Class
    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}

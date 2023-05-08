
package repasocompvisual;

import java.util.ArrayList;

public class Personas {
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private String estadoCivil;
    private String FecNac;
    public String hobbies;
    public String nacionalidad;
    public String estudios;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    
    public String getFecNac() {
        return FecNac;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getEstudios() {
        return estudios;
    }



    public Personas(String cedula, String nombre, String apellido, String sexo, String estadoCivil, String FecNac, String hobbies, String nacionalidad, String estudios) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.FecNac = FecNac;
        this.hobbies = hobbies;
        this.nacionalidad = nacionalidad;
        this.estudios = estudios;
    }
    
    
    

    
    

    
}

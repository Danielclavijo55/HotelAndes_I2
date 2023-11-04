package uniandes.edu.co.proyecto.modelo;

import java.sql.Time;

import jakarta.persistence.*;


@Entity
@Table(name="utensilios")
@PrimaryKeyJoinColumn(name="idservicio")

public class utensilios extends servicios {

    // Atributos
    private String devuelto;
    private String estado;


    // Constructor
    public utensilios(String devuelto, String estado,
    Time horarioinicio, Time horariofin, String nombre, Integer costo, String cargado, String existe, reserva reserva)
    {
        super(horarioinicio, horariofin, nombre, costo, cargado, existe, reserva);
        this.devuelto = devuelto;
        this.estado = estado;
    }


    public utensilios(){;}


    // Getters
    public String getDevuelto()
    {
        return this.devuelto;
    }

    public String getEstado()
    {
        return this.estado;
    }


    // Setters
    public void setDevuelto(String devuelto)
    {
        this.devuelto = devuelto;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
}

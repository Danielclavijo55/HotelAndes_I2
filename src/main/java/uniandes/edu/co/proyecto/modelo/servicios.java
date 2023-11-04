package uniandes.edu.co.proyecto.modelo;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
@Inheritance(strategy = InheritanceType.JOINED)

public class servicios {
    
    // Atributos
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idservicio;

    private Time horarioinicio;
    private Time horariofin;
    private String nombre;
    private Integer costo;
    private String cargado;
    private String existe;
    //FK
    @ManyToOne
    @JoinColumn(name="reservas", referencedColumnName = "idreserva")
    private reserva reserva;


    // Constructor
    public servicios(Time horarioinicio, Time horariofin, String nombre, Integer costo, String cargado, String existe, reserva reserva)
    {
        this.horarioinicio = horarioinicio;
        this.horariofin = horariofin;
        this.nombre = nombre;
        this.costo = costo;
        this.cargado = cargado;
        this.existe = existe;
        this.reserva = reserva;
    }


    public servicios(){;}


    // Getters
    public Time getHorarioinicio() {
        return horarioinicio;
    }

    public Time getHorariofin() {
        return horariofin;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCosto() {
        return costo;
    }

    public String getCargado() {
        return cargado;
    }

    public String getExiste() {
        return existe;
    }

    public reserva getReserva() {
        return reserva;
    }


    // Setters
    public void setHorarioinicio(Time horarioinicio) {
        this.horarioinicio = horarioinicio;
    }

    public void setHorariofin(Time horariofin) {
        this.horariofin = horariofin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public void setCargado(String cargado) {
        this.cargado = cargado;
    }

    public void setExiste(String existe) {
        this.existe = existe;
    }

    public void setReserva(reserva reserva) {
        this.reserva = reserva;
    }
    
}

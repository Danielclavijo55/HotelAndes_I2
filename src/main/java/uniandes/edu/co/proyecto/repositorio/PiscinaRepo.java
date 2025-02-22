package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Piscina;

public interface PiscinaRepo extends JpaRepository <Piscina, Integer> {

    // Creation
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO piscinas (idservicio, capacidad, profundidad) VALUES (parranderos_sequence.nextval, :capacidad, :profundidad)", nativeQuery = true)
    void insertarPiscina(@Param("capacidad") Integer capacidad, @Param("profundidad") Float profundidad);


    // Read
    @Query(value = "SELECT * FROM piscinas", nativeQuery = true)
    Collection<Piscina> darPiscinas();

    @Query(value = "SELECT * FROM piscinas WHERE idservicio = :idservicio", nativeQuery = true)
    Piscina darPiscina(@Param("idservicio") Integer idservicio);


    // Update
    @Modifying
    @Transactional
    @Query(value = "UPDATE piscinas SET capacidad=:capacidad, profundidad=:profundidad WHERE idservicio=:idservicio", nativeQuery = true)
    void actualizarPiscina(@Param("idservicio") Integer idservicio, @Param("capacidad") Integer capacidad,
                               @Param("profundidad") Float profundidad);


    // Delete
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM piscinas WHERE idservicio =: idservicio", nativeQuery = true)
    void eliminarPiscina(@Param("idservicio") Integer idservicio);
}

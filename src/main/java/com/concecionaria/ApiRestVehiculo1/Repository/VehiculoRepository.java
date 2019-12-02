package com.concecionaria.ApiRestVehiculo1.Repository;

import com.concecionaria.ApiRestVehiculo1.dominio.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

	List<Vehiculo> findAllByMarcaLike(String marca);

	List<Vehiculo> findAllByMarcaLikeOrModeloLike(String marca, String modelo);

}

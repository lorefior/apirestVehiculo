package com.concecionaria.ApiRestVehiculo1;

import com.concecionaria.ApiRestVehiculo1.Repository.VehiculoRepository;
import com.concecionaria.ApiRestVehiculo1.dominio.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class VehiculoController {
    @Autowired
    VehiculoRepository vehiculoRepository;

    @GetMapping("/vehiculos")
    public List<Vehiculo> getAllVehiculo() {
        return vehiculoRepository.findAll();
    }

    @GetMapping("/vehiculo/{id}")
    public Optional<Vehiculo> getAllVehiculo(@PathVariable Long id) {
        return vehiculoRepository.findById(id);
    }

    @GetMapping("/vehiculo/search/{marca}")
    public List<Vehiculo> getVehiculosByMarca(@PathVariable String marca) {
        return vehiculoRepository.findAllByMarcaLike("%"+marca+"%");
    }

    @GetMapping("/alumno/search2/{marca}")
    public List<Vehiculo> getAlumnosByMarcaAndModelo(@PathVariable String name) {
        return vehiculoRepository.findAllByMarcaLikeOrModeloLike("%"+name+"%", "%"+name+"%");
    }


    @PostMapping("/vehiculo/add")
    public Vehiculo create(@RequestBody Vehiculo body) {
        return vehiculoRepository.save(body);
    }

    @PutMapping("/vehiculo/")
    public Vehiculo update(@RequestBody Vehiculo body) {
        return vehiculoRepository.save(body);
    }

    @DeleteMapping("/alumno/{id}")
    public Vehiculo delete(@PathVariable Long id) {
        Optional<Vehiculo> al = vehiculoRepository.findById(id);
        if ( al.isPresent() ) {
        	vehiculoRepository.delete(al.get());
            return al.get();
        } else {
            return null;
        }
    }


}

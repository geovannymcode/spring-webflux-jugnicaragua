package com.jugnicaragua.demoappreactive.repositorio;

import com.jugnicaragua.demoappreactive.modelo.Producto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends ReactiveCrudRepository<Producto, Long> {

}

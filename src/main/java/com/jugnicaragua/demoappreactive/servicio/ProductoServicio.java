package com.jugnicaragua.demoappreactive.servicio;

import com.jugnicaragua.demoappreactive.modelo.Producto;
import com.jugnicaragua.demoappreactive.repositorio.ProductoRepositorio;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;


    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    public Flux<Producto> findAll() {
        return productoRepositorio.findAll();
    }

    public Mono<Producto> findById(Long id) {
        return productoRepositorio.findById(id);
    }

    public Mono<Producto> save(Producto producto) {
        return productoRepositorio.save(producto);
    }
 
    public Mono<Void> deleteById(Long id){
        return this.productoRepositorio.findById(id)
                .flatMap(this.productoRepositorio::delete);
    }
    
}

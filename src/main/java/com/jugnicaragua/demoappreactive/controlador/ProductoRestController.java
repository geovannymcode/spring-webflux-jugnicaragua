package com.jugnicaragua.demoappreactive.controlador;

import com.jugnicaragua.demoappreactive.modelo.Producto;
import com.jugnicaragua.demoappreactive.servicio.ProductoServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    private final ProductoServicio productoServicio;


    public ProductoRestController(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping
    public Flux<Producto> list() {
        return productoServicio.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Producto> findById(@PathVariable Long id) {
        return productoServicio.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Producto> create(@RequestBody Producto producto) {
        return productoServicio.save(producto);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Producto>> update(@PathVariable Long id,
                                                 @RequestBody Producto producto) {
        return productoServicio.findById(id)
                .flatMap(existingProduct -> {
                    existingProduct.setNombre(producto.getNombre());
                    existingProduct.setDescripcion(producto.getDescripcion());
                    existingProduct.setPrecio(producto.getPrecio());
                    return productoServicio.save(existingProduct);
                })
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Long id){
        return productoServicio.deleteById(id);
    }
}

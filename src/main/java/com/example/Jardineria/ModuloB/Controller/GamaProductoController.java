package com.example.Jardineria.ModuloB.Controller;

import com.example.Jardineria.ModuloDProducto.DTO.GamaProductoDTO;
import com.example.Jardineria.ModuloDProducto.Entity.GamaProducto;
import com.example.Jardineria.ModuloDProducto.Service.GamaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GamaProductos")
public class GamaProductoController {
    @Autowired
    private GamaProductoService gamaProductoService;

    @GetMapping
    public List<GamaProducto> findAll(){
        return gamaProductoService.getGamas();
    }


    @GetMapping("/{gama}")
    public Optional<GamaProducto> getById(@PathVariable("gama")String gama){
        return gamaProductoService.getGama(gama);
    }

    @PostMapping("/Crear")
    public void save(@RequestBody GamaProductoDTO gamaProductoDTO){
        gamaProductoService.save(gamaProductoDTO);
    }
    @PutMapping("/Actualizar")
    public void update(@RequestBody GamaProductoDTO gamaProductoDTO){
        gamaProductoService.update(gamaProductoDTO);
    }

    @DeleteMapping("/{gama}")
    public void delete(@PathVariable("gama") String gama){
        gamaProductoService.delete(gama);
    }


}

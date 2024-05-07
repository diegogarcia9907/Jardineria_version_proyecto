package com.example.Jardineria.ModuloDProducto.Service;



import com.example.Jardineria.ModuloDProducto.DTO.GamaProductoDTO;
import com.example.Jardineria.ModuloDProducto.Entity.GamaProducto;
import com.example.Jardineria.ModuloDProducto.Mapper.GamaNotFoundException;
import com.example.Jardineria.ModuloDProducto.Repository.GamaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GamaProductoService {
    @Autowired
    GamaProductoRepository gamaProductoRepository;

    public List<GamaProducto> getGamas(){
        return  gamaProductoRepository.findAll();
    }



    public Optional<GamaProducto> getGama(String codigoGamaProducto){
        return gamaProductoRepository.findById(codigoGamaProducto);
    }

    public void save(GamaProductoDTO gamaProductoDTO){
    GamaProducto gamaProducto = new GamaProducto();
        String nuevoCodigoGama= generarCodigoGama();
        gamaProducto.setCodigoGama(nuevoCodigoGama);
        gamaProducto.setGama(gamaProductoDTO.getGama());
        gamaProducto.setDescripcion(gamaProductoDTO.getDescripcion());
        gamaProductoRepository.save(gamaProducto);
    }
    public void update(GamaProductoDTO gamaProductoDTO){
        GamaProducto gamaProducto = new GamaProducto();
        List<GamaProducto> gamaProductos = gamaProductoRepository.findByGama(gamaProductoDTO.getGama());
        if (!gamaProductos.isEmpty()) {
            gamaProducto = gamaProductos.get(0);

        } else {
            // Manejar el caso en el que no se encuentre ninguna gama
            throw new GamaNotFoundException("No se encontró la gama especificada");
        }
        gamaProducto.setGama(gamaProductoDTO.getGama());
        gamaProducto.setDescripcion(gamaProductoDTO.getDescripcion());
        gamaProductoRepository.save(gamaProducto);
    }


    public void delete(String codigoGamaProducto) {
        gamaProductoRepository.deleteById(codigoGamaProducto);
    }
    private String generarCodigoGama() {
        String ultimoCodigo = gamaProductoRepository.obtenerUltimoCodigoGama();
        int ultimoNumero = Integer.parseInt(ultimoCodigo.substring(2));
        int nuevoNumero = ultimoNumero + 1;
        String nuevoCodigoGama = "GP" + String.format("%03d", nuevoNumero);
        return nuevoCodigoGama;
    }
}

package com.example.Jardineria.ModuloDProducto.Mapper;

public class ProductoNotFoundException extends RuntimeException {

    public ProductoNotFoundException(String message) {
        super(message);
    }
}
package com.mycompany.carritocompras.Registros;

public record Producto (int id, String nombre, int precio){
    public Producto {
        if (precio <0){
            System.out.println("No existen precios negativos");
        }
    }
    
}

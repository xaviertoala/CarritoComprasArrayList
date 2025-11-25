package com.mycompany.carritocompras;

import com.mycompany.carritocompras.Registros.Producto;
import java.util.ArrayList;

public class CarritoCompras {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto (2, "Cell ", 2000);
        Producto producto2= new Producto (3, "PC ", 6000);
        
        ArrayList<Producto>carrito = new ArrayList<>();
        carrito.add(producto1);
        carrito.add(producto2);
            
        //carrito.remove(1);
        
        //carrito.set(0, producto2);
        
        
        //for (Producto x : carrito) {
        //    System.out.println("Producto: "+x);
            
        //}
        
        carrito.size();
        System.out.println(carrito);
                
        
        
    }
}

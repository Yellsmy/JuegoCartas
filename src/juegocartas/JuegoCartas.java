package juegocartas;
/***********************************************
* Tripleta.java
* Yellsmy Toj
*
* Clase principal que contiene el método main para ejecutar las diversas
* funcionalidades de la clase Producto
***********************************************/

public class JuegoCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LlenarBaraja llenado = new LlenarBaraja();
        //llenado.llenarMazo();
        Baraja baraja = new Baraja();
        baraja.llenarMazo();
        baraja.barajear();
       
    }
}

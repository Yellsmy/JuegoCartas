package juegocartas;
/***********************************************
* Producto.java
* Yellsmy Toj
*
* Esta clase genérica detalla un producto 
* tanto el código, el nombre y su precio de  
* diferentes tipos de datos.
***********************************************/

public class Carta 
{
    private String palo;
    private String identificadorCarta;
    
    //**************************************************************

    public Carta(String palo, String identificadorCarta) {
        this.palo = palo;
        this.identificadorCarta = identificadorCarta;
    }
    
    //**************************************************************

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getIdentificadorCarta() {
        return identificadorCarta;
    }

    public void setIdentificadorCarta(String identificadorCarta) {
        this.identificadorCarta = identificadorCarta;
    }
    
    //**************************************************************

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", identificadorCarta=" + identificadorCarta + '}';
    }
    
    
}

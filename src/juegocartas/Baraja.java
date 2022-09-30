package juegocartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/***********************************************
* Producto.java
* Yellsmy Toj
*
* Esta clase genérica detalla un producto 
* tanto el código, el nombre y su precio de  
* diferentes tipos de datos.
***********************************************/

public class Baraja <T> 
{
    private List<Carta> mazo = new ArrayList<Carta>();
    
    //**************************************************************
    
    public Baraja()
    {
        
    }
    
    //**************************************************************

    public List<Carta> getMazo()
    {
        return mazo;
    }

    public void setMazo(List<Carta> mazo)
    {
        this.mazo = mazo;
    }
   
    //**************************************************************
    
    public void addCarta(String palo, String identificadorCarta)
    {
        Carta c = new Carta(palo, identificadorCarta);
        mazo.add(c);      
    }
    
    //**************************************************************
    
    public int random()
    {
        Random random = new Random();
        int randomIndex = (int)(Math.random()*52);
        return randomIndex;        
    }
    
    //**************************************************************
    
    public void generarCarta(String palo)
    {
        int contador = 1;
        for (int i = 0; i < 13; i++)
        {
            if(contador==1)
            {               
                addCarta(palo, "As");                
                contador+=1;                
            }            
            else if(contador>1 && contador<=10)
            {                 
                String numeroCarta = Integer.toString(contador);
                addCarta(palo, numeroCarta);               
                contador+=1;                
            }
            else if(contador>10 && contador<=13)
            {
                addCarta(palo, "J");
                addCarta(palo, "Q");
                addCarta(palo, "K");
                contador+=3;
            }
        }
    }
    
    //**************************************************************
    
    public void llenarMazo()
    {
        while (true){
            if(mazo.size() ==0)
            {
            generarCarta("Picas");
            }            
            else if(mazo.size()==13)
            {
                generarCarta("Corazón"); 
            }
            else if(mazo.size()== 26)
            {
                generarCarta("Diamante"); 
            }
            else if(mazo.size()==39)
            {
                generarCarta("Trébol"); 
                break;
            }
        }
        
        for (int i = 0; i < mazo.size(); i++)
        {
            System.out.println("Carta es: "+mazo.get(i).toString());     
        }      
    }
    
    //**************************************************************

    public boolean cartasIguales(List<Carta> list, String paloMazo1, String idenMazo1 )
    {
        for (int i = 0; i < list.size(); i++)
        {
            String paloMazo2 = list.get(i).getPalo();
            String idenMazo2 = list.get(i).getIdentificadorCarta();
            if( paloMazo2 == paloMazo1 && idenMazo2 == idenMazo1){
                return true;
            }               
        } 
        return false;
    }
    
    //**************************************************************

    public void barajear()
    {
        List<Carta> mazoBarajeado = new ArrayList<Carta>();
        while(mazo.size() != mazoBarajeado.size())
        {
            int posicionCarta= random();
            Carta cartaMazo1=mazo.get(posicionCarta);
            String paloMazo1 = mazo.get(posicionCarta).getPalo();   
            String idenMazo1 = mazo.get(posicionCarta).getIdentificadorCarta();
            if(!cartasIguales(mazoBarajeado, paloMazo1,idenMazo1 ))
            {
                mazoBarajeado.add(cartaMazo1);             
            }           
        }
        System.out.println("MAZO BARAJEADO");
        for (int i = 0; i < mazoBarajeado.size(); i++)
        {
            System.out.println("Carta es: "+mazoBarajeado.get(i).toString());     
        }
    }    
}
/*
public static final int NAIPE = 40;
    public static void main(String[] args) {

        List<String> baraja = new ArrayList<String>();
        int numCorazon=0;
        int numPicas=0;
        int numDiamantes=0;
        int numTrebol=0;
        for (int i = 0; i < NAIPE; i++){
            int sizeBaraja=baraja.size();
            
            if(sizeBaraja<=9){
                numPicas+= 1;
                String numeroCarta = Integer.toString(numPicas);
                baraja.add(numeroCarta+" de "+"Picas");
                System.out.println(numeroCarta+' '+sizeBaraja);
            }
            else if(sizeBaraja>9 && sizeBaraja<=19){
                numCorazon += 1;
                String numeroCarta = Integer.toString(numCorazon);
                baraja.add(numeroCarta+" de "+"Corazones");
                System.out.println(numeroCarta+' '+sizeBaraja);
            }
            else if(sizeBaraja>19 && sizeBaraja<=29){
                numDiamantes+= 1;
                String numeroCarta = Integer.toString(numDiamantes);
                baraja.add(numeroCarta+" de "+"Diamantes");
                System.out.println(numeroCarta+' '+sizeBaraja);
            }
            else if(sizeBaraja>29 && sizeBaraja<=39){
                numTrebol+= 1;
                String numeroCarta = Integer.toString(numTrebol);
                baraja.add(numeroCarta+" de "+"Treboles");
                System.out.println(numeroCarta+' '+sizeBaraja);
            }
        }
        // Create a TreeSet with the list
        TreeSet<String> tree_set = new TreeSet<String>(baraja);
 
        // Print TreeSet
        System.out.println("TreeSet from List : " + tree_set);
    }
}*/

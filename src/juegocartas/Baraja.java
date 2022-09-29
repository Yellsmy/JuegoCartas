package juegocartas;

import java.util.ArrayList;
import java.util.List;


public class Baraja <T> 
{
    List<Carta> mazo = new ArrayList<Carta>();
    
    public Baraja()
    {
        
    }

    public List<Carta> getMazo()
    {
        return mazo;
    }

    public void setMazo(List<Carta> mazo)
    {
        this.mazo = mazo;
    }
   
    public void addCarta(String palo, String identificadorCarta)
    {
        Carta c = new Carta(palo, identificadorCarta);
        mazo.add(c);      
    }

    /*public String mostrarCartas(){
        String carta = "";
        for (int i = 0; i < mazo.size(); i++){
            carta += mazo.get(i).toString();       
        }
        return carta;
    }*/
    
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


package juegocartas;

/**
 *
 * @author FAMILIA TOJ GARCÍA
 */
public class LlenarBaraja extends Baraja {

    public LlenarBaraja() {
        super();
    }
     
    public void generarCarta(String palo){
        int numero = 1;
        for (int i = 0; i < 13; i++)
        {
            if(numero==1)
            {               
                addCarta(palo, "As");                
                numero+=1;                
            }            
            else if(numero>1 && numero<=10)
            {                 
                String numeroCarta = Integer.toString(numero);
                addCarta(palo, numeroCarta);               
                numero+=1;                
            }
            else if(numero>10 && numero<=13)
            {
                addCarta(palo, "J");
                addCarta(palo, "Q");
                addCarta(palo, "K");
                numero+=3;
            }
        }
    }
    
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
    
}

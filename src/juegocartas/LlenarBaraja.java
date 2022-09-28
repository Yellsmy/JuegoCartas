
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
        for (int i = 0; i < 13; i++){
            if(numero==1){
                
                addCarta(palo, "As");
                
                numero+=1;
                
            }            
            else if(numero>1 && numero<=10){   
                
                String numeroCarta = Integer.toString(numero);
                addCarta(palo, numeroCarta);
                
                numero+=1;
                
            }
            else if(numero>10 && numero<=13){
                addCarta("Picas", "J");
                addCarta("Picas", "Q");
                addCarta("Picas", "K");
                numero+=3;
                System.out.println("Aqui generarcarta");
                System.out.println("dato: "+getMazo());
                System.out.println("numero: "+numero);
                System.out.println("size"+ mazo.size());
            }
        }
    }
    
    public void llenarMazo(){
        int sizeBaraja=mazo.size(); 
        
        //for (int i = -1; i < sizeBaraja; i++){          
            if(sizeBaraja<=13){
                generarCarta("Picas");  
                System.out.println("tamaño es"+sizeBaraja);
            }            
            else if(sizeBaraja>13 && sizeBaraja<=25){
                System.out.println("Aqui Corazones");

                generarCarta("Corazones"); 
            }
            else if(sizeBaraja>25 && sizeBaraja<=38){               
                generarCarta("Diamantes"); 
            }
            else if(sizeBaraja>38 && sizeBaraja<=51){               
                generarCarta("Tréboles"); 
            }
        //}
        
        for (int i = 0; i < sizeBaraja; i++){
            System.out.println("datos: "+getMazo());
        }
    }
    
}

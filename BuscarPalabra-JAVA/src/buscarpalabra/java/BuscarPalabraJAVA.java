/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarpalabra.java;
import java.util.Scanner;
/**
 *
 * @author Horacio Ureña
 */
public class BuscarPalabraJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String parrafo;
        String fraseBuscar;
        
        System.out.println("Digite Un Texto:\n");
        Scanner sc = new Scanner(System.in);
        parrafo = sc.nextLine();
        System.out.println("\n\nDigite La Palabra Que Decea Buscar en el Texto.\n");
        fraseBuscar = sc.nextLine();
        System.out.println(parrafo);
        
        //Verificacion de la Longitud de la cadena de parrafo
        //System.out.println("Longitud: " + parrafo.length());
        
        int validar = parrafo.indexOf(fraseBuscar); //Con esta linea valido si fraseBuscar esta contenida dentro de parrafo
        
        if(validar == -1){
            //Si Validar es Igual a -1 Es Porque fraseBuscar No Esta En El Texto.
            System.out.println("\n\nLa Frase " + fraseBuscar.toUpperCase() + " No Se Encuentra En El Texto.\n\n");
        }
        else{
            /*
            Si Por El Contrario Validar Es Diferente De -1, Entonces Nos Retornara
            La Posicion Donde Inicia fraseBuscar.
            */
            System.out.println("\n\nLa Frase " + fraseBuscar.toUpperCase() + " Si Se Encuentra En El Texto Iniciando En La Posicion [" +
                    validar + "].\n\n");
        }
    }
    
}

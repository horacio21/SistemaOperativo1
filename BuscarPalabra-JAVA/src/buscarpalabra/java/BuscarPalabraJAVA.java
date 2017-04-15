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
        String feaseBuscar;
        
        System.out.println("Digite Un Texto:\n");
        Scanner sc = new Scanner(System.in);
        parrafo = sc.nextLine();
        System.out.println("\n\nDigite La Palabra Que Decea Buscar en el Texto.\n");
        feaseBuscar = sc.nextLine();
        System.out.println(parrafo);
    }
    
}

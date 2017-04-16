package compararimg;

import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Horacio Ureña
 */
public class CompararIMG {

    public static void main(String[] args) {
        try {
            boolean found = false;
            String image1 = "gymDog3.jpg";
            String image2 = "gymDog2.jpg";
            FileReader fr1 = new FileReader ( image1 );
            FileReader fr2 = new FileReader ( image2 );
            while ( true ){
                int pix1 = fr1.read ( );
                int pix2 = fr2.read ( );
                if ( pix1 != pix2 ){
                    break;
                }
                // pix1 y pix2 son  iguales...
                // si una de las dos es -1 se acabo el fichero
                if ( pix1 == -1 ){
                    found = true;
                    break;
                }
            }
            if ( found ) {
                //System.out.println ( "Imagenes iguales" );
                JOptionPane.showMessageDialog(null, "Las Imagenes Son Iguales");
            }
            else {
                //System.out.println ( "Imagenes diferentes" );
                JOptionPane.showMessageDialog(null, "Las Imagenes Son Diferentes");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}

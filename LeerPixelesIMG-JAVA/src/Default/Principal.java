package Default;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Horacio Ureña
 */
public class Principal {
    public static void main(String[] args) {
        
        Principal principal = new Principal();
        principal.leerImg();
        
    }
    
    public void leerImg(){
        File file = new File("C:\\Users\\Horacio Ureña\\Documents\\GitHub\\SistemaOperativo1\\LeerPixelesIMG-JAVA\\src\\IMG\\rgb.png");
        Color color;
        int c;
        
        try{
            BufferedImage buff = ImageIO.read(file);
            
            for(int i = 0; i < buff.getWidth(); i++){
                for(int j = 0; j < buff.getHeight(); j++){
                    color = new Color(buff.getRGB(i, j));
                    c = buff.getRGB(i, j);
                    System.out.print(color + " Valor Hexadecimal = ");
                    System.out.printf("%x\n", c);
                }
            }
        }
        catch (IOException ex){
            System.out.println("Error: " + ex);
        }
    } 
}

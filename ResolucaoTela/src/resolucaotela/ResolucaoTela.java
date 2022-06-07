
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Caio
 */
public class ResolucaoTela {

   
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é: " + d.width + " X " + d.height);
        
    }
    
}


package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Caio
 */
public class IdiomaSistema {


    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}

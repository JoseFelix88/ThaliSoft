package com.thalisoft.main;

import UpperEssential.UpperEssentialLookAndFeel;
import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.vista.index.Contenedor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jose Felix
 */
public class ThaliSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenid@ a THALISOFT");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Edicion().cambiar_skin(2);
                new ControllerContenedor().execute();
            }
        });
    }

}

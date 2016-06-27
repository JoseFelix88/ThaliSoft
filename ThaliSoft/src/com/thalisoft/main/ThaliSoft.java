package com.thalisoft.main;

import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.vista.index.FormAcceso;
import javax.swing.SwingUtilities;

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
//                new ControllerContenedor().execute();
                new FormAcceso().setVisible(true);
            }
        });
    }

}

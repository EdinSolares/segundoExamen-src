package segundoParcial;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;

public class PantallaTerminos extends JFrame {
    private JCheckBox casillaAceptar;
    private JButton botonContinuar;
    private JButton botonRechazar;
    private String nombreUsuario;
    
    public PantallaTerminos(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        setTitle("Términos y Condiciones");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 182, 193)); // Rosado
        
        JTextArea areaTerminos = new JTextArea("TÉRMINOS Y CONDICIONES\n" +
"\n" +
"            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO.\n" +
"            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS.\n" +
"            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n" +
"\n" +
"          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n" +
"          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED\n" +
"          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n" +
"          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n" +
"\n" +
"          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE\n" +
"          http://www.youtube.com/ernestoperezm", 10, 40);
        areaTerminos.setEditable(false);

        casillaAceptar = new JCheckBox("Acepto los términos y condiciones");
        botonContinuar = new JButton("Continuar");
        botonRechazar = new JButton("No acepto");

        botonContinuar.setEnabled(false);

        casillaAceptar.addActionListener(e -> {
            botonContinuar.setEnabled(casillaAceptar.isSelected());
        });

        botonContinuar.addActionListener(e -> {
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(nombreUsuario);
            pantallaPrincipal.setVisible(true);
            dispose();
        });

        botonRechazar.addActionListener(e -> {
            PantallaBienvenida pantallaBienvenida = new PantallaBienvenida();
            pantallaBienvenida.setVisible(true);
            dispose();
        });

        add(new JLabel("Usuario: " + nombreUsuario));
        add(areaTerminos);
        add(casillaAceptar);
        add(botonContinuar);
        add(botonRechazar);
    }

}
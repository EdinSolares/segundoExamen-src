package segundoParcial;

import javax.swing.*;
import java.awt.*;

public class PantallaBienvenida extends JFrame {
    private JTextField campoNombre;
    private JButton botonContinuar;

    public PantallaBienvenida() {
        setTitle("Bienvenido A Distribuidora Solares");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        // Panel para la parte central (entrada de nombre y botón)
        JPanel panelCentral = new JPanel(new FlowLayout());
        panelCentral.setBackground(new Color(255, 182, 193)); 

        JLabel etiquetaBienvenida = new JLabel("Ingrese su Nombre: ");
        campoNombre = new JTextField(20);
        botonContinuar = new JButton("Continuar");

        botonContinuar.addActionListener(e -> {
            if (!campoNombre.getText().trim().isEmpty()) {
                PantallaTerminos pantallaTerminos = new PantallaTerminos(campoNombre.getText());
                pantallaTerminos.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su nombre.");
            }
        });

        panelCentral.add(etiquetaBienvenida);
        panelCentral.add(campoNombre);
        panelCentral.add(botonContinuar);
        
        // Añadir el panel central al centro del BorderLayout
        add(panelCentral, BorderLayout.CENTER);

        // Panel para la etiqueta de derechos, ubicada al sur y centrada
        JPanel panelSur = new JPanel();
        panelSur.setBackground(new Color(255, 182, 193)); // Asegurar que el panel sur tenga el mismo color
        JLabel etiquetaDerechos = new JLabel("©2024 The Solares Retailer Company");
        panelSur.add(etiquetaDerechos);

        // Añadir el panelSur al sur del BorderLayout
        add(panelSur, BorderLayout.SOUTH);
    }
}

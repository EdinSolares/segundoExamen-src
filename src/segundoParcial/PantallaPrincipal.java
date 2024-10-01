package segundoParcial;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JFrame {
    private JTextField campoNombre, campoApellidos, campoResultado;
    private JComboBox<String> comboDepartamento, comboAntiguedad;
    private JButton botonCalcular, botonLimpiar, botonVolver;
    private String nombreUsuario;

    public PantallaPrincipal(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        setTitle("Calculadora de Vacaciones");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        
        //aqui agrego un nuevo boton

        // Establecer color de fondo rosado por defecto
        getContentPane().setBackground(new Color(255, 182, 193)); // Rosado
        
        // Barra de Menú
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");
        JMenu menuAcercaDe = new JMenu("Acerca de");
        
        // Submenú para cambiar color
        JMenu subMenuColor = new JMenu("Cambiar Color");
        JMenuItem itemSalir = new JMenuItem("Salir");
        JMenuItem itemRosado = new JMenuItem("Rosado");
        JMenuItem itemLila = new JMenuItem("Lila");
        JMenuItem itemCeleste = new JMenuItem("Celeste");
        
        subMenuColor.add(itemRosado);
        subMenuColor.add(itemLila);
        subMenuColor.add(itemCeleste);
        
        menuOpciones.add(subMenuColor);
        menuOpciones.add(itemSalir);

        JMenuItem itemAcercaDe = new JMenuItem("Edin Solares");
        menuAcercaDe.add(itemAcercaDe);
        barraMenu.add(menuOpciones);
        barraMenu.add(menuAcercaDe);
        setJMenuBar(barraMenu);
        
        // Eventos para los nuevos ítems de menú
        itemSalir.addActionListener(e -> System.exit(0));
        itemRosado.addActionListener(e -> getContentPane().setBackground(new Color(255, 182, 193))); // Rosado
        itemLila.addActionListener(e -> getContentPane().setBackground(new Color(200, 162, 200)));  // Lila
        itemCeleste.addActionListener(e -> getContentPane().setBackground(new Color(173, 216, 230))); // Celeste
        itemAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(this, "Edin Solares"));

        // Elementos de la interfaz
        campoNombre = new JTextField(20);
        campoApellidos = new JTextField(20);
        campoResultado = new JTextField(20);
        campoResultado.setEditable(false);

        String[] departamentos = {"Atención al cliente", "Logística", "Gerente", "Limpieza"};
        String[] antiguedades = {"1 año", "2-6 años", "7+ años"};

        comboDepartamento = new JComboBox<>(departamentos);
        comboAntiguedad = new JComboBox<>(antiguedades);

        botonCalcular = new JButton("Calcular");
        botonLimpiar = new JButton("Limpiar");
        botonVolver = new JButton("Volver");

        botonCalcular.addActionListener(e -> calcularVacaciones());
        botonLimpiar.addActionListener(e -> limpiarCampos());
        botonVolver.addActionListener(e -> {
            PantallaBienvenida pantallaBienvenida = new PantallaBienvenida();
            pantallaBienvenida.setVisible(true);
            dispose();
        });

        // Añadir componentes
        add(new JLabel("Nombre:"));
        add(campoNombre);
        add(new JLabel("Apellidos:"));
        add(campoApellidos);
        add(new JLabel("Departamento:"));
        add(comboDepartamento);
        add(new JLabel("Antigüedad:"));
        add(comboAntiguedad);
        add(new JLabel("Días de vacaciones:"));
        add(campoResultado);
        add(botonCalcular);
        add(botonLimpiar);
        add(botonVolver);
        add(new JLabel("Usuario: " + nombreUsuario));

        // Panel para la etiqueta de derechos
        JPanel panelSur = new JPanel();
        JLabel etiquetaDerechos = new JLabel("©2024 The Solares Retailer Company");
        panelSur.add(etiquetaDerechos);
        add(panelSur, BorderLayout.PAGE_END);
    }

    private void calcularVacaciones() {
        String departamento = (String) comboDepartamento.getSelectedItem();
        String antiguedad = (String) comboAntiguedad.getSelectedItem();
        Empleado empleado = new Empleado(campoNombre.getText(), campoApellidos.getText(), departamento, antiguedad);
        int diasVacaciones = CalculadoraVacaciones.calcularDiasVacaciones(empleado);
        campoResultado.setText(String.valueOf(diasVacaciones));
    }

    private void limpiarCampos() {
        campoNombre.setText("");
        campoApellidos.setText("");
        campoResultado.setText("");
        comboDepartamento.setSelectedIndex(0);
        comboAntiguedad.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        PantallaPrincipal pantalla = new PantallaPrincipal("UsuarioEjemplo");
        pantalla.setVisible(true);
    }
}
/*Aquí te explico cada parte:

Rojo: El primer número indica la cantidad de rojo.
Verde: El segundo número indica la cantidad de verde.
Azul: El tercer número indica la cantidad de azul.
Por ejemplo:

new Color(255, 182, 193) representa un color rosado. Aquí:
255 (máxima intensidad de rojo)
182 (intensidad media de verde)
193 (intensidad alta de azul)*/

/*JButton s =new JButton();
        s.setText("buenas noticias");
        s.setBounds(200, 1000, 100, 30);
        add(s);*/
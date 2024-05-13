package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {

    public Game() {
        setTitle("Batalla Naval");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        
        // Crear layout principal con BorderLayout y espaciado
        setLayout(new BorderLayout(10, 10)); // Espacio horizontal y vertical de 10 píxeles

        // Crear los tres paneles con espaciado
        JPanel tablero1 = crearTablero();
        JPanel tablero2 = crearTablero();
        JPanel botonesPanel = crearBotonesPanel();

        // Añadir los paneles al layout principal con espaciado
        add(tablero1, BorderLayout.WEST);
        add(tablero2, BorderLayout.CENTER);
        add(botonesPanel, BorderLayout.SOUTH);

        // Ajustar tamaño y hacer visible la ventana
        setSize(800, 600); // Tamaño arbitrario
        setVisible(true);
    }

    // Método para crear un panel que simula un tablero de 10x10 con botones
    private JPanel crearTablero() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10, 5, 5)); // Layout de 10x10 con espaciado horizontal y vertical de 5 píxeles

        // Crear y añadir botones al tablero
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                JButton boton = new JButton();
                panel.add(boton);
            }
        }

        // Añadir espacios alrededor del panel
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espacio de 10 píxeles en todos los lados

        return panel;
    }

    // Método para crear el panel con los botones inferiores
    private JPanel crearBotonesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4, 10, 0)); // Layout de 1 fila y 4 columnas con espaciado horizontal de 10 píxeles

        // Crear botones
        JButton boton1 = new JButton("Iniciar");
        JButton boton2 = new JButton("Ver Clasificación");
        JButton boton3 = new JButton("Configuración");
        JButton boton4 = new JButton("Salir");

        // Añadir botones al panel con espacios
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);

        // Añadir espacios alrededor del panel
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espacio de 10 píxeles en todos los lados
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Game::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand(); // Obtener el comando del evento
        switch (command) {
            case "Iniciar":
                // Lógica para iniciar el juego
                break;
            case "Ver Clasificación":
                // Lógica para ver la clasificación
                break;
            case "Configuración":
                // Lógica para abrir la ventana de configuración
                break;
            case "Salir":
                // Lógica para salir del juego
                System.exit(0);
                break;
            default:
                // Lógica para manejar otros eventos
                break;
        }
    }
}

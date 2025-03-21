import javax.swing.*;
import java.awt.*;

public class Ventana extends Canvas {
    private static final long serialVersionUID = 1L;//para saber si estamos en la msima clase o saber si es otra
    private static final int ALTO = 600;//Alto de la ventana
    private static final int ANCHO = 800;//Ancho de la ventana
    private static final String NOMBRE="JUEGOS";//Nombre del juego

    private static JFrame ventana;//Ventana que utiliza java

    private Ventana() {
        setPreferredSize(new Dimension(ANCHO, ALTO));//Para poner el ancho y el alto de la ventana del videojuego
        ventana = new JFrame(NOMBRE);//POner el nombre de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esto es para parar la ejecución del juego cuando cierras Idea
        ventana.setResizable(false);//Para que el usuario no ajuste las ventanas
        ventana.setLayout(new BorderLayout());//Añado un gestor para añadir un diseño de la ventana.
        ventana.add(this, BorderLayout.CENTER);// Añadimos nuetro canvas en el centro de la ventana
        ventana.pack();//para ajustar los datos de dentro a las medidas de las ventanas
        ventana.setLocationRelativeTo(null);//fiajra la ventana en el centro del escritorio
        ventana.setVisible(true);//para hacer la ventana visible


    }
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }

}
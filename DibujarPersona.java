
package dibujarpersona;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujarPersona extends JPanel{
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cabeza
        g.drawOval(150, 50, 100, 100);
        
        // Cuerpo
        g.drawLine(200, 150, 200, 300);
        
        // Brazos
        g.drawLine(200, 200, 100, 250);
        g.drawLine(200, 200, 300, 250);
        
        // Piernas
        g.drawLine(200, 300, 150, 400);
        g.drawLine(200, 300, 250, 400);
    }
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo de Persona");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.add(new DibujarPersona());
        frame.setVisible(true);
    }
    
}

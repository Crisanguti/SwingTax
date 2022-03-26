import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton calcularButton;
    private JPanel taxPanel;



    public MainForm() {


        calcularButton.addActionListener(new ActionListener() { // el actionlistener del botón calcular, escucha y ejecuta el código de dentro
            @Override
            public void actionPerformed(ActionEvent e) {
            double Precio = Double.parseDouble(pricePane.getText());
            double IVA = Double.parseDouble(taxPane.getText());
            double Total = Precio + Precio*IVA/100;
            totalPane.setText(Double.toString(Total));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax"); //creamos un frame para mostrar en pantalla la app con su nombre
        frame.setContentPane(new MainForm().taxPanel); //indicamos el panel principal a mostrar en la app
        frame.setVisible(true); //aquí hacemos la app visible
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //aquí cerramos el programa y se para también en IJ
        frame.setSize(300, 250); //indicar el tamaño cuando se ejecute

    }
}

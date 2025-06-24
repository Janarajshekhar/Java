package Project2;

import javax.swing.*;
import java.awt.event.*;

public class UnitConverter extends JFrame {
    private JTextArea t1;
    private JComboBox c1;
    private JTextArea t2;
    private JComboBox c2;
    private JPanel panel;

    public void initComponents() {
        panel.setLayout(null);
        c1 = new JComboBox<>(new String[]{"Kilometre", "Metre", "Centimetre","millimetre","micrometre"});
        c2 = new JComboBox<>(new String[]{"Kilometre", "Metre", "Centimetre","millimetre","micrometre"});
        t1.setBounds(50,50,100,20);
        c1.setBounds(200,50,100,20);
        t2.setBounds(50,100,100,20);
        c2.setBounds(200,100,100,20);
        panel.add(t1);
        panel.add(c1);
        panel.add(t2);
        panel.add(c2);
        
        ActionListener convertListener = e -> convertUnits();
        c1.addActionListener(convertListener);
        c2.addActionListener(convertListener);
        t1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                convertUnits();
            }
        });
    }

     private void convertUnits() {
        try {
            double input = Double.parseDouble(t1.getText());
            int from = c1.getSelectedIndex();
            int to = c2.getSelectedIndex();
            // Conversion factors to metre
            double[] factors = {1000, 1, 0.01, 0.001, 0.000001};
            double inMetres = input * factors[from];
            double result = inMetres / factors[to];
            t2.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            t2.setText("");
        }
    }

    UnitConverter(){
        initComponents();
        setContentPane(panel);
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

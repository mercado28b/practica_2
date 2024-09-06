import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CALCULADORA1 {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton SUMARButton;
    private JButton RESTARButton;
    private JButton MULTIPLICARButton;
    private JButton DIVIDIRButton;

    public CALCULADORA1() {
        SUMARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());

                JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + (a + b));

                textField1.setText("");
                textField1.setText("");


            }
        });

        RESTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textField1.getText());
                    int b = Integer.parseInt(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La resta de los numeros es: " + (a - b));

                    textField1.setText("");
                    textField1.setText("");
            }
        });

        MULTIPLICARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(textField1.getText());
                    int b = Integer.parseInt(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La multiplicacon de los numeros es: " + (a * b));

                    textField1.setText("");
                    textField1.setText("");

            }
        });
        DIVIDIRButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());

                JOptionPane.showMessageDialog(null, "La divicion de los numeros es: " + (a / b));

                textField1.setText("");
                textField1.setText("");

            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

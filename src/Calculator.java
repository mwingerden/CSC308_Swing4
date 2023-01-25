import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.createAndShowGUI();
    }

    public void createAndShowGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        add(jPanel);
        JTextField jTextField = new JTextField("0");
        jTextField.setEditable(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        jPanel.add(jTextField, c);
        add(jPanel);

        JButton button0 = new JButton("0");JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");JButton button9 = new JButton("9");

        JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
        JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("x");
        JButton buttonClear = new JButton("C");
        JButton buttonEquals = new JButton("=");

        c.weightx = .5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        jPanel.add(button7, c);
        c.gridx = 1;
        c.gridy = 1;
        jPanel.add(button8, c);
        c.gridx = 2;
        c.gridy = 1;
        jPanel.add(button9, c);
        c.gridx = 3;
        c.gridy = 1;
        jPanel.add(buttonPlus, c);
        c.gridx = 0;
        c.gridy = 2;
        jPanel.add(button4, c);
        c.gridx = 1;
        c.gridy = 2;
        jPanel.add(button5, c);
        c.gridx = 2;
        c.gridy = 2;
        jPanel.add(button6, c);
        c.gridx = 3;
        c.gridy = 2;
        jPanel.add(buttonMinus, c);
        c.gridx = 0;
        c.gridy = 3;
        jPanel.add(button1, c);
        c.gridx = 1;
        c.gridy = 3;
        jPanel.add(button2, c);
        c.gridx = 2;
        c.gridy = 3;
        jPanel.add(button3, c);
        c.gridx = 3;
        c.gridy = 3;
        jPanel.add(buttonMultiply, c);
        c.gridx = 0;
        c.gridy = 4;
        jPanel.add(buttonClear, c);
        c.gridx = 1;
        c.gridy = 4;
        jPanel.add(button0, c);
        c.gridx = 2;
        c.gridy = 4;
        jPanel.add(buttonEquals, c);
        c.gridx = 3;
        c.gridy = 4;
        jPanel.add(buttonDivide, c);

        setTitle("calculator");
        setSize(450, 350);
        setVisible(true);
    }
}
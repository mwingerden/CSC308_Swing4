import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculator class creates a basic looking calculator in Java Swing that can add, subtract, multiply, and divide
 * only integer numbers.
 *
 * @author Matthew Wingerden
 * @author Pablo Nguyen
 * @author Juan Custodio
 * @author Kevin Henderson
 * @author Nathan Ho
 * @version 1.0
 * @since 2023-25-01
 *
 */
public class Calculator extends JFrame implements ActionListener {
    private JTextField text;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private String accumulator = "";
    private String operator = "";

    /**
     * The main method that creates an instance of the Calculator class and runs and displays GUI
     *
     **/
    public static void main() {
        Calculator calc = new Calculator();
        calc.createAndShowGUI();
    }

    /**
     * The method creates a GUI of a calculator. The method adds the text box and a grid with buttons
     * to the window.
     *
     */
    public void createAndShowGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel window = new JPanel(new BorderLayout());

        text = new JTextField();
        text.setEditable(false);
        text.setFont(new Font("Helvetica", Font.PLAIN, 20));
        text.setMinimumSize(new Dimension(100,500));
        window.add(text, BorderLayout.NORTH);

        JPanel calculator = new JPanel(new GridLayout(4,4, 10, 10));

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        JButton buttonEquals = new JButton("=");
        JButton buttonClear = new JButton("C");

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);

        calculator.add(button7);
        calculator.add(button8);
        calculator.add(button9);
        calculator.add(buttonAdd);
        calculator.add(button4);
        calculator.add(button5);
        calculator.add(button6);
        calculator.add(buttonSubtract);
        calculator.add(button1);
        calculator.add(button2);
        calculator.add(button3);
        calculator.add(buttonMultiply);
        calculator.add(buttonClear);
        calculator.add(button0);
        calculator.add(buttonEquals);
        calculator.add(buttonDivide);

        window.add(calculator, BorderLayout.CENTER);

        add(window);

        setTitle("Calculator");
        setSize(450, 350);
        setVisible(true);
    }

    /**
     * This method contains implementation of a calculator that only does basic arithmetic on integers only.
     * The method can only handle one operation at a time; you cannot add additional arithmetic after the
     * conclusion of an operation.
     *
     * @param e     Takes a ActionEvent variable that holds the information of what button was clicked
     *              on the calculator.
     *
     **/
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" -> {
                if (accumulator.equals("")) {
                    this.text.setText("");
                    this.text.setText(e.getActionCommand());
                } else {
                    this.text.setText(this.text.getText() + e.getActionCommand());
                }
                if(operator.equals("")) {
                    this.accumulator = this.text.getText();
                }
            }
        }

        if(!accumulator.equals("")) {
            if(e.getActionCommand().equals("+")) {
                this.operator = e.getActionCommand();
                this.text.setText("");
                JButton jButton = (JButton)e.getSource();
                jButton.setBackground(Color.YELLOW);
            }
            else if(e.getActionCommand().equals("-")) {
                this.operator = e.getActionCommand();
                this.text.setText("");
                JButton jButton = (JButton)e.getSource();
                jButton.setBackground(Color.YELLOW);
            }
            else if(e.getActionCommand().equals("*")) {
                this.operator = e.getActionCommand();
                this.text.setText("");
                JButton jButton = (JButton)e.getSource();
                jButton.setBackground(Color.YELLOW);
            }
            else if(e.getActionCommand().equals("/")) {
                this.operator = e.getActionCommand();
                this.text.setText("");
                JButton jButton = (JButton)e.getSource();
                jButton.setBackground(Color.YELLOW);
            }
            else if(e.getActionCommand().equals("C")) {
                this.accumulator = "";
                this.operator = "";
                this.text.setText("");
                this.buttonAdd.setBackground(null);
                this.buttonSubtract.setBackground(null);
                this.buttonMultiply.setBackground(null);
                this.buttonDivide.setBackground(null);
            }
            else if(e.getActionCommand().equals("=")) {
                switch (operator) {
                    case "+" -> {
                        this.text.setText(Integer.toString(Integer.parseInt(this.accumulator) + Integer.parseInt(this.text.getText())));
                        this.buttonAdd.setBackground(null);
                    }
                    case "-" -> {
                        this.text.setText(Integer.toString(Integer.parseInt(this.accumulator) - Integer.parseInt(this.text.getText())));
                        this.buttonSubtract.setBackground(null);
                    }
                    case "*" -> {
                        this.text.setText(Integer.toString(Integer.parseInt(this.accumulator) * Integer.parseInt(this.text.getText())));
                        this.buttonMultiply.setBackground(null);
                    }
                    case "/" -> {
                        this.text.setText(Integer.toString(Integer.parseInt(this.accumulator) / Integer.parseInt(this.text.getText())));
                        this.buttonDivide.setBackground(null);
                    }
                }
                this.accumulator = "";
                this.operator = "";
            }
        }
    }
}
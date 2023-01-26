import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField text;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private String accumulator = "";
    private String operator = "";

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.createAndShowGUI();
    }

    public void createAndShowGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel window = new JPanel(new GridLayout(2, 1));

        text = new JTextField();
        text.setEditable(false);
        window.add(text);

        JPanel calculator = new JPanel(new GridLayout(4,4));

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

        window.add(calculator);

        add(window);
//        JPanel jPanel = new JPanel(new GridBagLayout());
//        GridBagConstraints c = new GridBagConstraints();
//        add(jPanel);
//        jTextField = new JTextField();
//        jTextField.setEditable(false);
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0;
//        c.gridx = 0;
//        c.gridy = 0;
//        c.gridwidth = 4;
//        jPanel.add(jTextField, c);
//        add(jPanel);
//
//        JButton button0 = new JButton("0");JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");JButton button5 = new JButton("5");
//        JButton button6 = new JButton("6");JButton button7 = new JButton("7");
//        JButton button8 = new JButton("8");JButton button9 = new JButton("9");
//
//        JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
//        JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("x");
//        JButton buttonClear = new JButton("C");
//        JButton buttonEquals = new JButton("=");
//
//        c.weightx = .5;
//        c.gridwidth = 1;
//        c.gridx = 0;
//        c.gridy = 1;
//        button7.addActionListener(this);
//        jPanel.add(button7, c);
//        c.gridx = 1;
//        c.gridy = 1;
//        button8.addActionListener(this);
//        jPanel.add(button8, c);
//        c.gridx = 2;
//        c.gridy = 1;
//        button9.addActionListener(this);
//        jPanel.add(button9, c);
//        c.gridx = 3;
//        c.gridy = 1;
//        buttonPlus.addActionListener(this);
//        jPanel.add(buttonPlus, c);
//        c.gridx = 0;
//        c.gridy = 2;
//        button4.addActionListener(this);
//        jPanel.add(button4, c);
//        c.gridx = 1;
//        c.gridy = 2;
//        button5.addActionListener(this);
//        jPanel.add(button5, c);
//        c.gridx = 2;
//        c.gridy = 2;
//        button6.addActionListener(this);
//        jPanel.add(button6, c);
//        c.gridx = 3;
//        c.gridy = 2;
//        buttonMinus.addActionListener(this);
//        jPanel.add(buttonMinus, c);
//        c.gridx = 0;
//        c.gridy = 3;
//        button1.addActionListener(this);
//        jPanel.add(button1, c);
//        c.gridx = 1;
//        c.gridy = 3;
//        button2.addActionListener(this);
//        jPanel.add(button2, c);
//        c.gridx = 2;
//        c.gridy = 3;
//        button3.addActionListener(this);
//        jPanel.add(button3, c);
//        c.gridx = 3;
//        c.gridy = 3;
//        buttonMultiply.addActionListener(this);
//        jPanel.add(buttonMultiply, c);
//        c.gridx = 0;
//        c.gridy = 4;
//        buttonClear.addActionListener(this);
//        jPanel.add(buttonClear, c);
//        c.gridx = 1;
//        c.gridy = 4;
//        button0.addActionListener(this);
//        jPanel.add(button0, c);
//        c.gridx = 2;
//        c.gridy = 4;
//        buttonEquals.addActionListener(this);
//        jPanel.add(buttonEquals, c);
//        c.gridx = 3;
//        c.gridy = 4;
//        buttonDivide.addActionListener(this);
//        jPanel.add(buttonDivide, c);

        setTitle("Calculator");
        setSize(450, 350);
        setVisible(true);
    }

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



//        if(e.getActionCommand().equals("+")) {
//            this.accumulator = text.getText();
//            this.operator = e.getActionCommand();
//            this.text.setText("");
//            JButton jButton = (JButton)e.getSource();
//            jButton.setBackground(Color.YELLOW);
//        }
//        else if(e.getActionCommand().equals("C")) {
//            this.text.setText("");
//        }
//        else if(e.getActionCommand().equals("=")) {
//            if(operator.equals("+")) {
//                text.setText(Integer.toString(Integer.parseInt(accumulator) + Integer.parseInt(text.getText())));
//            }
//        }
//        else {
//            this.text.setText(this.text.getText() + e.getActionCommand());
//        }
//        System.out.println(e.getActionCommand());
    }
}
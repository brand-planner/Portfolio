import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CalculatorGUI extends JFrame {

    private JButton Num1;
    private JButton Num2;
    private JButton Num3;
    private JButton Num4;
    private JButton Num5;
    private JButton Num6;
    private JButton Num7;
    private JButton Num8;
    private JButton Num9;
    private JButton Num0;
    private JButton Equal;
    private JButton Add;
    private JButton Subtract;
    private JButton Multiply;
    private JButton Divide;
    private JButton Solve;
    private JButton Clear;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    public CalculatorGUI() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p1.add(Num1 = new JButton("1"));
        p1.add(Num2 = new JButton("2"));
        p1.add(Num3 = new JButton("3"));
        p1.add(Num4 = new JButton("4"));
        p1.add(Num5 = new JButton("5"));
        p1.add(Num6 = new JButton("6"));
        p1.add(Num7 = new JButton("7"));
        p1.add(Num8 = new JButton("8"));
        p1.add(Num9 = new JButton("9"));
        p1.add(Num0 = new JButton("0"));
        p1.add(Clear = new JButton("C"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        p3.add(Add = new JButton("+"));
        p3.add(Subtract = new JButton("-"));
        p3.add(Multiply = new JButton("*"));
        p3.add(Divide = new JButton("/"));
        p3.add(Solve = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);

        add(p);

        Num1.addActionListener(new ListenToOne());
        Num2.addActionListener(new ListenToTwo());
        Num3.addActionListener(new ListenToThree());
        Num4.addActionListener(new ListenToFour());
        Num5.addActionListener(new ListenToFive());
        Num6.addActionListener(new ListenToSix());
        Num7.addActionListener(new ListenToSeven());
        Num8.addActionListener(new ListenToEight());
        Num9.addActionListener(new ListenToNine());
        Num0.addActionListener(new ListenToZero());

        Add.addActionListener(new ListenToAdd());
        Subtract.addActionListener(new ListenToSubtract());
        Multiply.addActionListener(new ListenToMultiply());
        Divide.addActionListener(new ListenToDivide());
        Solve.addActionListener(new ListenToSolve());
        Clear.addActionListener(new ListenToClear());
    } //JavaCaluclator()

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = jtfResult.getText();
            jtfResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(jtfResult.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = SolveTEMP / TEMP;
            jtfResult.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	CalculatorGUI calc = new CalculatorGUI();
        calc.pack();
        calc.setLocationRelativeTo(null);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);}}
/*
Kadin Henningham
May 1, 2024
COMP163-003
Using GUI and three libraries to make a new calculator application that is able to
perform basic math as well as other functions like trig functions
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
    JFrame frame = new JFrame("Calculator");
    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton decimalButton = new JButton();
    JButton mod = new JButton();
    JButton equalsButton = new JButton();
    JButton times = new JButton();
    JButton divide = new JButton();
    JButton plus = new JButton();
    JButton minus = new JButton();
    JButton squared = new JButton();
    JButton cubed = new JButton();
    JButton clear = new JButton();
    JButton plusMinus = new JButton();
    JButton percent = new JButton();
    JButton fraction = new JButton();
    JButton squareRoot = new JButton();
    JButton sinButton = new JButton();
    JButton cosButton = new JButton();
    JButton tanButton = new JButton();
    JButton arcCosButton = new JButton();
    JButton arcSinButton = new JButton();
    JButton arcTanButton = new JButton();
    JButton hSinButton = new JButton();
    JButton hCosButton = new JButton();
    JButton hTanButton = new JButton();
    JButton tenExponentButton = new JButton();
    JButton logButton = new JButton();
    JButton lnButton = new JButton();
    JButton absButton = new JButton();
    JButton exitButton = new JButton();
    JTextField inputField = new JTextField();
    JTextField outputField = new JTextField("0");
    String currentScreen = "";
    String operators = "a";
    double firstNum = 0;
    double secondNum = 0;
    double solution = 0;
    JButton[] numberButtons = new JButton[10];

    public Calculator(){
        // Setting bounds for different buttons
        button0.setBounds(50, 300, 50, 50);
        button1.setBounds(0, 150, 50, 50);
        button2.setBounds(50, 150, 50, 50);
        button3.setBounds(100, 150, 50, 50);
        button4.setBounds(100, 200, 50, 50);
        button5.setBounds(50, 200, 50, 50);
        button6.setBounds(0, 200, 50, 50);
        button7.setBounds(0, 250, 50, 50);
        button8.setBounds(50, 250, 50, 50);
        button9.setBounds(100, 250, 50, 50);
        decimalButton.setBounds(100, 300, 50, 50);
        mod.setBounds(200, 300, 50, 50);
        equalsButton.setBounds(150,300,50,50);
        times.setBounds(150,250,50,50);
        divide.setBounds(150,200,50,50);
        plus.setBounds(150, 150, 50, 50);
        minus.setBounds(200, 150, 50, 50);
        squared.setBounds(200, 200, 50, 50);
        cubed.setBounds(200,250,50,50);
        clear.setBounds(0,300,50,50);
        plusMinus.setBounds(250,300,50,50);
        percent.setBounds(250,250,50,50);
        fraction.setBounds(250,200,50,50);
        squareRoot.setBounds(250,150,50,50);
        sinButton.setBounds(300,150,50,50);
        cosButton.setBounds(300,200,50,50);
        tanButton.setBounds(300,250,50,50);
        arcSinButton.setBounds(300,300,50,50);
        arcCosButton.setBounds(350,300,50,50);
        arcTanButton.setBounds(350,250,50,50);
        hSinButton.setBounds(350,200,50,50);
        hCosButton.setBounds(350,150,50,50);
        hTanButton.setBounds(400,150,50,50);
        logButton.setBounds(400,200,50,50);
        lnButton.setBounds(400,250,50,50);
        absButton.setBounds(400,300,50,50);
        exitButton.setBounds(450,300,50,50);
        tenExponentButton.setBounds(450,250,50,50);
        inputField.setBounds(0,0,500,50);
        outputField.setBounds(0,100,500,50);

        // Setting text for buttons, positioning, and adding action listeners starting with button0
        button0.setText("0");
        button0.addActionListener(this);
        button0.setHorizontalTextPosition(JButton.CENTER);
        button0.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #1, positioning, and setting action listeners
        button1.setText("1");
        button1.addActionListener(this);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #2, positioning, and setting action listeners
        button2.setText("2");
        button2.addActionListener(this);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #3, positioning, and setting action listeners
        button3.setText("3");
        button3.addActionListener(this);
        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #4, positioning, and setting action listeners
        button4.setText("4");
        button4.addActionListener(this);
        button4.setHorizontalTextPosition(JButton.CENTER);
        button4.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #5, positioning, and setting action listeners
        button5.setText("5");
        button5.addActionListener(this);
        button5.setHorizontalTextPosition(JButton.CENTER);
        button5.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #6, positioning, and setting action listeners
        button6.setText("6");
        button6.addActionListener(this);
        button6.setHorizontalTextPosition(JButton.CENTER);
        button6.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #7, positioning, and setting action listeners
        button7.setText("7");
        button7.addActionListener(this);
        button7.setHorizontalTextPosition(JButton.CENTER);
        button7.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #8, positioning, and setting action listeners
        button8.setText("8");
        button8.addActionListener(this);
        button8.setHorizontalTextPosition(JButton.CENTER);
        button8.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for numbered button #9, positioning, and setting action listeners
        button9.setText("9");
        button9.addActionListener(this);
        button9.setHorizontalTextPosition(JButton.CENTER);
        button9.setVerticalTextPosition(JButton.BOTTOM);

        // Set button text for the decimal, positioning, and setting action listeners
        decimalButton.setText(".");
        decimalButton.addActionListener(this);
        decimalButton.setHorizontalTextPosition(JButton.CENTER);
        decimalButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for modulo button, positioning, and setting action listeners
        mod.setText("MOD");
        mod.addActionListener(this);
        mod.setHorizontalTextPosition(JButton.CENTER);
        mod.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for multiply button, positioning, and setting action listeners
        times.setText("×");
        times.addActionListener(this);
        times.setHorizontalTextPosition(JButton.CENTER);
        times.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for division button, positioning, and setting action listeners
        divide.setText("÷");
        divide.addActionListener(this);
        divide.setHorizontalTextPosition(JButton.CENTER);
        divide.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for addition button, positioning, and setting action listeners
        plus.setText("+");
        plus.addActionListener(this);
        plus.setHorizontalTextPosition(JButton.CENTER);
        plus.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for subtraction button, positioning, and setting action listeners
        minus.setText("-");
        minus.addActionListener(this);
        minus.setHorizontalTextPosition(JButton.CENTER);
        minus.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for squared button, positioning, and setting action listeners
        squared.setText("x²");
        squared.addActionListener(this);
        squared.setHorizontalTextPosition(JButton.CENTER);
        squared.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for cubed button, positioning, and setting action listeners
        cubed.setText("x³");
        cubed.addActionListener(this);
        cubed.setHorizontalTextPosition(JButton.CENTER);
        cubed.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for clear button, positioning, and setting action listeners
        clear.setText("C");
        clear.addActionListener(new ActionListener() {
            // Clear button clears the input and output fields, resets the operators fields, resets the both numbers and solution
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == clear){
                    inputField.setText("");
                    outputField.setText("0");
                    operators = "a";
                    firstNum = 0;
                    secondNum = 0;
                    solution = 0;
                }
            }
        });
        clear.setHorizontalTextPosition(JButton.CENTER);
        clear.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for negative button, positioning, and setting action listeners
        plusMinus.setText("±");
        plusMinus.addActionListener(this);
        plusMinus.setHorizontalTextPosition(JButton.CENTER);
        plusMinus.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for percent button, positioning, and setting action listeners
        percent.setText("%");
        percent.addActionListener(this);
        percent.setHorizontalTextPosition(JButton.CENTER);
        percent.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for fraction button, positioning, and setting action listeners
        fraction.setText("1/n");
        fraction.addActionListener(this);
        fraction.setHorizontalTextPosition(JButton.CENTER);
        fraction.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for square root button, positioning, and setting action listeners
        squareRoot.setText("√");
        squareRoot.addActionListener(this);
        squareRoot.setHorizontalTextPosition(JButton.CENTER);
        squareRoot.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for sin button, positioning, and setting action listeners
        sinButton.setText("sin");
        sinButton.addActionListener(this);
        sinButton.setHorizontalTextPosition(JButton.CENTER);
        sinButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for cos button, positioning, and setting action listeners
        cosButton.setText("cos");
        cosButton.addActionListener(this);
        cosButton.setHorizontalTextPosition(JButton.CENTER);
        cosButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for tan button, positioning, and setting action listeners
        tanButton.setText("tan");
        tanButton.addActionListener(this);
        tanButton.setHorizontalTextPosition(JButton.CENTER);
        tanButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for arcsin button, positioning, and setting action listeners
        arcSinButton.setText("asin");
        arcSinButton.addActionListener(this);
        arcSinButton.setHorizontalTextPosition(JButton.CENTER);
        arcSinButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for arccos button, positioning, and setting action listeners
        arcCosButton.setText("acos");
        arcCosButton.addActionListener(this);
        arcCosButton.setHorizontalTextPosition(JButton.CENTER);
        arcCosButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for arctan button, positioning, and setting action listeners
        arcTanButton.setText("atan");
        arcTanButton.addActionListener(this);
        arcTanButton.setHorizontalTextPosition(JButton.CENTER);
        arcTanButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for sinh button, positioning, and setting action listeners
        hSinButton.setText("sinh");
        hSinButton.addActionListener(this);
        hSinButton.setHorizontalTextPosition(JButton.CENTER);
        hSinButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for cosh button, positioning, and setting action listeners
        hCosButton.setText("cosh");
        hCosButton.addActionListener(this);
        hCosButton.setHorizontalTextPosition(JButton.CENTER);
        hCosButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for tanh button, positioning, and setting action listeners
        hTanButton.setText("tanh");
        hTanButton.addActionListener(this);
        hTanButton.setHorizontalTextPosition(JButton.CENTER);
        hTanButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for log button, positioning, and setting action listeners
        logButton.setText("log");
        logButton.addActionListener(this);
        logButton.setHorizontalTextPosition(JButton.CENTER);
        logButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for ln button, positioning, and setting action listeners
        lnButton.setText("ln");
        lnButton.addActionListener(this);
        lnButton.setHorizontalTextPosition(JButton.CENTER);
        lnButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for absolute value button, positioning, and setting action listeners
        absButton.setText("abs");
        absButton.addActionListener(this);
        absButton.setHorizontalTextPosition(JButton.CENTER);
        absButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for ten to the raised button, positioning, and setting action listeners
        tenExponentButton.setText("10^n");
        tenExponentButton.addActionListener(this);
        tenExponentButton.setHorizontalTextPosition(JButton.CENTER);
        tenExponentButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for exit button, positioning, and setting action listeners
        // Added functionality to the button
        exitButton.setText("EXIT");
        exitButton.addActionListener(new ActionListener() {
            // Exits the application
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Set button text for equals button, positioning, and setting action listeners
        equalsButton.setText("=");
        equalsButton.addActionListener(this);
        equalsButton.setHorizontalTextPosition(JButton.CENTER);
        equalsButton.setVerticalTextPosition(JButton.HORIZONTAL);

        // Put buttons in an array to iterate through and add action listeners,
        numberButtons[0] = button0;
        numberButtons[1] = button1;
        numberButtons[2] = button2;
        numberButtons[3] = button3;
        numberButtons[4] = button4;
        numberButtons[5] = button5;
        numberButtons[6] = button6;
        numberButtons[7] = button7;
        numberButtons[8] = button8;
        numberButtons[9] = button9;

        // Set frame size and other properties
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.pink);
        frame.setVisible(true);

        // Adding buttons to the frame
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(decimalButton);
        frame.add(mod);
        frame.add(equalsButton);
        frame.add(times);
        frame.add(divide);
        frame.add(plus);
        frame.add(minus);
        frame.add(squared);
        frame.add(cubed);
        frame.add(clear);
        frame.add(plusMinus);
        frame.add(percent);
        frame.add(fraction);
        frame.add(squareRoot);
        frame.add(sinButton);
        frame.add(cosButton);
        frame.add(tanButton);
        frame.add(arcSinButton);
        frame.add(arcCosButton);
        frame.add(arcTanButton);
        frame.add(hSinButton);
        frame.add(hCosButton);
        frame.add(hTanButton);
        frame.add(logButton);
        frame.add(lnButton);
        frame.add(absButton);
        frame.add(exitButton);
        frame.add(tenExponentButton);
        frame.add(inputField);
        frame.add(outputField);

        // Setting properties for input/output field
        inputField.setEditable(false);
        outputField.setEditable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handles the number buttons and performing calculations
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                inputField.setText(inputField.getText().concat(String.valueOf(i)));
            }
        }
        // Try-catch block to handle excpetions
        try {
            if (inputField.getText().isEmpty()){
                // Throws an exception if the input field is empty and prompts user to clear the screen and enter a new number
                throw new Exception("Error: Clear and enter a new number");
            }

            if (e.getSource() == decimalButton) {
                inputField.setText(inputField.getText().concat("."));
            }

            // Setting action listeners for basic math functions
            if (e.getSource() == plus) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "+";
                    inputField.setText("");
                } else {
                    firstNum += 0;
                    operators = "+";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == minus) {
                // If statement makes sure that there is always something on the input field and allows chaining
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "-";
                    inputField.setText("");
                } else {
                    firstNum = 0;
                    operators = "-";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == times) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "*";
                    inputField.setText("");
                } else {
                    firstNum = 0;
                    operators = "*";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == divide) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "/";
                    inputField.setText("");
                } else {
                    firstNum = solution;
                    operators = "/";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == mod) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "mod";
                    inputField.setText("");
                } else {
                    firstNum = 0;
                    operators = "mod";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == percent) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());
                    operators = "%";
                    inputField.setText("");
                } else {
                    firstNum = 0;
                    operators = "%";
                }
            }
            // Setting action listeners for basic math functions
            if (e.getSource() == fraction) {
                if (!inputField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(inputField.getText());

                    if (firstNum == 0){
                        // Throws an exception if the inputted number is 0
                        throw new Exception("1 / 0 fraction");
                    }

                    solution = 1 / firstNum;
                    outputField.setText(String.valueOf(solution));
                    firstNum = solution;
                    inputField.setText(String.valueOf(solution));
                }
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == sinButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.sin(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == cosButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.cos(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == tanButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.tan(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == arcSinButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.asin(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == arcCosButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.acos(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == arcTanButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.atan(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == hSinButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.sinh(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == hCosButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.cosh(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate trig functions
            if (e.getSource() == hTanButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.tanh(Math.toRadians(firstNum));
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate algebraic functions
            if (e.getSource() == logButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.log(firstNum);
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using the math module to calculate algebraic functions
            if (e.getSource() == lnButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.log10(firstNum);
                firstNum = solution;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Setting action listeners for exponents using basic math
            if (e.getSource() == squared) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = firstNum * firstNum;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Setting action listeners for exponents using basic math
            if (e.getSource() == cubed) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = firstNum * firstNum * firstNum;
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using math package to add functionality to the square root button
            if (e.getSource() == squareRoot) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.sqrt(firstNum);
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using math package to add functionality to absoulte value button
            if (e.getSource() == absButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.abs(firstNum);
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using math package to add functionality to 10 to the power button
            if (e.getSource() == tenExponentButton) {
                firstNum = Double.parseDouble(inputField.getText());
                solution = Math.pow(10, firstNum);
                outputField.setText(String.valueOf(solution));
                firstNum = solution;
                inputField.setText(String.valueOf(solution));
            }
            // Using a temporary value to change the number on the input field into a negative
            if (e.getSource() == plusMinus) {
                double temp = Double.parseDouble(inputField.getText());
                temp *= -1;
                inputField.setText(String.valueOf(temp));
            }

            if (e.getSource() == equalsButton) {
                secondNum = Double.parseDouble(inputField.getText());

                // Switch statements goes down the list of buttons to preform a certain action
                switch (operators) {
                    case "+":
                        solution = firstNum + secondNum;
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                    case "-":
                        solution = firstNum - secondNum;
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                    case "*":
                        solution = firstNum * secondNum;
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                    case "/":
                        if (secondNum == 0) {
                            // Throws a new exception if the 0 is in the denominator
                            throw new Exception("Division by 0 Error");
                        }

                        solution = firstNum / secondNum;
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                    case "mod":
                        solution = firstNum % secondNum;
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                    case "%":
                        solution = firstNum * (secondNum % 100);
                        firstNum = solution;
                        inputField.setText(String.valueOf(solution));
                        break;
                }
                firstNum = solution;
                outputField.setText(String.valueOf(solution));

            }
        } catch (Exception excpt) {
            // Catches the error and outputs it on output field
            outputField.setText(String.valueOf(excpt.getMessage()));
        }
    }
    public static void main(String[] args) {
        // Main method to instantiate and run the calculator
        Calculator calc = new Calculator();
    }
}

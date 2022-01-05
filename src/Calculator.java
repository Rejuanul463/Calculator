import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    Operations op = new Operations();
    char mathOperator;
    double total = 0.0 , total2 = 0.0;
    String s = null ;

    public JPanel panel1;
    private JButton a4Button1;
    private JButton a7Button;
    private JButton a1Button1;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton button9;
    private JButton a6Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton a0Button;
    private JButton button15;
    private JButton button16;
    private JTextArea textArea1;

    private void getOperator(String buttonText){
        mathOperator = buttonText.charAt(0);
        total = total + Double.parseDouble(textArea1.getText());
        textArea1.setText(" ");
    }

    public Calculator() {
        a1Button1.addActionListener(e ->{
                s = textArea1.getText() + a1Button1.getText();
                textArea1.setText(s);
        });
        a2Button.addActionListener(e ->{
                s = textArea1.getText() + a2Button.getText();
                textArea1.setText(s);
        });
        a4Button1.addActionListener(e ->{
                s = textArea1.getText() + a4Button1.getText();
                textArea1.setText(s);
        });
        a7Button.addActionListener(e ->{
                s = textArea1.getText() + a7Button.getText();
                textArea1.setText(s);
        });
        a5Button.addActionListener(e ->{
                s = textArea1.getText() + a5Button.getText();
                textArea1.setText(s);
        });
        a8Button.addActionListener(e ->{
                s = textArea1.getText() + a8Button.getText();
                textArea1.setText(s);
        });
        a3Button.addActionListener(e ->{
                s = textArea1.getText() + a3Button.getText();
                textArea1.setText(s);
        });
        a6Button.addActionListener(e ->{
                s = textArea1.getText() + a6Button.getText();
                textArea1.setText(s);
        });
        a9Button.addActionListener(e ->{
                s = textArea1.getText() + a9Button.getText();
                textArea1.setText(s);
        });
        a0Button.addActionListener(e ->{
                s = textArea1.getText() + a0Button.getText();
                textArea1.setText(s);
        });

        // button for sum..........
        a4Button.addActionListener(e ->{
                String btnTxt = a4Button.getText();
                getOperator(btnTxt);
        });
        //button for minus........
        button9.addActionListener(e ->{
                String btnTxt = button9.getText();
                getOperator(btnTxt);
        });
        //button for multi..........
        xButton.addActionListener(e -> {
                String btnTxt = xButton.getText();
                getOperator(btnTxt);
        });
        //button for div.............
        button16.addActionListener(e ->{
                    String btnTxt = button16.getText();
                    getOperator(btnTxt);
        });
        //button for equal...........
        button15.addActionListener(e ->{
                switch (mathOperator){
                    case '+':
                        total2 = total + Double.parseDouble(textArea1.getText());
                        break;

                    case '-':
                        total2 = total - Double.parseDouble(textArea1.getText());
                        break;

                    case 'X':
                        total2 = total * Double.parseDouble(textArea1.getText());
                        break;

                    case '/':
                        total2 = total / Double.parseDouble((textArea1.getText()));
                        break;
                }
                textArea1.setText(Double.toString(total2));
                total = 0;
        });
    }

    public  void createUIComponents() {
        // TODO: place custom component creation code here

    }

    void reset(){

    }

}

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainForm extends JFrame{
    private JPanel panelMain;
    private JLabel numberJLabel;
    private JTextField textField1;
    private JButton generujButton;
    private JTextArea textArea1;
    private JButton copyButton;
    public MainForm(){
        setTitle("Test práce s tlačítky");
        setContentPane(panelMain);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        generujButton.addActionListener(e->{
            vytvorNahodnou();
        });

        copyButton.addActionListener(e ->{kopirujDoTextArea();});


    }
    public void vytvorNahodnou(){
        Random random = new Random();
        int nahodna = random.nextInt(100)+1;

        textField1.setText(String.valueOf(nahodna));
    }

    public void kopirujDoTextArea(){
        String text = textField1.getText();
        textArea1.append(text + "\n"); //append() v překladu připojit nebo přidat, je metoda, která rozděluje text v textArea, aby jsi tam mohl mít více textu než jen jeden(ve skratce to umožňuje opakované přidáváí do textArea)
        //textArea1.setText(text + "\n"), každý nový text, který přidáš, by nahradil stávající obsah JTextArea novým textem.
    }
}

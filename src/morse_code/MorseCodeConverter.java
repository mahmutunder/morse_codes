package morse_code;

/**
 * This program creates a simple GUI with a text
 * field for entering a string,
 * a button for converting the string to Morse
 * code, and a label for displaying the result.
 *
 * @Author Mahmut under
 */

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter extends JFrame {

    /**
     * static map block load java memory before gui
     * it is final because key value pairs to not change
     */
    private static final Map<Character, String> MORSE_CODE_MAP = new HashMap<>();


    static {
        MORSE_CODE_MAP.put(' ', "space");
        MORSE_CODE_MAP.put(',', "--..--");
        MORSE_CODE_MAP.put('.', ".-.-.-");
        MORSE_CODE_MAP.put('?', "..--..");
        MORSE_CODE_MAP.put('0', "-----");
        MORSE_CODE_MAP.put('1', ".----");
        MORSE_CODE_MAP.put('2', "..---");
        MORSE_CODE_MAP.put('3', "...--");
        MORSE_CODE_MAP.put('4', "....-");
        MORSE_CODE_MAP.put('5', ".....");
        MORSE_CODE_MAP.put('6', "-....");
        MORSE_CODE_MAP.put('7', "--...");
        MORSE_CODE_MAP.put('8', "---..");
        MORSE_CODE_MAP.put('9', "----.");
        MORSE_CODE_MAP.put('A', ".-");
        MORSE_CODE_MAP.put('B', "-...");
        MORSE_CODE_MAP.put('C', "-.-.");
        MORSE_CODE_MAP.put('D', "-..");
        MORSE_CODE_MAP.put('E', ".");
        MORSE_CODE_MAP.put('F', "..-.");
        MORSE_CODE_MAP.put('G', "--.");
        MORSE_CODE_MAP.put('H', "....");
        MORSE_CODE_MAP.put('I', "..");
        MORSE_CODE_MAP.put('J', ".---");
        MORSE_CODE_MAP.put('K', "-.-");
        MORSE_CODE_MAP.put('L', ".-..");
        MORSE_CODE_MAP.put('M', "--");
        MORSE_CODE_MAP.put('N', "-.");
        MORSE_CODE_MAP.put('O', "---");
        MORSE_CODE_MAP.put('P', ".--.");
        MORSE_CODE_MAP.put('Q', "--.-");
        MORSE_CODE_MAP.put('R', ".-.");
        MORSE_CODE_MAP.put('S', "...");
        MORSE_CODE_MAP.put('T', "-");
        MORSE_CODE_MAP.put('U', "..-");
        MORSE_CODE_MAP.put('V', "...-");
        MORSE_CODE_MAP.put('W', ".--");
        MORSE_CODE_MAP.put('X', "-..-");
        MORSE_CODE_MAP.put('Y', "-.--");
        MORSE_CODE_MAP.put('Z', "--..");
    }

    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JTextField resultLabel;
    private JButton convertButton;

    public MorseCodeConverter() {
        this.setTitle("Morse Code Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        label = new JLabel("Enter a string:");
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        label.setFont(new Font(Font.SANS_SERIF,0,20));
        textField = new JTextField();
        resultLabel = new JTextField(10);
        convertButton = new JButton("Convert");

        convertButton.addActionListener(e -> {
            String input = textField.getText().toUpperCase();
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (MORSE_CODE_MAP.containsKey(c)) {
                    result.append(MORSE_CODE_MAP.get(c)).append(" ");
                } else {
                    JOptionPane.showMessageDialog(null, "No special characters, it will be skip");
                }
            }
            resultLabel.setText(result.toString());
        });

        panel.add(label);
        panel.add(textField);
        panel.add(convertButton);
        panel.add(resultLabel);

        this.add(panel);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new MorseCodeConverter();

    }
}


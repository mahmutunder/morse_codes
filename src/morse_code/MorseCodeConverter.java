package morse_code;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MorseCodeConverter {

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Morse Code Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label = new JLabel("Enter a string:");
        JTextField textField = new JTextField();
        JLabel resultLabel = new JLabel("");
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText().toUpperCase();
                StringBuilder result = new StringBuilder();
                for (char c : input.toCharArray()) {
                    if (MORSE_CODE_MAP.containsKey(c)) {
                        result.append(MORSE_CODE_MAP.get(c)).append(" ");
                    }
                }
                resultLabel.setText(result.toString());
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(convertButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}


import java.awt.*;
import java.awt.event.*;

public class SimpleAdder extends Frame implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Button addButton;
    private Label lblNum1, lblNum2, lblResult;

    public SimpleAdder() {
        // Set layout
        setLayout(new GridLayout(4, 2, 10, 10));

        lblNum1 = new Label("Number 1:");
        num1Field = new TextField();

        lblNum2 = new Label("Number 2:");
        num2Field = new TextField();

        addButton = new Button("Add");
        lblResult = new Label("Result:");
        resultField = new TextField();
        resultField.setEditable(false);

        // Add components to frame
        add(lblNum1);
        add(num1Field);
        add(lblNum2);
        add(num2Field);
        add(addButton);
        add(new Label(""));
        add(lblResult);
        add(resultField);

        // Add action listener
        addButton.addActionListener(this);

        // Frame settings
        setTitle("Simple Adder");
        setSize(300, 200);
        setVisible(true);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText().trim());
            double num2 = Double.parseDouble(num2Field.getText().trim());
            double sum = num1 + num2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleAdder();
    }
}

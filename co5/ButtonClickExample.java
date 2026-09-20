import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample extends Frame implements ActionListener {
    private Label label;
    private Button button;

    public ButtonClickExample() {
        // Set layout
        setLayout(new FlowLayout());

        // Create components
        label = new Label("Press the button");
        button = new Button("Click me!");

        // Add action listener to button
        button.addActionListener(this);

        // Add components to frame
        add(label);
        add(button);

        // Frame settings
        setTitle("Button Click Demo");
        setSize(300, 150);
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
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}

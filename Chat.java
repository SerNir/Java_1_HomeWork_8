import javax.swing.*;
import java.awt.*;

public class Chat extends JFrame {

     JTextArea textArea = new JTextArea();
     JTextField textField = new JTextField();
     JButton button = new JButton("Отправить");


    public Chat (){
        setTitle("Easy chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200, 600,400);

        JPanel mainPanel = new JPanel();


        mainPanel.setLayout(new BorderLayout());

        JPanel windowsChat = new JPanel(new BorderLayout(2,2));
        JPanel createText = new JPanel(new BorderLayout(2,2));
        JLabel label = new JLabel("Chat");

        windowsChat.setPreferredSize(new Dimension(500, 150));
        windowsChat.add(label, BorderLayout.NORTH);
        windowsChat.add(textArea, BorderLayout.WEST);

        createText.add(textField, BorderLayout.CENTER);
        createText.setPreferredSize(new Dimension(500, 150));

        mainPanel.add(windowsChat, BorderLayout.NORTH);
        mainPanel.add(createText, BorderLayout.CENTER);
        mainPanel.add(button, BorderLayout.SOUTH);
        add(mainPanel);

        setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BugGUI {

    JTextArea songField;

    public void buildGUI() throws Exception{
        JFrame frame = new JFrame("A Bug Song");
        JPanel mainPanel = new JPanel();

        // Создание и добавление в GUI области под песню и скроллер к ней
        songField = new JTextArea(15, 50);
        songField.setLineWrap(true);
        songField.setWrapStyleWord(true);
        songField.setEditable(true);
        JScrollPane songScroller = new JScrollPane(songField);
        songScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        songScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainPanel.add(songScroller);

        // У меня явно будут кнопки
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        // Очевидная кнопка stop должна останавливать (не ставить на паузу!) песню, но не выходить из программы
        JButton stop = new JButton("Stop singing");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonBox);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500); // Собака была зарыта вот тут.
        frame.setVisible(true);

    } // buildGUI


    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            BugLauncher.bugSong.isSinging = false;
        }
    }
} // BugGUI

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
        /* Если есть стоп, должен быть и start again - вот только он вешает GUI
        JButton start = new JButton("Start again");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start); */

        // Разместить блоки внутри главного окна
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonBox);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500); // Собака была зарыта вот тут.
        frame.setVisible(true);

    } // buildGUI


    // Для кнопки Stop
    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            BugLauncher.bugSong.isSinging = false; // Прекращает петь
            System.out.println("Stop button pressed");
        }
    } // MyStopListener

    /* Для кнопки Start again, мне не покорилось, оно вешает GUI, и я не знаю, как это вылечить
    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("Start button pressed1");
            BugLauncher.launcher.startSinging(); // Начинает петь по новой
            System.out.println("Start button pressed2");
        }
    } // MyStartListener */
} // BugGUI

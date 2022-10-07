import static java.lang.Thread.sleep;

public class BugSong {

    boolean isSinging;
    public void sing() throws Exception {
        //int bugNum = 99;
        String word = "bugs";
        isSinging = true; // Нужно для кнопки остановки песни
        int len;
        BugLauncher.bugGUI.songField.append("Starting singing!\n\n");

        // Вывод текста в окошко songField
        while (BugLauncher.bugCounter.getBugCount() > 0 && isSinging) {

            if (BugLauncher.bugCounter.getBugCount() == 1) {
                word = "bug";
            }

            if (BugLauncher.bugCounter.getBugCount() > 0) {
                BugLauncher.bugGUI.songField.append(BugLauncher.bugCounter.getBugCount() + " little " + word + " in my code.\n");
                len = BugLauncher.bugGUI.songField.getDocument().getLength();
                BugLauncher.bugGUI.songField.setCaretPosition(len);
                BugLauncher.bugGUI.songField.append(BugLauncher.bugCounter.getBugCount() + " " + word + " left in the code.\n");
                len = BugLauncher.bugGUI.songField.getDocument().getLength();
                BugLauncher.bugGUI.songField.setCaretPosition(len);
                BugLauncher.bugGUI.songField.append("Take one down.\n");
                len = BugLauncher.bugGUI.songField.getDocument().getLength();
                BugLauncher.bugGUI.songField.setCaretPosition(len);
                BugLauncher.bugGUI.songField.append("Make a debug.\n\n");
                len = BugLauncher.bugGUI.songField.getDocument().getLength();
                BugLauncher.bugGUI.songField.setCaretPosition(len);
                System.out.println("Keeps singing" + BugLauncher.bugCounter.getBugCount());

                BugLauncher.bugCounter.setBugCount(BugLauncher.bugCounter.getBugCount() -1);
                sleep(1000);

                // Эти две строчки (вставленные после каждого аппенда) переносят курсор в конец документа
                // Это чтобы текст автоматически прокручивался во время "пения"
                len = BugLauncher.bugGUI.songField.getDocument().getLength();
                BugLauncher.bugGUI.songField.setCaretPosition(len);
            } // if bugs > 0
        } // while bugs > 0
        if (BugLauncher.bugCounter.getBugCount() == 0 && isSinging) {
            BugLauncher.bugGUI.songField.append("No bugs left in my code.\n");
            BugLauncher.bugGUI.songField.append("Now I'm asked to code another feature...\n");
        } // if 0 bugs

        //if(!isSinging) sleep(1000000);
    }// sing
} // BugSong

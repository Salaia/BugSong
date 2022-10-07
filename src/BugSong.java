import static java.lang.Thread.sleep;

public class BugSong {

    boolean isSinging;
    public void sing() throws Exception {
        //int bugNum = 99;
        String word = "bugs";
        isSinging = true;

        while (BugLauncher.bugCounter.getBugCount() > 0 && isSinging) {

            if (BugLauncher.bugCounter.getBugCount() == 1) {
                word = "bug";
            }

            if (BugLauncher.bugCounter.getBugCount() > 0) {
                BugLauncher.bugGUI.songField.append(BugLauncher.bugCounter.getBugCount() + " little " + word + " in my code.\n");
                BugLauncher.bugGUI.songField.append(BugLauncher.bugCounter.getBugCount() + " " + word + " left in the code.\n");
                BugLauncher.bugGUI.songField.append("Take one down.\n");
                BugLauncher.bugGUI.songField.append("Make a debug.\n");
                sleep(1000);
                BugLauncher.bugCounter.setBugCount(BugLauncher.bugCounter.getBugCount() -1);
            } // if bugs > 0
        } // while bugs > 0
        if (BugLauncher.bugCounter.getBugCount() == 0) {
            BugLauncher.bugGUI.songField.append("No bugs left in my code.\n");
            BugLauncher.bugGUI.songField.append("Now I'm asked to code another feature...\n");
        } // if 0 bugs
    }// sing
} // BugSong

public class BugLauncher {

    static BugGUI bugGUI;
    static BugSong bugSong;
    static BugCounter bugCounter;

    public static void main(String[] args) {
        bugGUI = new BugGUI();
        bugSong = new BugSong();
        bugCounter = new BugCounter();

        try {bugGUI.buildGUI();} catch (Exception ex) {ex.printStackTrace();}
        try {bugSong.sing();} catch (Exception ex) {ex.printStackTrace();}

    } // main
}

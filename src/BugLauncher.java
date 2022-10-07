public class BugLauncher {

    static BugGUI bugGUI;
    static BugSong bugSong;
    static BugCounter bugCounter;
    static BugLauncher launcher;

    public static void main(String[] args) {
        launcher = new BugLauncher();
        bugGUI = new BugGUI();
        bugSong = new BugSong();
        bugCounter = new BugCounter();

        try {bugGUI.buildGUI();} catch (Exception ex) {ex.printStackTrace();}
        launcher.startSinging();
    } // main

    // Если есть кнопка Stop, то должна быть и кнопка Start Again
    public void startSinging() {
        //try {bugGUI.buildGUI();} catch (Exception ex) {ex.printStackTrace();}
        //System.out.println("NEW GUI");
        System.out.println("startSinging()");
        bugSong.isSinging = true;
        System.out.println("bugSong.isSinging = true;");
        bugCounter.setBugCount(99); // На случай ребута, вернуть значение 99 бутылок на стене (с этого же началось)
        System.out.println("99");

        try {bugSong.sing();} catch (Exception ex) {ex.printStackTrace();}
        System.out.println("End of startSinging()");
        //try {bugSong.sing();} catch (Exception ex) {ex.printStackTrace();}
    }
}

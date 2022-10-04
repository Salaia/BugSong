public class BugSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bugs";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bug";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " little " + word + " in my code.");
                System.out.println(beerNum + " " + word + " left in the code.");
                System.out.println("Take one down.");
                System.out.println("Make a debug.");
                beerNum = beerNum -1;
            }
        }
        // Изначально оно внутри while - но у нас while не выполняется при требуемом значении beerNum
        if (beerNum == 0) {
            System.out.println("No bugs left in my code.");
            System.out.println("Now I'm asked to code another feature...");
        }
    }
}

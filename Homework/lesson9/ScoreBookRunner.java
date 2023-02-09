package lesson9;

public class ScoreBookRunner {

    public static void main(String[] args) {
        ScoreBook scoreBook = new ScoreBook();

        scoreBook.setSession("Summer session");
        scoreBook.fillScoreBook( "Math", 36, "Ivanov I.", "Unsatisfactory", "25/07/22");
        System.out.println(scoreBook);

        scoreBook.setSession("Summer session");
        scoreBook.fillScoreBook( "Drawing", 75, "Petrov A.", "Satisfactory", "27/07/22");
        System.out.println(scoreBook);

    }
}

public class MainClass {
    public MainClass() {
    }

    public static void main(String[] args) {
        OddEven game = new OddEven();
        game.intro();

        while(game.gameOver()) {
            game.betting();
            game.comTurn();
            game.userTurn();
            game.correctAnswer();
        }

    }
}

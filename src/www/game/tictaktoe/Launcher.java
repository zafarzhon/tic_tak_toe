package www.game.tictaktoe;

import www.game.tictaktoe.component.*;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public final class Launcher {
    public static void main(final String[] args) {
        Game game = new Game(new DataPrinter(),
                new ComputerMove(),
                new UserMove(),
                new WinnerVerify(),
                new DrawVerify()
        );
        game.play();

    }
}

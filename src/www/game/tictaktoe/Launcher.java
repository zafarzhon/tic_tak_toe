package www.game.tictaktoe;

import www.game.tictaktoe.component.*;
import www.game.tictaktoe.component.keypad.TerminalNumericKeypadCellNumberConverter;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public final class Launcher {
    public static void main(final String[] args) {
        final CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        Game game = new Game(new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerify(),
                new CellVerifier()
        );
        game.play();

    }
}

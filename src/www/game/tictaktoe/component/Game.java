/*
 *    Copyright 2023 ODILOV_ZAFARZHON
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package www.game.tictaktoe.component;

import www.game.tictaktoe.model.GameTable;

import java.util.Random;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public class Game {

    private final DataPrinter dataPrinter;
    private final ComputerMove computerMove;
    private final UserMove userMove;
    private final WinnerVerify winnerVerify;
    private final CellVerifier drawVerify;

    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnerVerify winnerVerify,
                final CellVerifier drawVerify) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerify = winnerVerify;
        this.drawVerify = drawVerify;
    }

    public void play() {
        final GameTable gameTable = new GameTable();
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerify.isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (drawVerify.allCellFilled(gameTable)) {
                System.out.println("Sorry, DRAW");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerify.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN");
                break;
            }
            if (drawVerify.allCellFilled(gameTable)) {
                System.out.println("Sorry, DRAW");
                break;
            }
        }

        System.out.println("GAME OVER!");
    }
}
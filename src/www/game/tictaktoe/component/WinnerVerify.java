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

import www.game.tictaktoe.model.Cell;
import www.game.tictaktoe.model.GameTable;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public class WinnerVerify {
    public boolean isUserWin(final GameTable gameTable) {
        return isWinnerByRows(gameTable, 'X') ||
               isWinnerByCols(gameTable, 'X') ||
               isWinnerByMainDiagonal(gameTable, 'X') ||
               isWinnerBySecondaryDiagonal(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return isWinnerByRows(gameTable, 'O') ||
               isWinnerByCols(gameTable, 'O') ||
               isWinnerByMainDiagonal(gameTable, 'O') ||
               isWinnerBySecondaryDiagonal(gameTable, 'O');
    }

    public boolean isWinnerByRows(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == gameTable.getSign(new Cell(i, 1)) &&
                gameTable.getSign(new Cell(i, 1)) == gameTable.getSign(new Cell(i, 2)) &&
                gameTable.getSign(new Cell(i, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerByCols(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == gameTable.getSign(new Cell(1, i)) &&
                gameTable.getSign(new Cell(1, i)) == gameTable.getSign(new Cell(2, i)) &&
                gameTable.getSign(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerByMainDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSign(new Cell(0, 0)) == gameTable.getSign(new Cell(1, 1)) &&
               gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(2, 2)) &&
               gameTable.getSign(new Cell(2, 2)) == sign;
    }

    public boolean isWinnerBySecondaryDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSign(new Cell(0, 2)) == gameTable.getSign(new Cell(1, 1)) &&
               gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(2, 0)) &&
               gameTable.getSign(new Cell(2, 0)) == sign;
    }
}

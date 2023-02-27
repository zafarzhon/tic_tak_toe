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

package www.game.tictaktoe.component.keypad;

import www.game.tictaktoe.component.CellNumberConverter;
import www.game.tictaktoe.model.Cell;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {
    public Cell toCell(final char number) {
        final int num = number - '0' - 1;
        return new Cell(num / 3, num % 3);
    }

    public char toNumber(final Cell cell) {
        return (char) (cell.getRow() * 3 + cell.getCol() + '0' + 1);
    }
}

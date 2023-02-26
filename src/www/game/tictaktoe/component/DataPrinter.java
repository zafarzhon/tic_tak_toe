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
public class DataPrinter {
    public void printMappingTable() {
        System.out.println("-------------\n" +
                           "| 7 | 8 | 9 |\n" +
                           "-------------\n" +
                           "| 4 | 5 | 6 |\n" +
                           "-------------\n" +
                           "| 1 | 2 | 3 |\n" +
                           "-------------"
        );
    }

    public void printGameTable(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}

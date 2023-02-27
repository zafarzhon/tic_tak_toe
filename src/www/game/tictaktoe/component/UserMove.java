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

import java.util.Scanner;

/**
 * @author Odilov_Zafarjon
 * @link <a href="https://t.me/zafarzhon_odilov">...</a>
 */
public class UserMove {
    private static final Scanner sc = new Scanner(System.in);

    private static final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    public void make(final GameTable gameTable) {
        while (true) {
            Cell cell = getUserInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else
                System.out.println("Can't make a move, because the cell is not free!");
        }
    }

    public Cell getUserInput() {
        while (true) {
            System.out.print("Please type number between 1 and 9: ");
            final String userInput = sc.nextLine();
            if (userInput.length() == 1) {
                final char ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (mapping[i][j] == ch) {
                                return new Cell(i, j);
                            }
                        }
                    }
                }
            }
        }
    }
}

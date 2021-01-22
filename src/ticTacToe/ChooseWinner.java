package ticTacToe;
///alegem castigatorii - daca nu suntem in remiza

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ChooseWinner {
    Timer time;
    public ChooseWinner() {

        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int count = 0;
                /// CASTIGA X - cazuri

                // Linia 1 cu X - orizontal
                if (GuiTicTacToe.state[0] == 1 && GuiTicTacToe.state[1] == 1 && GuiTicTacToe.state[2] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }
                // Linia 2 cu X - orizontal
                else if (GuiTicTacToe.state[3] == 1 && GuiTicTacToe.state[4] == 1 && GuiTicTacToe.state[5] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                //  Linia 3 cu X - orizontal
                else if (GuiTicTacToe.state[6] == 1 && GuiTicTacToe.state[7] == 1 && GuiTicTacToe.state[8] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                // Linia 1 cu X - vertical
                else if (GuiTicTacToe.state[0] == 1 && GuiTicTacToe.state[3] == 1 && GuiTicTacToe.state[6] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                // Linia 2 cu X - vertical
                else if (GuiTicTacToe.state[1] == 1 && GuiTicTacToe.state[4] == 1 && GuiTicTacToe.state[7] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                // Linia 3 cu X - vertical
                else if (GuiTicTacToe.state[2] == 1 && GuiTicTacToe.state[5] == 1 && GuiTicTacToe.state[8] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                // Diagonala principala plina cu X
                else if (GuiTicTacToe.state[0] == 1 && GuiTicTacToe.state[4] == 1 && GuiTicTacToe.state[8] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                // Diagonala secundara plina cu X
                else if (GuiTicTacToe.state[2] == 1 && GuiTicTacToe.state[4] == 1 && GuiTicTacToe.state[6] == 1) {
                    JOptionPane.showMessageDialog(null, "A castigat X");
                    ResetFunction.reset();
                }

                /// CASTIGA O - cazuri

                // Linia 1 cu O - orizontal
                else if (GuiTicTacToe.state[0] == 2 && GuiTicTacToe.state[1] == 2 && GuiTicTacToe.state[2] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }
                // Linia 2 cu O - orizontal
                else if (GuiTicTacToe.state[3] == 2 && GuiTicTacToe.state[4] == 2 && GuiTicTacToe.state[5] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Linia 3 cu O - orizontal
                else if (GuiTicTacToe.state[6] == 2 && GuiTicTacToe.state[7] == 2 && GuiTicTacToe.state[8] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Linia 1 cu O - vertical
                else if (GuiTicTacToe.state[0] == 2 && GuiTicTacToe.state[3] == 2 && GuiTicTacToe.state[6] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Linia 2 cu O - vertical
                else if (GuiTicTacToe.state[1] == 2 && GuiTicTacToe.state[4] == 2 && GuiTicTacToe.state[7] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Linia 3 cu O - vertical
                else if (GuiTicTacToe.state[2] == 2 && GuiTicTacToe.state[5] == 2 && GuiTicTacToe.state[8] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Diagonala principala plina cu O
                else if (GuiTicTacToe.state[0] == 2 && GuiTicTacToe.state[4] == 2 && GuiTicTacToe.state[8] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                }

                // Diagonala secundara plina cu O
                else if (GuiTicTacToe.state[2] == 2 && GuiTicTacToe.state[4] == 2 && GuiTicTacToe.state[6] == 2) {
                    JOptionPane.showMessageDialog(null, "A castigat O");
                    ResetFunction.reset();
                } else /// nu a castigat nimeni => remiza
                {
                    for (int i = 0; i < GuiTicTacToe.state.length; i++) {
                        if (GuiTicTacToe.state[i] == 1 || GuiTicTacToe.state[i] == 2)//inca exista zone necompletate cu X sau O
                            count++;
                    }
                }

                if (count == 9) ///daca e remiza
                {
                    JOptionPane.showMessageDialog(null, "Remiza!");
                    ResetFunction.reset();
                    count = 0;
                }
            }

        }, 0, 150);

    }

}
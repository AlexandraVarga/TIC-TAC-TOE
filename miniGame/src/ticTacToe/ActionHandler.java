package ticTacToe;
///alegem al cui este randul sa plaseze X sau O pe tabla

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        //daca inca nu a castigat nimeni mai putem plasa
        //pe tabla de joc X sau O

        //Linia 1
        if(e.getSource() == GuiTicTacToe.button[0]){
            if(GuiTicTacToe.state[0] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[0] = 1;//punem x
                GuiTicTacToe.player = 1;//urmeaza jucator cu O
            }else if(GuiTicTacToe.state[0] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[0] = 2;//punem O
                GuiTicTacToe.player = 0;//urmeaza jucator cu X
            }

        }else if(e.getSource() == GuiTicTacToe.button[1]){
            if(GuiTicTacToe.state[1] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[1] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[1] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[1] = 2;
                GuiTicTacToe.player = 0;
            }

        }else if(e.getSource() == GuiTicTacToe.button[2]){
            if(GuiTicTacToe.state[2] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[2] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[2] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[2] = 2;
                GuiTicTacToe.player = 0;
            }

        }

        //Linia 2

        else if(e.getSource() == GuiTicTacToe.button[3]){
            if(GuiTicTacToe.state[3] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[3] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[3] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[3] = 2;
                GuiTicTacToe.player = 0;
            }

        }
        else if(e.getSource() == GuiTicTacToe.button[4]){
            if(GuiTicTacToe.state[4] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[4] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[4] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[4] = 2;
                GuiTicTacToe.player = 0;
            }

        }
        else if(e.getSource() == GuiTicTacToe.button[5]){
            if(GuiTicTacToe.state[5] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[5] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[5] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[5] = 2;
                GuiTicTacToe.player = 0;
            }

        }

        //Linia 3

        else if(e.getSource() == GuiTicTacToe.button[6]){
            if(GuiTicTacToe.state[6] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[6] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[6] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[6] = 2;
                GuiTicTacToe.player = 0;
            }

        }
        else if(e.getSource() == GuiTicTacToe.button[7]){
            if(GuiTicTacToe.state[7] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[7] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[7] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[7] = 2;
                GuiTicTacToe.player = 0;
            }

        }
        else if(e.getSource() == GuiTicTacToe.button[8]){
            if(GuiTicTacToe.state[8] == 0 && GuiTicTacToe.player == 0){
                GuiTicTacToe.state[8] = 1;
                GuiTicTacToe.player = 1;
            }else if(GuiTicTacToe.state[8] == 0 && GuiTicTacToe.player == 1){
                GuiTicTacToe.state[8] = 2;
                GuiTicTacToe.player = 0;
            }

        }

    }

}

package ticTacToe;
///plasare zone in care putem pune X sau O pe tabla

public class ButtonPlacement {

    public static void place(){

        //Linia 1
        GuiTicTacToe.button[0].setBounds(175, 50, 150, 150);
        GuiTicTacToe.button[1].setBounds(325, 50, 150, 150);
        GuiTicTacToe.button[2].setBounds(475, 50, 150, 150);

        //Linia 2
        GuiTicTacToe.button[3].setBounds(175, 200, 150, 150);
        GuiTicTacToe.button[4].setBounds(325, 200, 150, 150);
        GuiTicTacToe.button[5].setBounds(475, 200, 150, 150);

        //Linia 3
        GuiTicTacToe.button[6].setBounds(175, 350, 150, 150);
        GuiTicTacToe.button[7].setBounds(325, 350, 150, 150);
        GuiTicTacToe.button[8].setBounds(475, 350, 150, 150);

    }

}

package ticTacToe;
///resetare text jucator si castigator pe tabla

public class ResetFunction {

    public static void reset(){
        for(int i = 0; i< GuiTicTacToe.state.length; i++){
            GuiTicTacToe.state[i] = 0;
        }
        GuiTicTacToe.player = 0;
    }

}

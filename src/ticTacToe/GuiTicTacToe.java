package ticTacToe;
// interfata joc X si O
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTicTacToe {

    JFrame frame;
    DrawXO draw;


    static JButton button[] = new JButton[9];
    static int state[] = new int[9];
    static int player = 0;

    public GuiTicTacToe() {

        ///desenare tabla pentru jocul X si O

        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Tic Tac Toe");

        for(int i = 0; i< button.length; i++){
            button[i] = new JButton();
            button[i].setVisible(true);
            button[i].addActionListener(new ActionHandler());
            button[i].setFocusPainted(false);
            button[i].setContentAreaFilled(false);
            button[i].setBorder(null);
            frame.add(button[i]);
        }

        ///setare dimensiuni zone unde putem pune X sau O in joc

        ButtonPlacement.place();

        draw = new DrawXO();
        draw.setBounds(0,0,800,600);
        draw.setVisible(true);
        frame.add(draw);

        frame.setVisible(true);

    }

}

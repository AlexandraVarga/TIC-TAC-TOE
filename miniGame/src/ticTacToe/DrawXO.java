package ticTacToe;
// desenare si colorare fereastra
//click pentru X si click pt O => pune imaginile cu X si O
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

public class DrawXO extends JLabel {

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(new Color(255,255,255));
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.BLACK);

        // linii verticale

        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);

        // linii orizontale

        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        // Click al jucatorilor

        g.setColor(Color.BLACK);
        if(GuiTicTacToe.player == 0){
            g.drawString("Jucator: X", 25, 50);// e randul lui X
        }else if(GuiTicTacToe.player == 1){
            g.drawString("Jucator: O", 25, 50);// e randul lui O
        }


        /// Plasare X sau O in functie de zona tablei - cu imagine

        // Linia 1
        if (GuiTicTacToe.state[0] == 1) {// pune imagine cu X
            g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
        } else if (GuiTicTacToe.state[0] == 2) {// pune imagine cu O
            g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
        }

        if (GuiTicTacToe.state[1] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
        } else if (GuiTicTacToe.state[1] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);
        }

        if (GuiTicTacToe.state[2] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
        } else if (GuiTicTacToe.state[2] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);
        }

        // Linia 2

        if (GuiTicTacToe.state[3] == 1) {
            g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
        } else if (GuiTicTacToe.state[3] == 2) {
            g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
        }

        if (GuiTicTacToe.state[4] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
        } else if (GuiTicTacToe.state[4] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);
        }

        if (GuiTicTacToe.state[5] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
        } else if (GuiTicTacToe.state[5] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);
        }

        // Linia 3

        if (GuiTicTacToe.state[6] == 1) {
            g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
        } else if (GuiTicTacToe.state[6] == 2) {
            g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
        }

        if (GuiTicTacToe.state[7] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
        } else if (GuiTicTacToe.state[7] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);
        }

        if (GuiTicTacToe.state[8] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
        } else if (GuiTicTacToe.state[8] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);
        }

        repaint();

    }
}

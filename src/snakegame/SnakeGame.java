package snakegame;

import java.awt.Color;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame() {
        super("Snake-Game-by-Mohd Yasir");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}

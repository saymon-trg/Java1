package GUIApp.windowParts.infoPanelParts;

import GUIApp.MainWindow;
import GUIApp.windowParts.InfoPanel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel {

    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;
    private MainWindow mainWindow;

    public GameControlArea(InfoPanel infoPanel, MainWindow mainWindow) {
        this.infoPanel = infoPanel;
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(3, 1));
        startGame = new JButton("START GAME");

        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.setTitle("Run, Player, run...--->>>");
            }
        });

        exitGame = new JButton("EXIT GAME");

        add(new JLabel("  =Game Controls=", SwingConstants.LEFT));
        add(startGame);
        add(exitGame);
    }
}

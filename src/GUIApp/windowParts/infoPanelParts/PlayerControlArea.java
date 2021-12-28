package GUIApp.windowParts.infoPanelParts;

import GUIApp.MainWindow;
import GUIApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {
    private JButton UP;
    private JButton DOWN;
    private JButton LEFT;
    private JButton RIGHT;

    private InfoPanel infoPanel;
    private MainWindow mainWindow;

    public PlayerControlArea(InfoPanel infoPanel, MainWindow mainWindow) {
        this.infoPanel = infoPanel;
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(2, 3));
        UP = new JButton("UP");
        DOWN = new JButton("DOWN");
        LEFT = new JButton("LEFT");
        RIGHT = new JButton("RIGHT");
        add(new JLabel());
        add (UP);
        add(new JLabel());
        add (LEFT);
        add (DOWN);
        add (RIGHT);
        setBorder(BorderFactory.createTitledBorder("=Player Control="));
    }
}

package GUIApp.windowParts.infoPanelParts;

import GUIApp.MainWindow;
import GUIApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    private InfoPanel infoPanel;
    private MainWindow mainWindow;

    public GameInfoArea(InfoPanel infoPanel, MainWindow mainWindow) {
        this.infoPanel = infoPanel;
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(3, 1));
        add(new JLabel("Map XxX", SwingConstants.CENTER));
        add(new JLabel("Level XX", SwingConstants.CENTER));
        add(new JLabel("Count Traps = XX", SwingConstants.CENTER));
        setBorder(BorderFactory.createTitledBorder("=Game Info Stats="));
    }
}

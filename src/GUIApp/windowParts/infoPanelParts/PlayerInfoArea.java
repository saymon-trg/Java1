package GUIApp.windowParts.infoPanelParts;

import GUIApp.MainWindow;
import GUIApp.windowParts.InfoPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private InfoPanel infoPanel;
    private MainWindow mainWindow;

    public PlayerInfoArea(InfoPanel infoPanel, MainWindow mainWindow) {
        this.infoPanel = infoPanel;
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(4, 1));
        add(new JLabel("HP XX", SwingConstants.CENTER));
        add(new JLabel("MP XX", SwingConstants.CENTER));
        add(new JLabel("Strength XX", SwingConstants.CENTER));
        add(new JLabel("Experience XX", SwingConstants.CENTER));
        setBorder(BorderFactory.createTitledBorder("=Player Stats="));
        }
}

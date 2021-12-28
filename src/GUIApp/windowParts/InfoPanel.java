package GUIApp.windowParts;

import GUIApp.MainWindow;
import GUIApp.windowParts.infoPanelParts.GameControlArea;
import GUIApp.windowParts.infoPanelParts.GameInfoArea;
import GUIApp.windowParts.infoPanelParts.PlayerControlArea;
import GUIApp.windowParts.infoPanelParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea log;
    private JScrollPane scroll;

    private MainWindow mainWindow;

    public InfoPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        preparePanel();
        createParts();
        prepareLogs();

        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scroll);
    }

    private void preparePanel() {
        setBackground(Color.YELLOW);
        setLayout(new GridLayout(5, 1));
    }

    private void createParts() {
        gameControlArea = new GameControlArea(this, mainWindow);
        gameInfoArea = new GameInfoArea(this, mainWindow);
        playerInfoArea = new PlayerInfoArea(this, mainWindow);
        playerControlArea = new PlayerControlArea(this, mainWindow);
    }

    private void prepareLogs() {
        log = new JTextArea();
        scroll = new JScrollPane(log);
    }

}

package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    //Map
    public static char[][] map;
    public static char[][] mapUser;
    public static int mapWight;
    public static int mapHeight;
    public static int mapSizeMin = 4;
    public static int mapSizeMax = 4;
    public static char empty = '_';
    public static char ready = 'х';
    public static int answerNextLevel;

    //Player
    public static char player = '@';
    public static String playerName = "Dog";
    public static int playerHP = 100;
    public static int lastPlayerHp;
    public static int playerX;
    public static int playerY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;
    public static final int playerMoveDown = 2;

    //Trap
    public static char trap = 'T';
    public static int trapDamage;
    public static int trapCount;
    public static int trapValueMin = 5;
    public static int trapValueMax = 15;


    public static void main(String[] args) {
        createMap();
        spawnPlayer();
        spawnTrap();
        createMapUser();


        while (true) {
            createMapUser();
            showMapUser();
            movePlayer();

            if (!isPlayerAlive()) {
                System.out.println();
                System.out.println(playerName + " is dead");
                System.out.println("<GAME OVER>");
                break;
            }

            if (isFullMap()) {
                System.out.println();
                System.out.println(playerName + " win this level");
                System.out.println(playerName + " wan't you next level? 1 - yes, 0 - no");
                answerNextLevel = scanner.nextInt();
                if (isNextLevel()){
                    createMap();
                    spawnPlayerNext();
                    spawnTrap();
                    createMapUser();
                    while (true) {
                        createMapUser();
                        showMapUser();
                        movePlayer();
                        if (!isPlayerAlive()) {
                            System.out.println();
                            System.out.println(playerName + " is dead");
                            System.out.println("<GAME OVER>");
                            break;
                        }
                        if (isFullMapNext()) {
                            System.out.println();
                            System.out.println(playerName + " win level 2");
                            break;
                        }
                    }
                    } else {
                    System.out.println( );
                    System.out.println("<GAME OVER>");
                    break;
                }
                }

            }
        }

    public static void createMap() {
        mapWight = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWight];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                map[y][x] = empty;
            }
        }

        System.out.println("Map has been created. Map size is " + mapWight + "x" + mapHeight);
    }
    public static void createMapUser() {
        mapUser = new char[mapHeight][mapWight];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                mapUser[x][y] = map[x][y];
                if (mapUser[x][y] == trap){
                    mapUser[x][y] = empty;
                }
            }
            }
        }

    public static void showMap() {
        System.out.println("==========> MAP <==========");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void showMapUser() {
        System.out.println();
        System.out.println("==========> MAP <==========");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                System.out.print(mapUser[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void spawnPlayer() {
        playerX = randomValue(0, mapWight - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
        System.out.println(playerName + " has spawn in [" + (playerX + 1) + ":" + (playerY + 1) + "]");
    }

    public static void spawnPlayerNext() {
        playerX = randomValue(0, mapWight - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
        playerHP = lastPlayerHp;
        System.out.println(playerName + " has spawn in [" + (playerX + 1) + ":" + (playerY + 1) + "]" + " with " + lastPlayerHp + " HP");
    }
    public static void spawnTrap() {
        trapDamage = randomValue(trapValueMin, trapValueMax);
        trapCount = (mapWight + mapHeight) / 2;

        int trapX;
        int trapY;

        for (int i = 1; i <= trapCount; i++) {

            do {
                trapX = random.nextInt(mapWight);
                trapY = random.nextInt(mapHeight);
            } while (!isEmpty(trapX, trapY));

            map[trapY][trapX] = trap;
        }
        System.out.println(trapCount + " trap's has been created. Trap's Damage = " + trapDamage);
    }

    public static void movePlayer() {

        int currentPlayerX = playerX;
        int currentPlayerY = playerY;

        int playerDestination;

        do {
            System.out.println();
            System.out.print("Enter your move: (Up: " + playerMoveUp + " | Down: " + playerMoveDown +
                    " | Left: " + playerMoveLeft + " | Right: " + playerMoveRight + ") >>> ");

            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case playerMoveUp:
                    playerY -= 1;
                    break;
                case playerMoveDown:
                    playerY += 1;
                    break;
                case playerMoveLeft:
                    playerX -= 1;
                    break;
                case playerMoveRight:
                    playerX += 1;
                    break;
            }

        } while (!checkValidMove(currentPlayerX, currentPlayerY, playerX, playerY));

        playerMoveAction(currentPlayerX, currentPlayerY, playerX, playerY);

    }

    public static boolean isEmpty(int x, int y) {
        return map[y][x] == empty;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                if (map[y][x] == empty) return false;
            }
        }
        return true;
    }
    public static boolean isFullMapNext() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWight; x++) {
                if (map[y][x] == empty) return false;
            }
        }
        return true;
    }
    public static boolean checkValidMove(int pastX, int pastY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < mapWight && nextY >= 0 && nextY < mapHeight) {
            System.out.println();
            System.out.println(playerName + " move to [" + (nextX + 1) + ":" + (nextY + 1) + "] success");
            return true;
        } else {
            System.out.println();
            System.out.println(playerName + " move invalid! Please try again!");
            playerX = pastX;
            playerY = pastY;
            return false;
        }
    }

    public static void playerMoveAction(int pastX, int pastY, int nextX, int nextY) {
        if (map[nextY][nextX] == trap) {
            playerHP -= trapDamage;
            lastPlayerHp = playerHP;
            trapCount--;
            System.out.println();
            System.out.println("Alarm! " + playerName + " has been attack. HP = " + playerHP);
        }

        map[nextY][nextX] = player;
        map[pastY][pastX] = ready;

    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isPlayerAlive() {
        return playerHP > 0;
    }
    public static boolean isNextLevel() {
              return answerNextLevel > 0;
    }
}


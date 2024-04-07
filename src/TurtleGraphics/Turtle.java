package TurtleGraphics;

public class Turtle {
    private static final int[][] floor = new int[20][20];
    private static int currentX = 0;
    private static int currentY = 0;
    private static int direction = 0;
    private static boolean penDown = false;

    public static void main(String[] args) {
        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};

        try {
            executeCommands(commands);
        } catch (IllegalArgumentException e) {
            System.err.println("Error executing commands: " + e.getMessage());
        }
    }

    private static void executeCommands(int[] commands) {
        for (int i = 0; i < commands.length; i++) {
            int command = commands[i];
            switch (command) {
                case 1 -> penDown = false;
                case 2 -> penDown = true;
                case 3 -> direction = (direction + 1) % 4;
                case 4 -> direction = (direction + 3) % 4;
                case 5 -> {
                    if (i + 1 < commands.length) {
                        moveTurtle(commands[i + 1]);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Missing steps value for command 5");
                    }
                }
                case 6 -> displayFloor();
                case 9 -> {
                    return;
                }
                default -> throw new IllegalArgumentException("Invalid command: " + command);
            }
        }
    }

    private static void moveTurtle(int steps) {
        for (int i = 0; i < steps; i++) {
            switch (direction) {
                case 0 -> currentX++;
                case 1 -> currentY++;
                case 2 -> currentX--;
                case 3 -> currentY--;
            }
            if (penDown) {
                if (currentX >= 0 && currentX < floor.length && currentY >= 0 && currentY < floor[0].length) {
                    floor[currentX][currentY] = 1;
                } else {
                    throw new IllegalArgumentException("Turtle out of bounds");
                }
            }
        }
    }

    private static void displayFloor() {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}


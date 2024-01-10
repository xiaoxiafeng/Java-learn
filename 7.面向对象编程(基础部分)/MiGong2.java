public class MiGong2 {
    
    public static void main(String[] args) {

        Maze maze = new Maze();
        int row = 10;
        maze.mazeWallSpace(row, row - 1);
        maze.wayOut(1, 1);
        System.out.println("===ÃÔ¹¬Â·Ïß===");
        for (int i = 0; i < maze.mazeWall.length; i++) {
            for (int j = 0; j < maze.mazeWall[i].length; j++) {
                System.out.print(maze.mazeWall[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}



class Maze {
    int[][] mazeWall;
    public void mazeWallSpace(int row, int col) {
        mazeWall = new int[row][col];
        System.out.println("===ÃÔ¹¬µØÍ¼===");
        for (int i = 0; i < mazeWall.length; i++) {
            for (int j = 0; j < mazeWall[i].length; j++) {
                mazeWall[0][j] = 1;
                mazeWall[mazeWall.length - 1][j] = 1;
                mazeWall[i][0] = 1;
                mazeWall[i][mazeWall[j].length - 1] = 1;
            }
        }

        for (int i = 0; i < mazeWall.length; i++) {
            for (int j = 0; j < mazeWall[i].length; j++) {
                System.out.print(mazeWall[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean wayOut(int i, int j) {
        if (mazeWall[6][5] == 2) {
            return true;
        } else {
            if (mazeWall[i][j] == 0) {
                mazeWall[i][j] = 2;
                if (wayOut(i + 1, j)) {
                    return true;
                } else if (wayOut(i, j + 1)) {
                    return true;
                } else if (wayOut(i, j + 1)) {
                    return true;
                } else if (wayOut(i - 1, j)) {
                    return true;
                } else {
                    mazeWall[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }

    }
}
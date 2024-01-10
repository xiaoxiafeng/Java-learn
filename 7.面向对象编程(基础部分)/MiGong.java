public class MiGong {
    
    public static void main(String[] args) {
        Labyrinth maze = new Labyrinth();
        int row = 9, col = 8;
        int[][] mazeWall = maze.mazeWallSpace(row, col);
        maze.findWay(mazeWall, 1, 1);
        for (int i = 0; i < mazeWall.length; i++) {
            for (int j = 0; j < mazeWall[i].length; j++) {
                System.out.print(mazeWall[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class Labyrinth {
    // int[][] mazeWall;
    public int[][] mazeWallSpace(int row, int col) {
        int[][] mazeWall = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mazeWall[0][j] = 1;
                mazeWall[i][0] = 1;
                mazeWall[row - 1][j] = 1;
                mazeWall[i][col - 1] = 1;
            }
        }
        mazeWall[3][1] = 1;
        mazeWall[3][2] = 1;
        System.out.println("=====当前地图情况======");
        for (int i = 0; i < mazeWall.length; i++) {
            for (int j = 0; j < mazeWall[i].length; j++) {
                System.out.print(mazeWall[i][j] + "\t");
            }
            System.out.println();
        }
        return mazeWall;
    }

    public boolean findWay(int[][] mazeWall,int i, int j) {
        if (mazeWall[mazeWall.length - 2][mazeWall[0].length - 2] == 2) {
            return true;
        } else {
            if (mazeWall[i][j] == 0) {
                mazeWall[i][j] = 2;
                if (findWay(mazeWall, i + 1, j)) {
                    return true;
                } else if (findWay(mazeWall, i, j + 1)) {
                    return true;
                } else if (findWay(mazeWall, i - 1, j)) {
                    return true;
                } else if (findWay(mazeWall, i, j - 1)) {
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
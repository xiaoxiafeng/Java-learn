public class MiGong {
    
    public static void main(String[] args) {
        Labyrinth maze = new Labyrinth();
        int row = 8, col = 7;
        maze.mazeWallSpace(row, col);
            
    }
}


class Labyrinth {
    public void mazeWallSpace(int row, int col) {
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
    }
}
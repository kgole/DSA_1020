public class NumberofIslands {

    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }

        int numOfIslands = 0;
        for(int i=0; i < grid.length; i++){
            for(int j=0;j < grid[i].length;j++){
                if(grid[i][j] == '1'){
                    numOfIslands += dfs(grid, i, j);
                }
            }
        }

        System.out.println(numOfIslands);
        return numOfIslands;
    }

    public int dfs(char[][] grid, int i, int j){
        //covering edge cases
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return 0;
        }

        grid[i][j] = '0';//make the visited value 0 (depth first)
        //recursive calls for dfs pass
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i,j-1);
        dfs(grid, i, j+1);
        return 1;
    }


    public static void main(String[] args) {

        NumberofIslands ni = new NumberofIslands();

        //char[][] example = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        ni.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}});
    }
}


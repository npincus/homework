class number8 {
    private char[][] grid;
    private int[][] land;
    private int num=0;
    public int numIslands(char[][] grid) {
        this.grid=grid;
        this.land=new int[grid.length][];
        for(int i=0;i<grid.length;i++){
            land[i]=new int[grid[i].length];
        }
        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid[i].length; j++) {
                land[i][j]=-1;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(isNewLand(i,j)){
                    num++;
                    mark(i,j,num);
                }
            }
        }
        return num;
    }
    private boolean isNewLand(int i, int j){
        if(i<0||j<0||i>grid.length-1||j>grid[i].length-1){
            return false;
        }
        else return land[i][j] == -1 && grid[i][j] == '1';
    }
    private void mark(int i, int j, int value){
        if(isNewLand(i,j)){
            land[i][j]=value;
            mark(i-1,j,value);
            mark(i+1,j,value);
            mark(i,j-1,value);
            mark(i,j+1,value);
        }
    }
}
/* ideal:not really useful
    d7: so here i saw things as 2 ideas, first knowing if we have been somewhere already this is handled by isNewLand
    and second is marking when we find land and all land attached to it, this is done by mark
    isNewLand is really simple if the land is not marked and not water its true other wise its false, edge is also false

    mark is simple it just calls it self on all attached places to anywhere we know there is land and marks them the same
    as the land we are currently on.

    numIslands is the controler and does everything else, most simple starts mark if we are on new land and counts up and
    moves threw the matrix
    Q: less a question and more a note that there could be many types of blockage other then water to expand this problem
    into but the core is kind of the same. its intersting.
 */
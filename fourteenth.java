class fourteenth {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        return binarySearch(matrix,target,0, matrix.length-1,0, matrix[0].length-1);
    }
    public boolean binarySearch(int[][] array, int target, int loi, int hii,int loj,int hij) {
        if (loi>hii||loj>hij) {
            return false;
        }
        if(loi==hii&&loj==hij){
            return array[hii][hij]==target;
        }

        int midi = (loi+hii)/2;
        int midj = (loj+hij)/2;
        if (array[midi][midj] == target) {
            return true;
        }

        if (array[midi][midj] > target) {
            return binarySearch(array, target, loi, midi,loj,midj);
        }
        return binarySearch(array, target, loi, midi,midj+1,hij)
                || binarySearch(array, target, midi+1, hii,midj+1,hij)
                || binarySearch(array, target, midi+1, hii,loj,midj);
    }
}
/* ideal: not used
    d7: idea was to split the matrix into 4 section based of the middle point 1 less 3 greater but all rectangular and
    they are all of close to the same size and keep doing that leading to log(n)log(m)solution think i messed up my boundrys
 */
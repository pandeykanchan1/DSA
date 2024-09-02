public class backtrackSudoku {
    public static void main(String[] args) {
        int sudoku[][]={
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}
        };
    }
    public static boolean sodokuSolver(int sudoku[][],int row,int col)
    {
        //base case
        if(row==9 && col==9){
            return true;
        }else if(row==9){
            return false;
        }

        //recursion
        int nextRow=row,nextcol=nextRow+1;
        if(col+1 ==9){
            nextRow=row+1;
            nextRow=0;
        }
        if(sudoku[row][col]!=0){
            sodokuSolver(sudoku, nextRow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
           if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col]=digit;
          if(  sodokuSolver(sudoku,nextRow,nextcol)){   //if return  then solution exits
                  return true;
          }
          sudoku[row][col]=0;
           } 
        }
        return false;


    }
}

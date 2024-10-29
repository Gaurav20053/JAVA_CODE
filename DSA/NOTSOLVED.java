// // //print all possible safe place for n queen in n*n
// // public boolean isSafe(int row,int col,char[][]board){
// //     for (int j=0;j<board.length;j++){
// //       if(board[row][j]=='Q'){
// //         return false;
// //       }
// //     }
// //   for(int i=0;i<board[0].length;i++){
// //     if (board[i][col]=='Q'){
// //       return false;
// //     }
// //   }
// //   int r=row;
// //   for (int c=col;c>=0 && r>=0;c--,r--){
// //     if (board[r][c]=='Q'){
// //       return false;
// //     }
// //   }
// //   for (int c=col;c>=0 && r<board.length;c--,r++){
// //     if (board[r][c]=='Q'){
// //       return false;
// //     }
// //   }
// //   for(int c=col;col<board.length&&r>=0;c++,r--){
// //     if (board[r][c]=='Q'){
// //       return false;
// //     }
// //   }
// //   for(int c=col;col<board.length&&r<board.length;c++,r++){
// //     if (board[r][c]=='Q'){
// //       return false;
// //     }
// //   }
// //   return true;
// //   }
// //   public void saveBoard(char[][] board,List<List<String>>allBoard,int col){
// //     String row ="";
// //     List<String> board=new ArrayList<>();
// //     for (int i=0; i<board.length;i++){
// //       row="";
// //       for (int j=0;j<board[0].length;j++){
// //         if (board[i][j]=='Q')
// //         row+='Q';
// //         else
// //         row+='.';
// //       }
// //       newboard.add(row);
// //     }
// //     allBoard.add(newboard);
// //   }
// //   public void helper(char[][] board,List<List<String>>allBoard,int col){
// //   if (col==board.length){
// //   saveBoard(board,allBoard);
// //   return;
// //   } 
// //   for(int row=0;row<board.length;row++){
// //     if(isSafe(row,col,board)){
// //       board[row][col]='Q';
// //       helper(board, allBoard, col+1);
// //       board[row][col]='.';
// //     }
// //   }
// //   }
// //   public List<List<String>> solveNQueen (int n){
// //     List<List<String>> allBoard = new ArrayList<>();
// //     char[][] board = new board[n][n];
// //     helper (board,allBoard,0);
// //   }


// class sudoku{
//     public boolean isSafe(char[][]board,int row,int col,int value){
//         for(int i=0;i<board.length;i++){
//             if(board[i][col]==(char)(value + '0')){
//                 return false;
//             } }for(int j=0;j<board.length;j++){
//                 if(board[j][col]==(char)(value + '0')){
//                     return false;
//                 }
//         }
// int sr=(row/3)*3;
// int sc=(col/3)*3;
//     for(int i=sr;i<sr+3;i++){
//         for(int j=sc;j<sc+3;j++){
//             if(board[i][j]==(char)(value +'0')){
//                 return false;
//             }
//         }
//     }
// return true;
// }
// public boolean helper(char[][] board,int row,int col){
//     if(row==board.length){
//         return true;
//     }
// int nrow=0;
// int ncol=0;
// if(col !=board.length-1){
//     nrow=row;
//     ncol=col+1;
// }else{
//     nrow=row+1;
//     ncol=0;
// }if(board[row][col]!='.'){
//     if(helper(board, nrow, ncol)){
// return true;
// }}
// else{
//     for(int i=1;i<=9;i++){
//         if(isSafe(board,row,col,i)){
//             board[row][col]=(char)(i+'0');
//             if(helper(board, nrow, ncol))
//         return true;}
//         else{
//             board[row][col]='.';
//         }
//     }
// }
// return false;
// }
// }
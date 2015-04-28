import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Collections;
import java.lang.Math.*;
 
 
public class paavanc {
  //class variables
    private final static float MAX_THRESHOLD = 1000; //if we lose
    private final static float MIN_THRESHOLD = -1000; //if we win
    private final  static int FINAL_DEPTH = 6; //how far we iterate
   
   
   
    public static void main(String[] args) {
     
      //Unit tests
     
     // readString("[13][302][1003][30002][100003][3000002][121212]LastPlay:null");
     
      //readString("[13][302][1003][31002][100003][3000002][121212]LastPlay:(1,3,1,3)");
     
      //readString("[13][302][1003][31002][100003][3000002][121212]LastPlay:(1,3,1,3)");
       //readString("[13][302][1003][31002][120003][3000002][121212]LastPlay:(1,3,1,3)");
      //readString("[13][302][1003][31002][120003][3000012][121212]LastPlay:(1,3,1,3)");
      //readString("[13][302][1003][31012][120003][3000002][121212]LastPlay:(1,3,1,3)");
      //readString("[13][302][1003][31002][100003][3003002][121212]LastPlay:(1,3,1,3)");
      //readString("[13][302][1003][31002][100003][3030032][121212]LastPlay:(1,3,1,3)");
     
      //readString("[13][302][1003][30002][100123][3000302][121212]LastPlay:null");
        // readString("[13][302][1003][30002][100103][3002302][121212]LastPlay:null");
         // readString("[13][302][1003][30002][100103][3003202][121212]LastPlay:null");
      //readString("[13][302][1003][30322][100103][3000002][121212]LastPlay:null");
      //readString("[13][302][1003][30232][100103][3000002][121212]LastPlay:null");
     
      //readString("[13][302][1003][30002][102103][3003002][121212]LastPlay:null");
      //readString("[13][302][1003][30002][103103][3002002][121212]LastPlay:null");
     
     // readString("[13][302][1003][30302][102103][3000002][121212]LastPlay:null");
     // readString("[13][302][1003][30202][103103][3000002][121212]LastPlay:null");
     
     
     // System.out.println("Case one blue");
     
      /*  System.out.println("Case one blue -1");
      readString("[13][302][1003][30032][100213][3000002][121212]LastPlay:null");
       System.out.println("Case one blue -2");
      readString("[13][302][1003][30012][100233][3000002][121212]LastPlay:null");
     
     
          System.out.println("Case two blue -1");
    readString("[13][302][1003][30002][100233][3000102][121212]LastPlay:null");
       System.out.println("Case two blue -2");
    readString("[13][302][1003][30002][100213][3000302][121212]LastPlay:null");
    */
 
         // System.out.println("Case three blue -1");
        //  readString("[13][302][1003][30002][100203][3001302][121212]LastPlay:null");
        //  readString("[13][302][1003][30002][100203][3003102][121212]LastPlay:null");
     
       //     System.out.println("Case four blue -1 btm left");
        //  readString("[13][302][1003][30002][101203][3003002][121212]LastPlay:null");
        //  readString("[13][302][1003][30002][103203][3001002][121212]LastPlay:null");
     
        //   System.out.println("Case five blue -1 top left");
        //  readString("[13][302][1003][30302][101203][3000002][121212]LastPlay:null");
        //  readString("[13][302][1003][30102][103203][3000002][121212]LastPlay:null");
     
          //    System.out.println("Case six blue -1 top two");
         // readString("[13][302][1003][30312][100203][3000002][121212]LastPlay:null");
        //  readString("[13][302][1003][30132][100203][3000002][121212]LastPlay:null");
     
      /*
     
            System.out.println("Case one green");
     
        System.out.println("Case one green -1");
      readString("[13][302][1003][30012][100323][3000002][121212]LastPlay:null");
       System.out.println("Case one blue -2");
      readString("[13][302][1003][30022][100313][3000002][121212]LastPlay:null");
     
     
          System.out.println("Case two green -1");
    readString("[13][302][1003][30002][100323][3000102][121212]LastPlay:null");
       System.out.println("Case two blue -2");
    readString("[13][302][1003][30002][100313][3000202][121212]LastPlay:null");
   
 
          System.out.println("Case three green -1");
         readString("[13][302][1003][30002][100303][3002302][121212]LastPlay:null");
         readString("[13][302][1003][30002][100303][3003202][121212]LastPlay:null");
     
            System.out.println("Case four green -1 btm left");
          readString("[13][302][1003][30002][101303][3002002][121212]LastPlay:null");
          readString("[13][302][1003][30002][102303][3001002][121212]LastPlay:null");
     
           System.out.println("Case five green -1 top left");
          readString("[13][302][1003][30202][101303][3000002][121212]LastPlay:null");
          readString("[13][302][1003][30102][102303][3000002][121212]LastPlay:null");
     
              System.out.println("Case six green -1 top two");
          readString("[13][302][1003][30212][100303][3000002][121212]LastPlay:null");
          readString("[13][302][1003][30122][100303][3000002][121212]LastPlay:null");
 
*/
    // readString("[13][302][1003][30002][100003][3000002][121212]LastPlay:null");
     
     
     
     
      //DEMO TESTS RIGHT HERE!!!
      /*
     System.out.println(readString("[13][302][1003][31002][100003][3000002][121212]LastPlay:(1,3,1,3)"));
     System.out.println(readString("[13][302][1003][31002][110003][3000002][121212]LastPlay:(1,2,1,4)"));
     System.out.println(readString("[13][302][1003][31002][112003][3000002][121212]LastPlay:(2,2,2,3)"));
     System.out.println(readString("[13][302][1003][31002][112003][3020002][121212]LastPlay:(2,1,2,4)"));
     System.out.println(readString("[13][302][1003][31002][112003][3022002][121212]LastPlay:(2,1,3,3)"));
     System.out.println(readString("[13][302][1003][31002][112003][3022202][121212]LastPlay:(2,1,4,2)"));
     System.out.println(readString("[13][302][1003][31002][112203][3022202][121212]LastPlay:(2,2,3,2)"));
     System.out.println(readString("[13][302][1003][31202][112203][3022202][121212]LastPlay:(2,3,2,2)"));
     System.out.println(readString("[13][302][1023][31202][112203][3022202][121212]LastPlay:(2,4,2,1)"));
     System.out.println(readString("[13][302][1123][31202][112203][3022202][121212]LastPlay:(1,4,1,2)"));
     System.out.println(readString("[13][322][1123][31202][112203][3022202][121212]LastPlay:(2,5,1,1)"));
     
     System.out.println(readString("[13][302][1003][30002][1212]LastPlay:null"));
     System.out.println(readString("[13][332][1003][30002][1212]LastPlay:(3,3,1,1)"));
     System.out.println(readString("[13][332][1103][30002][1212]LastPlay:(1,2,1,2)"));
     System.out.println(readString("[13][332][1133][30002][1212]LastPlay:(3,2,2,1)"));
     System.out.println(readString("[13][332][1133][30102][1212]LastPlay:(1,1,2,2)"));
     System.out.println(readString("[13][332][1133][32102][1212]LastPlay:(2,1,1,3)"));
     */
     
   System.out.println(readString(args[0]));
 
 
 
     
     
     
     
    }
   
    //reads the board
    public static String readString(String board){
     
 
      //code
//delimeters to parse string
String delims = "\\[|\\]";
String[] tokens = board.split(delims);
      //System.out.println(Arrays.toString(tokens));
      //System.out.println(tokens.length);
      //System.out.println(tokens[tokens.length -1]);
      //  System.out.println(tokens[0]);
       
       
        //code to remove spaces from the string
          int j = 0;
    for( int i=0;  i<tokens.length;  i++ )
    {
        if (tokens[i].equals("")==false)
            tokens[j++] = tokens[i];
    }
    String [] newArray = new String[j];
    System.arraycopy( tokens, 0, newArray, 0, j );
   
      //System.out.println(Arrays.toString(newArray));  
         
     // System.out.println(newArray.length-1);  
     
      int size =newArray.length-1;
     
     
      //code that converts our string array to a matrix
      int matrix [][] = new int [size][size];
     
     
     
      for (int i=0;  i<size; i++){
        for (int z =0 ; z<newArray[i].length(); z++){
          matrix[i][z]= Integer.parseInt(Character.toString(newArray[i].charAt(z)));
 
        }
       
      }
      //add negative ones to all empty slots in array not 0...this way we know what the board is
       //System.out.println(Arrays.deepToString(matrix));
             for (int i=0;  i<size; i++){
        for (int z =0 ; z<size -newArray[i].length(); z++){
         
          matrix[i][z + newArray[i].length()]= -1;
 
        }
       
      }
          
       //System.out.println(Arrays.deepToString(matrix));
       
       
       int [] playerMove =  new int [4]; //code that gets the last play
       
       if (newArray[newArray.length -1].equals("LastPlay:null")){
         for (int i =0; i< playerMove.length; i++){
           playerMove[i]=-1;
           
         }
       //  System.out.println(Arrays.toString(playerMove));
         
       }
       else {
         
  delims = "\\(|\\)";// delims for that
String[] tokens2 = newArray[newArray.length -1].split(delims);
 
char [] tokens3 = tokens2[tokens2.length -1 ].toCharArray();
 
 
//code that that removes spaces and conversts last play array to ints
 
          int x = 0;
    for( int i=0;  i<tokens3.length;  i++ )
    {
        if (Character.toString(tokens3[i]).equals(",")==false)
            tokens3[x++] = tokens3[i];
    }
    char [] newArray2 = new char[x];
    System.arraycopy( tokens3, 0, newArray2, 0, x );
 
 
for (int i =0; i<playerMove.length; i++){
 
 
 
  playerMove[i]=Integer.parseInt(Character.toString((newArray2[i])));
 
 
}
 
 
 
   //System.out.println(Arrays.toString(playerMove));
    //System.out.println(playerMove.length);
 
         
         
       }
       
     
      //pass the matrix of the board and last play to move
       return  move(matrix, playerMove);
 
      }
   
     
     
     
     
     
 
 
 
     
     
     
   
    //returns move we need to make
    public static String move(int [][] board, int [] lastMove){
     
      //determines if the board passed in is valid
      if (valid(board)==false){
       
        return "You lose!";
       
      }
      /*
      // eval(board, playerMove);
             int [] moves = getMoves(board, playerMove);
 
         // System.out.println(Arrays.toString(moves));
                        int blue =2;
              int green =3;
              int red =1;
              int [] colors ={blue, red, green};
         
         
 
                     
                   
                    for (int i=0; i<moves.length; i=i+2){
                    for (int j =0; j<colors.length; j++){
                      board[moves[i]][moves[i+1]]= colors[j];
                      if (valid(board)!=false){
                        int size= board.length-2;
                        int x=board.length-moves[i]-1;
                        int y=moves[i+1];
                        int [] temp ={colors[j],x,y,size +2 -x-y};
                        System.out.println(Arrays.toString(temp));
                       
                      }
                     
                     
                    }
                    }
     
      //System.out.println(Arrays.toString(playerMove));
     // System.out.println(Arrays.deepToString(board));
     
     
      */
     
      //array of colors
              int blue =2;
              int green =3;
              int red =1;
              int [] colors ={blue, red, green};
      //max value that we use to benchmark
         float max = Integer.MIN_VALUE;
         
        String best = "";//string that will eventually be returned as the best move
     
        //values we use to store row and column
   int val1 =0;
int val2 =0;
 
       
        //translate last move corrdinates to our system ..aka reverse column to 0 being being the top of traingle
       int tempRow = board.length -lastMove[1]-1;
      int tempCol = lastMove[2];
     
      int [] list = new int [13];
      int uncolored= 0;
     float val =0; //update value to compate to max
     int [] move = new int [4]; //array to update our move
     int filled =0; //counter to check filled spots
     
     //make sure we arent passed a null play
     //next set of cases check to see all open spots adjacent to the one we are given
     //if the spots are filled we update the counter filled
      if(tempCol!=-1){
      //case 1 -right below
       
      if(board[tempRow+1][tempCol]==uncolored){
       
        val1=tempRow+1;
        val2 =tempCol;
        //test each color
        for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove); //if uncolored pass to minMax function to do pruning
          board[val1][val2]=0;
         
          //if val> max get the next move and update max
          if (val>max){
           int size= board.length-2; //readjust x and coordinates to apostos system
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
 
       
      }
            else {
        filled++; //if filled update filled
      }
     
//same steps as before for all the cases
        //case 2 -right above
      if(board[tempRow-1][tempCol]==uncolored){
        val1=tempRow-1;
        val2 =tempCol;
       
          for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
       
       
       
      }
        else {
        filled++;
      }
 
       //case 3 -to the left
      if(board[tempRow][tempCol-1]==uncolored){
        val1=tempRow;
        val2=tempCol-1;
       
       
       
                for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
       
      }
            else {
        filled++;
      }
 
       //case 4 -to the right
      if(board[tempRow][tempCol+1]==uncolored){
        val1=tempRow;
        val2 =tempCol+1;
       
       
       
                for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
       
      }
            else {
        filled++;
      }
 
      //case 5 -left diagnol
      if(board[tempRow-1][tempCol-1]==uncolored){
       val1=tempRow-1;
       val2 =tempCol-1;
       
       
       
               for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
       
       
      }
            else {
        filled++;
      }
 
       //case 6 -right diagnol
      if(board[tempRow+1][tempCol+1]==uncolored){
        val1=tempRow+1;
        val2 =tempCol+1;
       
       
       
       
                for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
       
       
       
      }
      else {
        filled++;
      }
 
      }
      //if a null value, hardcode the row and column to 1, 1
      else {
     
        val1= 1;
        val2= 1;
       
       
       
               
        for (int i=0; i<colors.length; i++){
          board[val1][val2]=colors[i];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[i];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
       
     
      }
     
      //if the all adjacent spots  are filled, look for the next available space
      if (filled ==6){
        for (int i=0; i<board.length; i++){
          for (int j=0; j<board.length; j++){
            if (board[i][j]==uncolored){
                 val1= i;
                 val2= j;
                 
                 
          for (int z=0; z<colors.length; z++){
          board[val1][val2]=colors[z];
          val = minMax(board, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,lastMove);
          board[val1][val2]=0;
         
          if (val>max){
           int size= board.length-2;
           int x=board.length-val1-1;
           int y=val2;
           move[0]=colors[z];
           move[1]=x;
           move[2]=y;
           move[3]=size +2 -x-y;
 
            max=val;
           
          }
         
         
        }
             
             
             
             
             
             
             
             
             
            }
           
           
          }
        }
       
       
      }
     
     
     
         
      //int newRow = board.length -move[1]-1;
     // int newCol = move[2];
     // board[newRow][newCol]=move[0];
     
     
      //these next set of functions translate our answer into a string
      String builder="(";
     
      for (int i=0; i<move.length; i++){
        if (i!=3){
        builder=builder+Integer.toString(move[i])+",";
        }
        else{
          builder=builder+Integer.toString(move[i])+")";
         
        }
      }
       
        best=builder;
     
     
   
        return best;
     
     
     
    }
    //evaluates the board
        public static float eval(int [] [] board, int [] lastMove){
      int eval =0; //value we update
     
      //list of all optins
      int uncolored =0;
      int blue = 2;
      int green =3;
      int red =1;
      int notPossible =-1;
     
     
     
     //base cases
     
      //left hand side of traingle=blue we win
      for (int i=0; i<board.length-1; i++){
       
        if (board[i][1] ==blue){
         // System.out.println(MIN_THRESHOLD);
         
          return MIN_THRESHOLD;
        }
       
       
      }
     
      //right hand side of triangle =red we win
           int counter =1;
      for (int i=1; i<board.length-1; i++){
       
        if (board[i][counter] ==red){
          //System.out.println(MIN_THRESHOLD);
         
          return MIN_THRESHOLD;
        }
        counter ++;
       
       
      }
     
      //bottom row of triangle =green we win
       for (int j=1; j<board[board.length-2].length; j++){
       
        if (board[board.length-2][j] ==green){
          //System.out.println(MIN_THRESHOLD);
         
          return MIN_THRESHOLD;
        }
 
      }
       
       
       
       //scan whole board to see if player lost
       int rowAdjuster =3; //have a rowadjuster cause our matrix is bigger than the triangle
       for (int i =1; i<board.length-1; i++){
         for (int j=1; j<rowAdjuster-1; j++){
           
           
           //we check all adjacent spots to the color that is chosen and repeat for each color
           //if piece selected is red
         
           if (board[i][j]==red){
             //case 1 - top right corner
             if ((board[i-1][j]==blue && board[i][j+1]==green) || (board[i-1][j]==green && board[i][j+1]==blue)  ){
               //System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 2 - bottom right corner
                 if ((board[i+1][j+1]==blue && board[i][j+1]==green) || (board[i+1][j+1]==green && board[i][j+1]==blue)  ){
               //System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 3 -bottom two
                 if ((board[i+1][j+1]==blue && board[i+1][j]==green) || (board[i+1][j+1]==green && board[i+1][j]==blue)  ){
              // System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 4 -top two
              if ((board[i-1][j-1]==blue && board[i-1][j]==green) || (board[i-1][j-1]==green && board[i-1][j]==blue)  ){
               //System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 5 -bottom left corner
              if ((board[i+1][j]==blue && board[i][j-1]==green) || (board[i+1][j]==green && board[i][j-1]==blue)  ){
               //System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 6 -top left corner
              if ((board[i-1][j-1]==blue && board[i][j-1]==green) || (board[i-1][j-1]==green && board[i][j-1]==blue)  ){
            //   System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
                 
     
           }
           
           
          //if piece selected is blue
            if (board[i][j]==blue){
             
                           //case 1 - top right corner
             if ((board[i-1][j]==red && board[i][j+1]==green) || (board[i-1][j]==green && board[i][j+1]==red)  ){
              // System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 2 - bottom right corner
                 if ((board[i+1][j+1]==red && board[i][j+1]==green) || (board[i+1][j+1]==green && board[i][j+1]==red)  ){
             // System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 3 -bottom two
                 if ((board[i+1][j+1]==red && board[i+1][j]==green) || (board[i+1][j+1]==green && board[i+1][j]==red)  ){
              // System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 4 -top two
              if ((board[i-1][j-1]==red && board[i-1][j]==green) || (board[i-1][j-1]==green && board[i-1][j]==red)  ){
               //System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 5 -bottom left corner
              if ((board[i+1][j]==red && board[i][j-1]==green) || (board[i+1][j]==green && board[i][j-1]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 6 -top left corner
              if ((board[i-1][j-1]==red && board[i][j-1]==green) || (board[i-1][j-1]==green && board[i][j-1]==red)  ){
              // System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             
   
             
           }
           
            //if piece selected is green
            if (board[i][j]==green){
             
             
             
             
             
                                         //case 1 - top right corner
             if ((board[i-1][j]==red && board[i][j+1]==blue) || (board[i-1][j]==blue && board[i][j+1]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 2 - bottom right corner
                 if ((board[i+1][j+1]==red && board[i][j+1]==blue) || (board[i+1][j+1]==blue && board[i][j+1]==red)  ){
            ///  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             //case 3 -bottom two
                 if ((board[i+1][j+1]==red && board[i+1][j]==blue) || (board[i+1][j+1]==blue && board[i+1][j]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 4 -top two
              if ((board[i-1][j-1]==red && board[i-1][j]==blue) || (board[i-1][j-1]==blue && board[i-1][j]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 5 -bottom left corner
              if ((board[i+1][j]==red && board[i][j-1]==blue) || (board[i+1][j]==blue && board[i][j-1]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
              //case 6 -top left corner
              if ((board[i-1][j-1]==red && board[i][j-1]==blue) || (board[i-1][j-1]==blue && board[i][j-1]==red)  ){
             //  System.out.println(MIN_THRESHOLD);
          return MIN_THRESHOLD;
             
             
           }
             
             
   
             
           }
           
         }
         
         rowAdjuster++; //update row at the end
       }
       
     
     
     
      //check if opponent won match
       int free=0;
       int taken=0;
       //System.out.println(Arrays.deepToString(board));
       int triangleLength =3;
       
      for(int i =1; i< board.length-1; i++){
        for (int j=1; j<triangleLength-1; j++){
 
          if (board[i][j]==blue || board[i][j]==red || board[i][j]==green) {
          //  System.out.println("Board length is: " + board[i].length);
           ////  System.out.println("Integer i is: "+i);
          //   System.out.println("Integer j is: "+j);
          //  System.out.println("Board value is: "+board[i][j]);
           
            taken++;
          }
         
         
        }
       // System.out.println("Row length is: " + triangleLength);
        triangleLength++;
       
      }
      
         //get the eval score for all adjacent spots -same as in move
      //get index of chosen spot
      int tempRow = board.length -lastMove[1]-1;
      int tempCol = lastMove[2];
     
       
     
     
      int filled =0; //if adjacent spot filled updat
      int checker =0;
     
      //make sure the column passed in isnt null
      if(tempCol!=-1){
      //case 1 -right above
      if(board[tempRow+1][tempCol]==uncolored){
       
        int indexRow=tempRow+1;
        int indexCol =tempCol;
 
       
      }
      else {
        filled++;
      }
        //case 2 -right below
      if(board[tempRow-1][tempCol]==uncolored){
          int indexRow=tempRow-1;
        int indexCol =tempCol;
       
      }
      else {
        filled++;
      }
       //case 3 -to the left
      if(board[tempRow][tempCol-1]==uncolored){
          int indexRow=tempRow;
        int indexCol =tempCol-1;
       
      }
      else {
        filled++;
      }
       //case 4 -to the right
      if(board[tempRow][tempCol+1]==uncolored){
          int indexRow=tempRow;
        int indexCol =tempCol+1;
       
      }
      else {
        filled++;
      }
      //case 5 -left diagnol
      if(board[tempRow-1][tempCol-1]==uncolored){
          int indexRow=tempRow-1;
        int indexCol =tempCol-1;
       
      }
      else {
        filled++;
      }
       //case 6 -right diagnol
      if(board[tempRow+1][tempCol+1]==uncolored){
          int indexRow=tempRow+1;
        int indexCol =tempCol+1;
       
      }
      else {
        filled++;
      }
      }
   
       //eval equals the amount of spots filled
      //more spots filled equal a worse score cause we have less places to move
       
      eval =filled;
    // System.out.println(eval);
     
      return eval;
    }
       
       
       
        //alpha beta pruning
            public static float minMax(int[][] board, int depth, float alpha, float beta, int [] lastMove){
              int blue =2; //array of colors
              int green =3;
              int red =1;
              int [] colors ={blue, red, green};
              //check to see if the board passes or not-or we at the end of our search
          if(depth == FINAL_DEPTH || eval(board, lastMove) >= MAX_THRESHOLD || eval(board, lastMove) <= MIN_THRESHOLD)
        {
            return eval(board,lastMove );
        }
          //if we at an even depth
                  else if(depth % 2 == 0){
                    ///our move
                    int [] moves = getMoves(board, lastMove); //gets all available moves from the point -adjacent spots
                    for (int i=0; i<moves.length; i=i+2){ //iterate through all moves in moves array - row,col,row,col -is what it looks like //hence i+2
                    for (int j =0; j<colors.length; j++){ //iterate through color options
                      board[moves[i]][moves[i+1]]= colors[j];
                      if (valid(board)!=false){ //check to see if this move works
                        int size= board.length-2;
                        int x=board.length-moves[i]-1;   //update our move based on if it works -adjust rows and cols as before
                        int y=moves[i+1];
                        int [] temp ={colors[j],x,y,size +2 -x-y};
                         alpha = Math.max(alpha, minMax(board, depth + 1, alpha, beta, temp));  //update alpha
                         if(beta < alpha){ //if beta is smaller
                           board[moves[i]][moves[i+1]] = 0; //reset that move and return alpha
                           return alpha;
                           
                         }
                       
                       
                      }
                      board[moves[i]][moves[i+1]] = 0; //if not valid reset board..no update alpha
                     
                     
                     
                     
                    }
                     return alpha; //return alpha
                    }
                       
                   
                   
                   
                   
                  }
                 
                  else {
                    //check player move
                   
                    int [] moves = getMoves(board, lastMove); //get all possible moves -same as for alpha
                    for (int i=0; i<moves.length; i=i+2){
                    for (int j =0; j<colors.length; j++){
                      board[moves[i]][moves[i+1]]= colors[j];
                      if (valid(board)!=false){
                        int size= board.length-2;
                        int x=board.length-moves[i]-1;
                        int y=moves[i+1];
                        int [] temp ={colors[j],x,y,size +2 -x-y};
                         beta = Math.min(beta, minMax(board, depth + 1, alpha, beta, temp));
                         if(beta < alpha){
                           board[moves[i]][moves[i+1]] = 0;  //return beta instead
                           return beta;
                           
                         }
                       
                       
                      }
                      board[moves[i]][moves[i+1]] = 0;
                     
                     
                   
 
                    }
                    return beta;
                     
                   
                   
                   
                  }
                  }
                 
                 
                 
                 
             
          return -1;    
             
             
     
     
    }
            //check if our board is valud
            public static boolean valid(int [] [] board){
              int [] dummy = {-1,-1,-1,-1};  //dummy array to pass into eval
             
              float answer =eval(board, dummy);  //we want min_threshold to return so we can say it fails
              if (answer==MIN_THRESHOLD){
             
              return false;
              }
              else {
               
               return true; //if not return true
              }
             
            }
           
            //this function gets all possible moves based on the last move -similar to eval and move
            public static int [] getMoves(int [] [] board, int [] lastMove){
             
             
      int tempRow = board.length -lastMove[1]-1;  //fix cols and rows
      int tempCol = lastMove[2];
     
      int [] list = new int [13];  //list that will hold all our rows and cols
      int uncolored= 0;
     
      //vals that will house rows and cols temporarily
int val1 =0;
int val2 =0;
int val3 =0;
int val4 =0;
int val5 =0;
int val6 =0;
int val7 =0;
int val8 =0;
int val9 =0;
int val10 =0;
int val11 =0;
int val12 =0;
int filled =0; //fill counter
     
//check to see if not null
//same as eval accept store rows and cols in vals
      if(tempCol!=-1){
      //case 1 -right above
      if(board[tempRow+1][tempCol]==uncolored){
       
        val1=tempRow+1;
        val2 =tempCol;
 
       
      }
            else {
        filled++;
      }
 
        //case 2 -right below
      if(board[tempRow-1][tempCol]==uncolored){
          val3=tempRow-1;
        val4 =tempCol;
       
      }
            else {
        filled++;
      }
 
       //case 3 -to the left
      if(board[tempRow][tempCol-1]==uncolored){
          val5=tempRow;
        val6=tempCol-1;
       
      }
            else {
        filled++;
      }
 
       //case 4 -to the right
      if(board[tempRow][tempCol+1]==uncolored){
          val7=tempRow;
        val8 =tempCol+1;
       
      }
            else {
        filled++;
      }
 
      //case 5 -left diagnol
      if(board[tempRow-1][tempCol-1]==uncolored){
         val9=tempRow-1;
       val10 =tempCol-1;
       
      }
            else {
        filled++;
      }
 
       //case 6 -right diagnol
      if(board[tempRow+1][tempCol+1]==uncolored){
         val11=tempRow+1;
        val12 =tempCol+1;
       
      }
            else {
        filled++;
      }
 
      }
      else { //if not adjacent return array of 1,1 so start in b/t 302 of triangle
        int [] value = new int [2];
        value[0]= 1;
        value[1]= 1;
        return value;
 
      }
      //if all are filled --look for the next free open spot and return those coordinates
      if (filled==6){
        for (int i=0; i<board.length; i++){
          for (int j=0; j<board.length; j++){
            if (board[i][j]==uncolored){
              int [] value = new int [2];
              value[0]=i;
              value[1]=j;
             
            }
           
           
          }
         
        }
       
       
       
      }
   
       //store all our values in our list
       list[0]=val1;
       list[1]=val2;
       list[2]=val3;
       list[3]=val4;
       list[4]=val5;
       list[5]=val6;
       list[6]=val7;
       list[8]=val8;
       list[9]=val9;
       list[10]=val10;
       list[11]=val11;
       list[12]=val12;
       
       //get rid of zeroes in our list -
             int j = 0;
               for( int i=0;  i<list.length;  i++ ){
                if (list[i] !=0)
                  list[j++] = list[i];
                 }
             int [] newArray = new int[j];
            System.arraycopy( list, 0, newArray, 0, j );
         
         
   
      //return list of coordinates
      return newArray;
             
             
            }
   
   
 
 
}

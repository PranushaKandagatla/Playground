import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int cur_row,cur_col;
      for( cur_row = 1 ; cur_row <= n ; cur_row++ ) {
        for( cur_col = 1 ;cur_col <= cur_row ; cur_col++ ) {
          System.out.print(cur_row);
        }
        System.out.print("\n");
	}
	}
}
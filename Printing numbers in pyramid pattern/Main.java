import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val =1;
      for(int currrow=1;currrow<=n;currrow++)
      {
        for(int space=1;space<=(n-currrow);space++)
        {
          System.out.print(" ");
        }
        for(int currcol=1;currcol<=currrow;currcol++)
        {
          System.out.print(val+" ");
          val++;
        }
        System.out.println();
      }
    }    
}
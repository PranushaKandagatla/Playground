import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val=n;
      for(int currrow=1;currrow<=n;currrow++)
      {
        for(int currcol=val;currcol>=1;currcol--)
        {
          System.out.print(currcol);
        }
        val--;
        System.out.println();
      }
	}
}
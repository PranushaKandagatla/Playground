import java.util.Scanner;
class Main
{
  public static int square_root(int n)
  {
    int sr = n*n;
    return sr;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sr = square_root(n);
      System.out.println(sr);
	} 
} 
	 

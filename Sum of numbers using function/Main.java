import java.util.Scanner;
class Main{
  public static int sum_of_num(int y)
  {
    int sum = 0;
    for(int i=1;i<=y;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
  public static void main (String[] args)
  {
   Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    System.out.println(sum_of_num(n));
  }
	}

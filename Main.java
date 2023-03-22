import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int a=0;
    int b=1;
    System.out.println(a+" "+b+" ");
    int sum;
    for(int i=3;i<n;i++){
      sum=a+b;
      System.out.print(sum+" ");
      a=b;
      b=sum;
    }
    
  }
}
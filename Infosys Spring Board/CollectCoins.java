import java.util.Scanner;

public class CollectCoins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
int N = sc.nextInt();

int count = 0;

if(N == 0){
    System.out.println(0);
}

while(N != 0){
  if(N % 2 == 0){
    N=N/2;
    count++;
  }
  else{
    N -= 1;
    count++;
  }
}

System.out.println(count);
    }
}
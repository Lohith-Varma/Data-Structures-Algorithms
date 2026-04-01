import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int prev = arr[0];
        int prev2 = 0;
        int curr = 0;
        for(int i=0; i<n; i++) {
            int pick = arr[i];
            if(i > 1)
                pick += prev2;

            int notPick = 0 + prev;

            curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        System.out.println(curr);

        sc.close();
    }
}

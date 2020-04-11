import java.util.*;

public class P56_InsertSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i =0; i <N; i++){
            A[i] = sc.nextInt();
        }

        for(int j = 1; j < N; j++){
            int k = j;
            while(k > 0 && A[k-1] > A[k] ){
                int tmp = A[k-1];
                A[k-1] = A[k];
                A[k] = tmp;
                k--;
            }
            for(int i =0; i <N; i++){
            }
        }
        for(int i =0; i <N; i++){
            System.out.print(A[i] + " ");
        }
    }

}

// ŽQl
// https://qiita.com/Liberty/items/fcfe0ef3ef22834e9d76
import java.util.*;

public class P60_BubbleSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i =0; i <N; i++){
            A[i] = sc.nextInt();
        }
        int v =0;

        for(int j = 0; j <N -1 ; j++){
            for(int k = N - 1 ; k > j; k--){
                if(A[k] < A[k - 1]){
                v = A[k - 1];
                A[k - 1] = A[k];
                A[k] = v;

                }
            }
        }
        for(int i =0 ; i< A.length; i++){
            System.out.print(A[i] + " ");

        }
    }

}

// ŽQl
// https://qiita.com/Liberty/items/180b686c97dc8732235a
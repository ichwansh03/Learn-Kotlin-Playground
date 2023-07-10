import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int N, M;
        N = input.nextInt();
        M = input.nextInt();

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= M; j++){
                total++;
            }
        }
    }
}

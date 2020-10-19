package name;

import java.util.Scanner;
// вывод последуещего четного числа
public class number_3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int b[] = new int[n];// 10 переменных
        int co = 0;

        for(int i = 0; i<n; i++ ){
            b[i] = in.nextInt();
        }
    }
}

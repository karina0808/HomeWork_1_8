package name;

import java.util.Scanner;

public class number_1 {
//последнее число

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int l = 9999;
        int r = 99999;
        int summ = 0;

        while(l<=r){
            if(l%a == b & l%c ==d){
                System.out.print(l + " ");
                summ++;
            }
            l++;
            if (summ == 0){
                System.out.print(-1);
            }
        }
    }
}

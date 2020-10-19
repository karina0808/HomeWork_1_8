package name;

import java.util.Scanner;

public class namee {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;
        int c;
        int v;

        b = a %10;
        a = a/10;
        c = a;
        while (c >0){
            v = c % 10;
            c = c / 10;
            if (b == c){
                System.out.print("YES");
                b = 77;
                break;
            }
            if (b == 77){
                c = 0;
            }
            if (b != 77){
                System.out.print("NO");
            }
        }
    }
}

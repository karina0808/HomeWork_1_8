package name;

import java.util.Scanner;

public class First_exm {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        int rez = 0;
        while (a != 0){
            c = a - b;
            a = c;
            rez += 1;
        }
        System.out.print(rez + " " + c);
    }
}

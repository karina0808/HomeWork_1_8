package name;

import java.util.Scanner;

public class vlojennieIF {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        int c = 0;
        int i = 0;
        while(i%10 + i/10%10 <=18){
            i = in.nextInt();
            if (i >= 100 || i<=9){
                break;
            } else{
                c += i%10 + i/10%10;
            }
        }
        System.out.print(c);
    }
}

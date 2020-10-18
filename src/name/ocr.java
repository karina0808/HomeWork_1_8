package name;

import java.util.Scanner;

public class ocr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 2;
        if (n>=2){
            while(x<10000){
                if (n % x == 0){
                    break;
                } else{
                    x++;
                }
            }
        }
        System.out.print(x);
    }
}


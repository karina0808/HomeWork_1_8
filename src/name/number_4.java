package name;

import java.util.Scanner;
//часы
public class number_4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int min = a%1440;
        int ho = min/60;

        int minutes = min%60;
        System.out.println(ho + ":" + minutes);
    }
}

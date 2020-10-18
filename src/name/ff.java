package name;

import java.util.Scanner;

public class ff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (y>x && (2-x*x)>=y && x<0 || y<=2-x*x && y>=0 && x>=0) {
            System.out.println("Точка принадлежит области");
        } else {
            System.out.println("Точка не принадлежит области");
        }
    }

}

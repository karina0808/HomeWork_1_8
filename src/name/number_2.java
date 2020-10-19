package name;

import java.util.Scanner;
// десятки числа
public class number_2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int a[] = new int[v];
        boolean f = false;
        int co = 0;
        for(int i = 0; i<v; i++ ){
            a[i] = in.nextInt();
        }
        for(int i = 0; i<v; i++ ){
            if(a[i]*a[i+1]>0){
                System.out.print("Yes");
                f = true;
                break;
            }
        }
        if(f == false){
            System.out.print("No");
        }
    }
}

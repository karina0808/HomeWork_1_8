package num_1_8;

import java.util.Scanner;

public class num_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;
        int numB = 0;
        int max = 0;
        int numMax = 0;
        int c = 0;
        int min = 0;
        int a[] = new int [n];    int b[] = new int [n]; int d[] = new int [n];

        for(int i=0;i<a.length;i++) {
            a[i]=s.nextInt();
        }
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a.length; j++){
                if(a[i] == a[j]){
                    num++;
                }}
            b[i]=num; num=0;
        }

        for(int i = 0; i<b.length; i++) {
            if(b[i]==1) numB++;
        }

        if(numB==b.length){
            System.out.println(min);
        } else {
            max=b[0];
            for(int i=0;i<b.length;i++) {
                if(max<b[i]) {
                    max=b[i]; c=i;
                }
            }
            for(int i=0;i<b.length;i++) {
                if(max==b[i]) {
                    numMax++;
                }
            }
            if(numMax==1){
                System.out.println(a[c]);
            }
            else {
                for(int i=0;i<b.length;i++) {
                    if(b[i]==max) {
                        d[i] = a[i];
                    }
                }

                min=d[0];
                c=0;
                for(int i = 0; i<d.length; i++) {
                    if(min>d[i] && d[i]!=0) {min=d[i];c=i;}
                }
                System.out.println(min);

            }
        }
    }
}
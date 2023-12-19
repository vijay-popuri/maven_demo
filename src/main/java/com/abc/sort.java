package com.abc;

public class sort {
public static int[] sorting(int[] a){

for (int i = 0; i < a.length; i++)
    {
        for (int j = i + 1; j <a.length; j++) {
            int temp = 0;

        if (a[j] < a[i]) {

                temp = a[i];

                a[i] = a[j];

                 a[j] = temp;

            }
        }
}
return a;
}
}

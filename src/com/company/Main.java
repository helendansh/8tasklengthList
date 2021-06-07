package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Не зачтено. Выдает ошибку:
 * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 10
 * 	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
 * 	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
 * 	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
 * 	at java.base/java.util.Objects.checkIndex(Objects.java:373)
 * 	at java.base/java.util.ArrayList.get(ArrayList.java:426)
 * 	at com.company.Main.main(Main.java:17)
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringlist = new ArrayList<>();
        for (int i=0; i<10; i++) {
            stringlist.add(reader.readLine());
        }
        for (int i=0; i<(stringlist.size()-1); i++) {
            if (stringlist.get(i).length() > stringlist.get(i+1).length()) {
                System.out.println(i+1); break;
            }
        }
    }
}
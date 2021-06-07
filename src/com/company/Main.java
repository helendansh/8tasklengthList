package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

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
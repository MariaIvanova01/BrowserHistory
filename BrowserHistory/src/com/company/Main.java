package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String currentURL = "";

        ArrayDeque<String> memoryList = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (!memoryList.isEmpty()){
                    currentURL = memoryList.pop();
                }else{
                    System.out.println("no previous URLs");
                    input = scan.nextLine();
                    continue;
                }
            }else{
                if (!currentURL.equals("")){
                    memoryList.push(currentURL);
                }
                currentURL = input;
            }
            input = scan.nextLine();
            System.out.println(currentURL);

        }
    }
}

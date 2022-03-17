package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            System.out.println("Enter 1 to decide 1 task");
            System.out.println("Enter 2 to 2 decide task");
            System.out.println("Enter 3 to 3 decide task");

            int choice = scanner.nextInt();

            if(choice==1&&choice<4){
                System.out.println("Enter a 5 line");
                for (int i = 0; i < 5; i++) array.add(i, reader.readLine());

                for (int a = 0; a < array.size(); a++) {
                    int yes = 0;
                    for (int b=0; b<array.size(); b++) if (array.get(a).length()>=array.get(b).length()) yes++;
                    if (yes==5) System.out.println(array.get(a));
                }
                }
            if (choice==2 && choice<4){
                String[] vowels = { "60", "999", "14", "dart1", "45", "95", "dart", "1" };
                String second = scanner.next();
                for (String s : vowels) {
                    if (second.equals(s)) {
                        System.out.println(vowels +" YES");
                    } else{
                        System.out.println(second +" NO");
                    }
                }

            }

            if (choice==3&&choice<4){

                System.out.println("Enter words: ");
                String third= new Scanner(System.in).nextLine();
                String values = " ";
                int wordValue = 0, index = 0;
                for (int i = 0; i < third.length(); i++){


                    int charValue = third.toUpperCase().charAt(i) - 64;
                    if (charValue == -20){
                        values += wordValue * (index+1) + " ";
                        wordValue = 0;
                        index++;
                        continue;
                    }
                    wordValue = charValue == -32 ? wordValue + 0 : wordValue + charValue;
                }
                values += wordValue * (index + 1);
                System.out.println(values);

            }

            else{
                break;
            }

            }

        }
    }


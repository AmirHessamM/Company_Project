package com.company;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hour1 = 0,min1=0,sec1=0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Employee user = null;

        while (true){

            String order = scanner.nextLine();

            if (order.equals("join")){

                System.out.println("Enter Your Name : ");
                String name = scanner.nextLine();
                System.out.println("Enter Your Password");
                long password = scanner1.nextLong();
                user = new Employee(name, password);
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                hour1 = date.getHours();
                min1 = date.getMinutes();
                sec1 = date.getSeconds();
                System.out.println("Hour1 : "+hour1);
                System.out.println("Min1 : "+min1);
                System.out.println("Sec1 : "+sec1);

            }

            else if (order.equals("morakhasi")){

                user.morakhasi();

            }

            else if (order.equals("reserve")){

                System.out.println("What You Want For Lunch? ");
                String lunch = scanner.nextLine();
                System.out.println("What You Want For Dinner? ");
                String dinner = scanner.nextLine();
                user.reserve(lunch, dinner);

            }

            else if (order.equals("exit")){
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                int hour2 = date.getHours();
                int min2 = date.getMinutes();
                int sec2 = date.getSeconds();
                System.out.println("Hour2 : "+hour2);
                System.out.println("Min2 : "+min2);
                System.out.println("Sec2 : "+sec2);
                int seconline = sec2 - sec1;
                int minonline = min2 - min1;
                int houronline = hour2 - hour1;
                if (seconline < 0){
                    sec2 = sec2 + 60;
                    seconline = sec2 - sec1;
                    min2--;
                }

                else if (minonline < 0) {
                    min2 = min2 + 60;
                    minonline = min2 - min1;
                    hour2--;
                }
                System.out.println("You Were Online For "+(houronline)+":"+(minonline)+":"+(seconline));

            }

            else {

                System.out.println("ERROR");

            }
        }
    }
}

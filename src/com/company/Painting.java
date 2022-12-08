package com.company;

public class Painting extends Service{

    Scan in = new Scan();

    //фарба ціна/літр
    final double COLOR_M = 84.5;
    final double COLOR_N = 53.7;

    Painting(){
    }


    //вартість фарбування окремих елементів
    @Override
    double cost(int i) {
        double costPaints = 0;
        System.out.println("Elements of transport that we can paint: 1.Back/Front bumper");
        System.out.println("                                         2.Trunk lid");
        System.out.println("                                         3.The roof");
        System.out.println("                                         4.Back/Front door");
        System.out.println("                                         5.Hood");
        System.out.println("                                         6.Threshold");
        System.out.println("                                         7.Back/Front wing");
        System.out.print("Your choose: ");
        int element = in.scanInt();
        System.out.println("List of colors: 1.'Mira'(German car paint)");
        System.out.println("                2.'Novol'(Polish car paint)");
        System.out.print("Your choose: ");
        int color = in.scanInt();
        if (element == 1 & color == 1) {
            costPaints = (0.25* i * COLOR_M) + 82;
        } else if (element == 1 & color == 2) {
            costPaints = (0.4* i * COLOR_N) + 82;
        } else if (element == 2 || element == 3 & color == 1) {
            costPaints = (0.45 * COLOR_M) + 82;
        } else if (element == 2 || element == 3 & color == 2) {
            costPaints = (0.45 * COLOR_N) + 82;
        } else if (element == 4 & color == 1) {
            costPaints = (0.3 * COLOR_M) + 82;
        } else if (element == 4 & color == 2) {
            costPaints = (0.3 * COLOR_N) + 82;
        } else if (element == 5 & color == 1) {
            costPaints = (0.5 * COLOR_M) + 82;
        } else if (element == 5 & color == 2) {
            costPaints = (0.5 * COLOR_N) + 82;
        } else if (element == 6 & color == 1) {
            costPaints = (0.15 * COLOR_M) + 82;
        } else if (element == 6 & color == 2) {
            costPaints = (0.15 * COLOR_N) + 82;
        } else if (element == 7 & color == 1) {
            costPaints = (0.3 * COLOR_M) + 82;
        } else if (element == 7 & color == 2) {
            costPaints = (0.3 * COLOR_N) + 82;
        } else {
            System.out.println("Error");
        }
        return costPaints;
    }


    //вартість повного фарбування автомобіля
    @Override
    double cost(String bodyStyle) {
        double cost = 0 ;
        System.out.println("List of colors: ");
        System.out.println("                1.'Mira'(German car paint)");
        System.out.println("                2.'Novol'(Polish car paint)");
        System.out.print("Your choose: ");
        int color = in.scanInt();
        if (bodyStyle == "Sedan" || bodyStyle == "Coupe" || bodyStyle == "Supercar" && color == 1) {
            cost = 2.7 * COLOR_M + 2265;
        }else if(bodyStyle == "Sedan" || bodyStyle == "Coupe" || bodyStyle == "Supercar" && color == 2) {
            cost = 2.7 * COLOR_N + 2265;
        }else if (bodyStyle == "Cabriolet" && color ==1) {
            cost = 2.2 * COLOR_M + 2065;
        }else if(bodyStyle == "Cabriolet" && color == 2) {
            cost = 2.2 * COLOR_N + 2065;
        }else if(bodyStyle == "Pickup" && color == 1){
            cost = 4.2 * COLOR_M + 1140.5;
        } else if (bodyStyle == "Pickup" && color == 2) {
            cost = 4.2 * COLOR_N + 1140.5;
        } else if (bodyStyle == "Minivan" && color == 1) {
            cost = 3.1 * COLOR_M + 875.75;
        }else if(bodyStyle == "Minivan" && color == 2) {
            cost = 3.1 * COLOR_N + 875.75;
        }else {
            System.out.println("Error");
        } return cost;
    }



}

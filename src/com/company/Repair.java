package com.company;

public class Repair extends Service{

    Scan in = new Scan();

    Repair(){
    }


    //вартість ремонту окремих елементів
    @Override
    double cost(int i) {
        double costRepair = 0;
        System.out.println("Elements of transport that we can replace:  1.Steering control");
        System.out.println("                                            2.Braking system");
        System.out.println("                                            3.Engine");
        System.out.println("                                            4.Transmission");
        System.out.print("Your choose: ");
        int element = in.scanInt();
        if(element == 1 ){
            costRepair = 78.25;
        }else if(element == 2) {
            costRepair = 23.75 ;
        } else if(element == 3) {
            costRepair = 785 ;
        }else if(element == 4){
            costRepair = 53;
        }else{
            System.out.println("Error");
        }
        return costRepair;
    }


    //ремонт електронної системи
    private int cost(){
        int cost = 0;
        System.out.println("We perform such works: 1.Repair of the electronic power steering system");
        System.out.println("                       2.Resetting temporary service intervals.");
        System.out.println("                       3.Inspection, replacement of relays, fuses.");
        System.out.println("                       4.Replacement of controllers that are responsible for the operation of the transmission, power plant.");
        System.out.println("                       5.Restoration of the electronic fuel injection system.");
        System.out.println("                       6.Detection, reset of on-board computer errors.");
        System.out.print("Your choose: ");
        int element = in.scanInt();
        if(element == 1){
            cost = 36;
        }else if(element == 2){
            cost = 32;
        }else if(element == 3){
            cost = 41;
        }else if(element == 4){
            cost = 30;
        }else if(element == 5){
            cost = 27;
        }else if(element == 6){
            cost = 76;
        }else{
            System.out.println("Error");
        }
        return cost;
    }

    public double getCostES(){
        return cost();
    }


    //комплексний ремонт автомобіля
    @Override
    double cost(String bodyStyle){
        double cost = 0;
        if(bodyStyle == "Sedan" || bodyStyle == "Coupe" || bodyStyle == "Supercar") {
            cost = 2275;
        }else if(bodyStyle =="Cabriolet" ) {
            cost = 2345;
        }else if(bodyStyle == "Pickup" ) {
            cost = 2645;
        }else if(bodyStyle == "Minivan") {
            cost = 2135;
        }else {
            System.out.println("Error");
        }
        return  cost;
    }


    static class Diagnosis extends Repair{

        //вартість діагностики авто
        private double cost(){
            double cost = 0;
            System.out.println("We conduct diagnostics:");
            System.out.println("                        1. Chassis diagnostics");
            System.out.println("                        2. Pre-purchase diagnostics of the car");
            System.out.println("                        3. Checking compression in cylinders");
            System.out.println("                        4. Computer diagnostics (error reading)");
            System.out.println("                        5. Diagnostics of car electrical systems");
            System.out.println("                        6. Diagnostics of the body with a paint thickness gauge");
            System.out.print("Your choose: ");
            int element = in.scanInt();
            if(element == 1){
                cost = 4.25;
            }else if(element == 2){
                cost = 17.25;
            }else if(element == 3) {
                cost = 11.75;
            }else if(element == 4) {
                cost = 6.45;
            }else if(element == 5) {
                cost = 6.65;
            }else if(element == 6) {
                cost = 6.25;
            }else{
                System.out.println("Error");
            }
            return cost;
        }

        public double getCostDiagnosis(){
            return cost();
        }
    }


}

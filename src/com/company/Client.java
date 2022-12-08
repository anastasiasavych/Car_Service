package com.company;

public class Client implements User, Worker.Rating{

    Scan in = new Scan();

    private String bodyStyle;
    private int year;
    private String fuelType;
    private double mileage;

    private String lastname;
    private String name;
    private String surname;
    private String gender;
    private String communication;


    //не використовується на даний момент
    Client(String fuelType, double mileage){
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    Client(String bodyStyle, int year, String fuelType) {
        this.bodyStyle = bodyStyle;
        this.year = year;
        this.fuelType = fuelType;
    }

    Client() {
    }

    public Client(String lastname, String name, String surname, String communication, String gender) {
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.communication = communication;
    }

    public void isGeneralInformation(){
        System.out.println("TRANSPORT:");
        System.out.println("Body type: "+bodyStyle+".");
        System.out.println("Year of production: " +year+".");
        System.out.println("Type of fuel: "+fuelType+".");
    }


    //оцінка сервісу
    @Override
    public void rating() {
        System.out.println();
        System.out.println("*************************************************************");
        System.out.print("Please,RATE the application: ");
        int rate = in.scanInt();
        String rate1;
        while (rate > 5 || rate < 1){
            System.out.print("Error.Repeat the input: ");
            rate = in.scanInt();
        }if(rate == 5 || rate == 4){
            System.out.println("Leave your comment if you want:");
            rate1 = in.scanString();
            System.out.println("Thank you very much for the high rating!!!");
        }else if (rate == 3 || rate == 2){
            System.out.println("Leave your comment if you want:");
            rate1 = in.scanString();
            System.out.println("Your opinion is important to us.");
        }else{
            System.out.println("Leave your comment if you want:");
            rate1 = in.scanString();
            System.out.println("We are sorry that you did not like our service.");
        }
    }



    static class TowTruck{

        private static String location;
        private static double distance;

        TowTruck(String location, double distance) {
            this.location = location;
            this.distance = distance;
        }

        static double cost(){
            double cost = 0;
            if(distance > 0){
                cost = distance*0.55;
            }else if(distance == 0){
                cost = 21.75;
            }else{
                System.out.println("Error");
            }
            return cost;
        }

        static void callTowTruck(String name, String lastname){
            System.out.println("Your lastname: " + lastname+".");
            System.out.println("Your name: "+name+".");
            System.out.println("The location where the row truck will arrive: "+location);
            System.out.println("Estimated call price: "+ cost() +"$");
        }



        public static String getLocation() {
            return location;
        }

        public static void setLocation(String location) {
            TowTruck.location = location;
        }

        public static double getDistance() {
            return distance;
        }

        public static void setDistance(double distance) {
            TowTruck.distance = distance;
        }
    }



    public void getGeneralInformation(){
        isGeneralInformation();
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    public String getCommunication() {return communication;}

    public void setCommunication(String communication) {this.communication = communication;}
}

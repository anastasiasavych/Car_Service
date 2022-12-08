package com.company;

public class Controller {

    Scan in = new Scan();

    Client client = new Client("Sedan",2010,"Diesel");


    Client.TowTruck call = new Client.TowTruck("Kyiv", 536);

    Discount card = new Discount(true,545);


    Worker admin = new Worker("Petrenko","Anton","Romanovych","Administrator","+380 63. ... .00");
    Worker diagnostician = new Worker("Horodechnyi","Marian","Ruslanovych","Diagnostician", "mgor....@gmail.com");
    Worker electrician = new Worker("Melnyk","Taras","Olegovych","Car electrician","+380 66. ... .33");
    Worker mechanic = new Worker("Panasiuk","Artem","Vasylovych","Mechanic","artem......@gmail.com");
    Worker painter = new Worker("Kobryn","Anastasia","Oleksandrivna","Car painter","avto_kobryn....@gmail.com");

    Repair repair = new Repair();
    Repair.Diagnosis diagnosis = new Repair.Diagnosis();
    Painting painting = new Painting();
    Discount name = new Discount("Kokotko","Yulia","Ostapivna","+380 93. ... .21","female");

    private int SnowCommandList() {
        System.out.println("\n");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|      MENU  CAR-SERVICE     |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println();
        System.out.println("1.Car service");
        System.out.println("2.Accessories store");
        System.out.println("3.Member's discount card");
        System.out.println("4.Call a tow truck.");
        System.out.println("5.Getting to know our team.");
        System.out.println("6.Exit from program.");
        System.out.println();
        System.out.print("Your choose: ");
        int choose1 = in.scanInt();
        if (choose1 == 1) {
            System.out.println("----------------------------------------------");
            client.getGeneralInformation();
            System.out.println("**********************************************");
            System.out.println("WELCOME TO CAR SERVICE:");
            System.out.println("                        1.Car repair");
            System.out.println("                        2.Car diagnostics");
            System.out.println("                        3.Car painting");
            System.out.print("Your choose: ");
            int choose2 = in.scanInt();
            if(choose2 == 1){
                System.out.println("And you want:   1.Complex car repair.");
                System.out.println("                2.Replacement of parts.");
                System.out.println("                3.Electrical system");
                System.out.print("Your choose: ");
                int choose3 = in.scanInt();
                if(choose3 == 1){
                    if(card.isBonusCard() == true) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("COMPLEX REPAIR:");
                        System.out.println("You have applied your discount card! New price: "+card.getDiscount(repair.cost(client.getBodyStyle())) +"$");
                        System.out.println("This service will be provided by the master: " + mechanic.getLastname() + " " + mechanic.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the specialist: " + mechanic.getCommunication());
                        System.out.println();
                        admin.getCommentCost();
                        client.rating();
                    }else{
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("COMPLEX REPAIR:");
                        System.out.println("Price: "+repair.cost(client.getBodyStyle()) +"$");
                        System.out.println("This service will be provided by the master: " + mechanic.getLastname() + " " + mechanic.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the specialist: " + mechanic.getCommunication());
                        System.out.println();
                        admin.getCommentCost();
                        client.rating();
                    }
                }else if(choose3 == 2){
                    if(card.isBonusCard() == true) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("REPLACEMENT OF THE PART:");
                        System.out.println("You have applied your discount card! New price: " + card.getDiscount(repair.cost(2)) + "$");
                        System.out.println("This service will be provided by the master: " + mechanic.getLastname() + " " + mechanic.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the specialist: " + mechanic.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }else{
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("REPLACEMENT OF THE PART:");
                        System.out.println("Price: " + repair.cost(2) + "$");
                        System.out.println("This service will be provided by the master: " + mechanic.getLastname() + " " + mechanic.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the specialist: " + mechanic.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }
                }else if(choose3 == 3){
                    if(card.isBonusCard()== true) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("REPAIR ELECTRICAL SYSTEM:");
                        System.out.println("You have applied your discount card! New price: " + card.getDiscount(repair.getCostES()) + "$");
                        System.out.println("This service will be provided by the master: " + electrician.getLastname() + " " + electrician.getName() + " / " + diagnostician.getLastname() + " " + diagnostician.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the experts: " + electrician.getCommunication() + "(" + electrician.getName() + ")," + diagnostician.getCommunication() + "(" + diagnostician.getName() + ").");
                        admin.getCommentCost();
                        client.rating();
                    }else{
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("REPAIR ELECTRICAL SYSTEM:");
                        System.out.println("Price: " + repair.getCostES() + "$");
                        System.out.println("This service will be provided by the master: " + electrician.getLastname() + " " + electrician.getName() + " / " + diagnostician.getLastname() + " " + diagnostician.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the experts: " + electrician.getCommunication() + "(" + electrician.getName() + ")," + diagnostician.getCommunication() + "(" + diagnostician.getName() + ").");
                        admin.getCommentCost();
                        client.rating();
                    }
                }
            }else if(choose2 == 2){
                System.out.println("-----------------------------------------------------------------");
                System.out.println("CAR DIAGNOSIS:");
                System.out.println("Price:" + diagnosis.getCostDiagnosis()+"$.");
                System.out.println("This service will be provided by the specialist: "  + diagnostician.getLastname() + " " + diagnostician.getName() + ".");
                System.out.println("To clarify the details, contact the working telephone number/email address of the specialist: " + diagnostician.getCommunication());
                admin.getCommentCost();
                client.rating();
            }else if(choose2 ==3){
                System.out.println("And you want:  1.Full car painting ");
                System.out.println("               2.Painting parts");
                System.out.print("Your choose: ");
                int choose3 = in.scanInt();
                if(choose3 == 1){
                    if (card.isBonusCard() == true) {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("PAINTING TRANSPORT:");
                        System.out.println("You have applied your discount card! New price: " + card.getDiscount(painting.cost(client.getBodyStyle())) + "$");
                        System.out.println("This service will be provided by the master: " + painter.getLastname() + " " + painter.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the master: " + painter.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }else{
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("PAINTING TRANSPORT:");
                        System.out.println("Price: " + painting.cost(client.getBodyStyle()) + "$");
                        System.out.println("This service will be provided by the master: " + painter.getLastname() + " " + painter.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the master: " + painter.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }
                }else if(choose3 == 2) {
                    if (card.isBonusCard() == true) {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("PAINTING CAR ELEMENTS:");
                        System.out.println("You have applied your discount card! New price: " + card.getDiscount(painting.cost(2)) + "$");
                        System.out.println("This service will be provided by the master: " + painter.getLastname() + " " + painter.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the master: " + painter.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }else{
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("PAINTING CAR ELEMENTS:");
                        System.out.println("Price: " + painting.cost(2) + "$");
                        System.out.println("This service will be provided by the master: " + painter.getLastname() + " " + painter.getName() + ".");
                        System.out.println("To clarify the details, contact the working telephone number/email address of the master: " + painter.getCommunication());
                        admin.getCommentCost();
                        client.rating();
                    }
                }else{
                    System.out.println("Error");
                }
            }else{
                System.out.println("Error");
            }
        }else if(choose1 == 2){
            System.out.println("********************************");
            System.out.println("ACCESSORIES STORE:");
            System.out.println("The opening will be soon...");

        } else if(choose1 == 3){
            System.out.println("**************************************");
            System.out.println("DISCOUNT CARD");
            System.out.println("Select option:  1.Create a card");
            System.out.println("                2.View the balance");
            System.out.println("                3.Calculator bonuses");
            System.out.print("Your choose: ");
            int choose2 = in.scanInt();
            if(choose2 ==1){
                System.out.println("---------------------------------------");
                System.out.println("CREATION OF A PERSONAL DISCOUNT CARD.");
                name.getCreateCard();
                client.rating();
            }else if(choose2 == 2){
                System.out.println("----------------------------------");
                System.out.println("BALANCE:");
                card.getBalance();
                admin.getCommentBonuses();
                client.rating();
            }else if(choose2 == 3){
                System.out.println("----------------------------");
                System.out.println("BONUS-CALCULATOR:");
                System.out.println(card.getBonus()+" bonuses ==> "+card.getCalculator()+"$");
                client.rating();
            }
        }else if(choose1 == 4){
            System.out.println("***************************************");
            System.out.println("CALL A TOW TRUCK:");
            call.callTowTruck("Ivan","Bodnarchuk");
            client.rating();
        }else if(choose1 == 5){
            System.out.println("***************");
            System.out.println("OUR TEAM");
            System.out.println("-----------------");
            admin.isGeneralInformation();
            System.out.println("-----------------");
            diagnostician.isGeneralInformation();
            System.out.println("-----------------");
            electrician.isGeneralInformation();
            System.out.println("-----------------");
            mechanic.isGeneralInformation();
            System.out.println("-----------------");
            painter.isGeneralInformation();
            client.rating();

        } else if(choose1 == 6){
            System.out.println("You have exited the program.");
        }
        return 6;
    }


    public int getSnowCommandList(){
        return SnowCommandList();
    }


}

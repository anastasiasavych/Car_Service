package com.company;

public class Worker implements User{

    private String lastname;
    private String name;
    private String surname;
    private String trade;
    private String communication;


    Worker(String lastname, String name, String surname, String trade, String communication) {
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.trade = trade;
        this.communication = communication;
    }

    public void isGeneralInformation() {
        System.out.println("WORKER:");
        System.out.println();
        System.out.println("Lastname: " + lastname);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Trade: " + trade);
        System.out.println("Contact: " + communication+";");
    }

    private void commentCost(){
        System.out.println("......................................................................................................................");
        System.out.println("| The cost of the service is indicative and indicated for reference.                                                 |");
        System.out.println("|                                                                  Sincerely, the administration of the car service. |");
        System.out.println("......................................................................................................................");
    }

    public void getCommentCost(){
        commentCost();
    }


    private void commentBonuses(){
        System.out.println("...............................");
        System.out.println("| REMARK. 100 bonuses = 2.75$ |");
        System.out.println("...............................");
    }

    public void getCommentBonuses(){
        commentBonuses();
    }



    //вкладений інтерфейс
    interface Rating{
        void rating();
    }




    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }
}


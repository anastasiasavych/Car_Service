package com.company;

public class Discount extends Client{

    Scan in = new Scan();

    private boolean bonusCard;
    private int bonus;
    static double discount = 0.0275;


    public Discount(boolean bonusCard, int bonus) {
        super();
        this.bonusCard = bonusCard;
        this.bonus = bonus;
    }

    public Discount(String lastname,String name,String surname,String communication, String gender){
        super(lastname,name,surname, communication, gender);
    }

    Discount(){
    }

    //створення дисконтної картки
    private void createCard(){
        System.out.println("Last name: " + getLastname());
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Gender : " + getGender());
        System.out.println("Your email / phone number , so that we can sign communication with you.");
        System.out.println(getCommunication());
        System.out.println("The card is created. We wish you a pleasant use.");
    }

    public void getCreateCard(){
        createCard();
    }


    //баланс дисконтної картки
    private  void balance(){
        System.out.println("Current balance on the card: " +bonus +" bonus(-es).");
    }

    public void getBalance(){
        balance();
    }

    //перевід к-сть бонусів в гроші
    private double calculator(){
        double c =  bonus*discount;
        return c;
    }

    public double getCalculator(){
        return calculator();
    }


    //знижка
    public double getDiscount(double i){
        return i -calculator();
    }



    public boolean isBonusCard() {
        return bonusCard;
    }

    public void setBonusCard(boolean bonusCard) {
        this.bonusCard = bonusCard;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

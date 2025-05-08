package com.pluralsight;

public class Main {
    private static Console console = new Console();
    private static Deck d = new Deck();



    private static Card c1;
    private static Card c2;





    private static Hand h1;
    private static Hand h2;




    private static String playerOne;
    private static String playerTwo;




    public static void main(String[] args) {

        howManyPlayers();

    }


    public static void howManyPlayers(){
        int prompt;
        do {
            System.out.println(ColorCodes.CYAN + "2 players only ( 0 to quit out)" + ColorCodes.RESET);
            prompt = console.promptForInt("How many players are participating? ");

            switch(prompt){
                case 1: System.out.println("Not Enough Players");
                break;
                case 2: startOfGame();
                break;
                case 0: System.out.println("Quitting application");
                break;
                default: System.out.println("This is only playable with two players");
            }

        } while (prompt != 0);


    }



    public static void startOfGame(){

        playerOne = console.promptForString("Player 1 enter your name: ");
        playerTwo = console.promptForString("Player 2 enter your name: ");


        d.shuffle();

        playerOne();


        playerTwo();

        hitOrStayPlayerOne();


    }




    public static void playerOne(){
        h1 = new Hand();
        c1 = d.deal();
        c1.flip();
        display(c1);
        //System.out.println(c1.getPointValue());
        Card c2 = d.deal();
        c2.flip();
        display(c2);
        //System.out.println(c2.getPointValue());
        h1.deal(c1);
        h1.deal(c2);
        if(h1.getValue() == 21) {
            System.out.println(ColorCodes.BLUE + h1.getValue() + ColorCodes.RESET + "\n");
        } else{
            System.out.println(h1.getValue() + "\n");
        }


    }



    public static void playerTwo(){
        h2 = new Hand();
        c2 = d.deal();
        c2.flip();
        display(c2);
        //System.out.println(c2.getPointValue());
        Card c3 = d.deal();
        c3.flip();
        display(c3);
        //System.out.println(c3.getPointValue());
        h2.deal(c2);
        h2.deal(c3);
        if(h2.getValue() == 21) {
            System.out.println(ColorCodes.BLUE + h2.getValue() + ColorCodes.RESET);
        } else{
            System.out.println(h2.getValue());
        }

    }



   public static void hitOrStayPlayerOne() {
       String choice;
       if (h1.getValue() == 21) {
           System.out.println("\n" +ColorCodes.BLUE + playerOne + " has got to 21!" + ColorCodes.RESET);
           hitOrStayPlayerTwo();
       } else {

           System.out.println("\n"+ playerOne + " You have a value of " + h1.getValue());
           do {
               choice = console.promptForString(playerOne + " Would you like to hit or stay? ");
               switch (choice.toUpperCase()) {
                   case "HIT":
                       c1 = d.deal();
                       c1.flip();
                       display(c1);
                       h1.deal(c1);
                       System.out.println(playerOne + " You have a value of " + h1.getValue());
                       if (h1.getValue() > 21) {
                           System.out.println("\n" + ColorCodes.PURPLE + playerOne + " got over 21" + ColorCodes.RESET);
                           hitOrStayPlayerTwo();
                           return;
                       } else if (h1.getValue() == 21) {
                           System.out.println("\n" +ColorCodes.BLUE + playerOne + " has got to 21!" + ColorCodes.RESET);
                           hitOrStayPlayerTwo();
                           return;
                       }
                       break;
                   case "STAY":
                       hitOrStayPlayerTwo();
                       break;

               }

           } while (!choice.equalsIgnoreCase("STAY") && h1.getValue() <= 21);
       }
   }



    public static void hitOrStayPlayerTwo() {
        String choice;

        if (h2.getValue() == 21) {
            System.out.println("\n" +ColorCodes.BLUE + playerTwo + " has got to 21!" + ColorCodes.RESET);
            scoringSystem();
        } else {
            System.out.println("\n"+ playerTwo + " You have a value of " + h2.getValue());
            do {
                choice = console.promptForString(playerTwo + " Would you like to hit or stay? ");
                switch (choice.toUpperCase()) {
                    case "HIT":
                        c2 = d.deal();
                        c2.flip();
                        display(c2);
                        h2.deal(c2);
                        System.out.println(playerTwo + " You have a value of " + h2.getValue());
                        if (h2.getValue() > 21) {
                            System.out.println("\n" + ColorCodes.PURPLE + playerTwo + " got over 21" + ColorCodes.RESET);
                            scoringSystem();
                            return;
                        } else if (h2.getValue() == 21) {
                            System.out.println("\n" +ColorCodes.BLUE + playerTwo + " has got to 21!" + ColorCodes.RESET);
                            scoringSystem();
                            return;
                        }
                        break;
                    case "STAY":
                        scoringSystem();
                        break;
                }

            } while (!choice.equalsIgnoreCase("STAY") && h2.getValue() <= 21);
        }
    }




    public static void scoringSystem(){
        if (h1.getValue() > 21 && h2.getValue() > 21) {
            System.out.println("Both players have over 21 therefore no one wins");
        } else if(h1.getValue() > h2.getValue() && h1.getValue() <= 21){
            System.out.println(playerOne + " " + h1.getValue());
            System.out.println(playerTwo + " " + h2.getValue());
            System.out.println(playerOne + " wins the game");
        } else if(h2.getValue() > h1.getValue() && h2.getValue() <= 21){
            System.out.println(playerOne + " " + h1.getValue());
            System.out.println(playerTwo + " " + h2.getValue());
            System.out.println(playerTwo +" wins the game");
        } else if(h1.getValue() > h2.getValue() && h1.getValue() > 21){
            System.out.println(playerOne + " " + h1.getValue());
            System.out.println(playerTwo + " " + h2.getValue());
            System.out.println(playerOne + " has over 21 therefore " + playerTwo + " wins");
        } else if (h2.getValue() > h1.getValue() && h2.getValue() > 21) {
            System.out.println(playerOne + " " + h1.getValue());
            System.out.println(playerTwo + " " + h2.getValue());
            System.out.println(playerTwo + " has over 21 therefore " + playerOne +" wins");
        } else{
            System.out.println(playerOne + " " + h1.getValue());
            System.out.println(playerTwo + " " + h2.getValue());
            System.out.println("Draw");
        }

    }



    public static void display(Card c){
        if(c.getSuit().equalsIgnoreCase("Hearts") || c.getSuit().equalsIgnoreCase("Diamonds")){
            System.out.println(ColorCodes.RED + c.getValue() + " " + c.getSuit() + ColorCodes.RESET);
        } else{
            System.out.println(c.getValue() + " " + c.getSuit());
        }


    }


}
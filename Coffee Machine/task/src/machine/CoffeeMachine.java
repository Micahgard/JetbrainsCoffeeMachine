package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int dispCup = 9;
        int money = 550;
        boolean active = true;
        while (active) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.nextLine();
            //machine machine = new machine(action);
            //machine.makeStatusAction();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry not enough water");
                            } else if (coffee < 16) {
                                System.out.println("Sorry not enough coffee");
                            } else if (dispCup < 1) {
                                System.out.println("Sorry not enough disposable cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffee -= 16;
                                dispCup--;
                                money += 4;
                            }
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry not enough water");
                            } else if (milk < 75) {
                                System.out.println("Sorry not enough milk");
                            } else if (coffee < 20) {
                                System.out.println("Sorry not enough coffee");
                            } else if (dispCup < 1) {
                                System.out.println("Sorry not enough disposable cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                dispCup--;
                                money += 7;
                            }
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry not enough water");
                            } else if (milk < 100) {
                                System.out.println("Sorry not enough milk");
                            } else if (coffee < 12) {
                                System.out.println("Sorry not enough coffee");
                            } else if (dispCup < 1) {
                                System.out.println("Sorry not enough disposable cups");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                dispCup--;
                                money += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = scanner.nextInt();
                    water += addWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = scanner.nextInt();
                    milk += addMilk;
                    System.out.println("Write how many g of coffee do you want to add:");
                    int addCoffee = scanner.nextInt();
                    coffee += addCoffee;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addDispCup = scanner.nextInt();
                    dispCup += addDispCup;
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = money - money;
                    break;
                case "remaining":
                    status(water, milk, coffee, dispCup, money);
                    break;
                case "exit":
                    active = false;
                    break;
            }
        }

    }

    private static void status(int water, int milk, int coffee, int dispCup, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(dispCup + " of disposable cups");
        System.out.println(money + " of money");
    }

}

//enum State {
//    CHOOSING_AN_ACTION(1),
//    CHOOSING_COFFEE(2);
//
//    private final int status;
//
//    State(int status) {
//        this.status = status;
//    }
//
//    public State changeStatus() {
//        switch (this) {
//            case CHOOSING_AN_ACTION:
//                return CHOOSING_COFFEE;
//            case CHOOSING_COFFEE:
//                return CHOOSING_AN_ACTION;
//            default:
//                throw new IllegalStateException();
//        }
//    }
//
//}
//
//class machine {
//
//    String action;
//    private State state;
//
//    public machine(String action) {
//        this.action = action;
//    }
//
//    //changes status from choice to ready for next action
//    public void makeStatusAction() {
//        state = state.changeStatus();
//    }
//
//    //changes status of machine to ready for coffee choice
//    public void makeStatusChoice() {
//        state = state.changeStatus();
//    }
//
//    public State getState() {
//        return state;
//    }
//
//}
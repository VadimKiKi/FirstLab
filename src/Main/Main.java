package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Container A = new Container();
        System.out.println("1 - pushBack");
        System.out.println("2 - pushFront");
        System.out.println("3 - pushEl");
        System.out.println("4 - delBack");
        System.out.println("5 - delFront");
        System.out.println("6 - delEl");
        System.out.println("7 - ToString");
        System.out.println("8 - findEl");
        System.out.println("0 - exit");
        int value, position;
        String num;
        do {
            System.out.print("Choose command: ");
            num = in.next();
            switch (num) {
                case ("1"):
                    System.out.print("Enter a value: ");
                    while (!in.hasNextInt()) {
                        System.out.println("That not a number!");
                        System.out.print("Enter a new value: ");
                        in.next();
                    }
                    value = in.nextInt();
                    A.pushBack(value);
                    System.out.println("Done!");
                    break;
                case ("2"):
                    System.out.print("Enter a value: ");
                    while (!in.hasNextInt()) {
                        System.out.println("That not a number!");
                        System.out.print("Enter a new value: ");
                        in.next();
                    }
                    value = in.nextInt();
                    A.pushFront(value);
                    System.out.println("Done!");
                    break;
                case ("3"):
                    try {
                        System.out.print("Enter a value: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            System.out.print("Enter a new value: ");
                            in.next();
                        }
                        value = in.nextInt();
                        System.out.print("Enter a position: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            System.out.print("Enter a new position: ");
                            in.next();
                        }
                        position = in.nextInt();
                        A.pushEl(position, value);
                        System.out.println("Done!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("4"):
                    try {
                        A.delBack();
                        System.out.println("Done!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("5"):
                    try {
                        A.delFront();
                        System.out.println("Done!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("6"):
                    try {
                        System.out.print("Enter a value: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            System.out.print("Enter a new value: ");
                            in.next();
                        }
                        value = in.nextInt();
                        A.delEl(value);
                        System.out.println("Done!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("7"):
                    try {
                        System.out.println("Your list: " + A.toString());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally {
                        break;
                    }
                case ("8"):
                    try {
                        System.out.print("Enter a position: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            System.out.print("Enter a new position: ");
                            in.next();
                        }
                        position = in.nextInt();
                        System.out.println(A.findEl(position));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally {
                        break;
                    }
            }
        } while (!num.equals("0"));
    }
}
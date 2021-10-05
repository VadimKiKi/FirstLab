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
            num = in.next();
            switch (num) {
                case ("1"):
                    System.out.println("Enter a value: ");
                    while (!in.hasNextInt()) {
                        System.out.println("That not a number!");
                        in.next(); // this is important!
                    }
                    value = in.nextInt();
                    A.pushBack(value);
                    break;
                case ("2"):
                    System.out.println("Enter a value: ");
                    while (!in.hasNextInt()) {
                        System.out.println("That not a number!");
                        in.next(); // this is important!
                    }
                    value = in.nextInt();
                    A.pushFront(value);
                    break;
                case ("3"):
                    try {
                        System.out.println("Enter a value: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            in.next(); // this is important!
                        }
                        value = in.nextInt();
                        System.out.println("Enter a position: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            in.next(); // this is important!
                        }
                        position = in.nextInt();
                        A.pushEl(position, value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("4"):
                    try {
                        A.delBack();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("5"):
                    try {
                        A.delFront();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("6"):
                    try {
                        System.out.println("Enter a value: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            in.next(); // this is important!
                        }
                        value = in.nextInt();
                        A.delEl(value);;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        break;
                    }
                case ("7"):
                    try {
                        System.out.println(A.ToString());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally {
                        break;
                    }
                case ("8"):
                    try {
                        System.out.println("Enter a position: ");
                        while (!in.hasNextInt()) {
                            System.out.println("That not a number!");
                            in.next(); // this is important!
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
        } while (num != "");
    }
}
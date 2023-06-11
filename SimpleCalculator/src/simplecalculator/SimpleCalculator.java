/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author tanmo_wl7dzx4
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------Simple Calculator----------");
        Double num1;
        Double num2;
        Double res;
        char op;
        System.out.println("Enter choice of operation '+', '-', '*', '/'");
        Scanner inp = new Scanner(System.in);
        op = inp.next().charAt(0);

        System.out.println("Enter first number :");
        num1 = inp.nextDouble();
        System.out.println("Enter second number :");
        num2 = inp.nextDouble();

        switch (op) {
            case '+':
                res = num1 + num2;
                System.out.println(+num1 + "+" + num2 + "=" + res);
                break;

            case '-':
                res = num1 - num2;
                System.out.println(+num1 + "-" + num2 + "=" + res);
                break;

            case '*':
                res = num1 * num2;
                System.out.println(+num1 + "*" + num2 + "=" + res);
                break;
            case '/':
                res = num1 / num2;
                System.out.println(+num1 + "/" + num2 + "=" + res);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator;

import java.util.*;

/**
 *
 * @author tanmo_wl7dzx4
 */
public class PasswordGenerator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length = 8;
        System.out.println(password(length));
    }

    static char[] password(int len) {
        System.out.print("Your new password is : ");

        String caps= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smalls = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String syms = "!@#$%";

        String values = caps + smalls + nums + syms;
        
        Random rn = new Random();

        char password[] = new char[len];       
        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rn.nextInt(values.length()));
        }
        return password;

    }
}

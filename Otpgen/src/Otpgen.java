/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BHARATH
 */
import java.util.*;
public class Otpgen {

        public static void main(String[] args) {
        
            System.out.println(generateotp(5));
            
    }
        private static char[] generateotp(int length)
        {
            String numbers="1234567890";
            Random r=new Random();
            char otp[]=new char[length];
            
            for(int i=0;i<length;i++)
            {
                otp[i]=numbers.charAt(r.nextInt(numbers.length()));
            
                                      }
            return otp;
        }
        
    
}

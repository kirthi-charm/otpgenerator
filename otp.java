package com.example.OTP;

    import java.util.Random;

    public class otp {
        public static void main(String[] args) {

            System.out.println(OTPgenerator(5));
        }

        private static char[] OTPgenerator(int length) {
            String n = "1234567890";
            Random rand = new Random();
            char[] otp = new char[length];

            for(int i = 0; i< length ; i++) {
                otp[i] = n.charAt(rand.nextInt(n.length()));
            }
            return otp;
        }
    }


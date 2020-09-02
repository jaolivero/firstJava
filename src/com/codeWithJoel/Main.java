package com.codeWithJoel;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber( prompt: "Principal: ", min:1000 , max:1_000_000);
        float annualInterest = (float) Console.readNumber( prompt:"Annual Interest Rate: ", min: 1, max:30);
        byte years = (byte) Console.readNumber( prompt:"Period (Years): ");

        MortgageReport.printMortgage(principal,annualInterest,years);
        MortgageReport.printPaymentSchedule(principal,annualInterest,years);

    }

}

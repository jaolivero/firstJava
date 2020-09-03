package com.codeWithJoel;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000 , 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ",  1, 30);
        byte years = (byte) Console.readNumber( "Period (Years): ");

        var calculator = new MortgageCalculator(principal,annualInterest,years);
        var report = new MortgageReport(calculator);
        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printPaymentSchedule();

    }

}

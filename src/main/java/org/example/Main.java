package org.example;

import salary.SalaryBid;
import salary.PieceworkBid;
import salary.Salary;
import salary.HourlyBid;
import salary.employer.Employer;

public class Main {
    public static void main(String[] args) {
        SalaryBid salaryBidUser1 = new SalaryBid(new Employer("Пётр","Петров"), 5, 100);
        PieceworkBid pieceworkBid = new PieceworkBid(new Employer(),new float[]{1200,2000,3000});
        HourlyBid hourlyBid = new HourlyBid(new Employer("Олег","Олегов"),22,2500);

        Salary[] salaries = new Salary[]{salaryBidUser1, hourlyBid, pieceworkBid};

        for (Salary salary: salaries){
            System.out.println(salary.toString());
        }
    }
}
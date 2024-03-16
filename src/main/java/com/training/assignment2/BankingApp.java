package com.training.assignment2;

import java.time.LocalDate;
import java.util.ArrayList;

import com.training.assignment2.exception.InsufficientBalanceException;
import com.training.assignment2.model.*;

/**
 * Hello world!
 *
 */
public class BankingApp 
{
    public static void main( String[] args )
    {
    	// create FD Account
        System.out.println("Creating FD Account");
    	FDAccount fDAccount = new FDAccount(2, 10000, LocalDate.now().plusMonths(12), 0.05,new ArrayList<Transaction>());
        System.out.println(fDAccount.getTenure());
        System.out.println(fDAccount.getMaturityAmount());
        System.out.println(fDAccount.getAccountDetails());

        // create account SBAccount print result
        SBAccount sBAccount = new SBAccount(1, 10000, 500, new ArrayList<Transaction>());
        try {
        	System.out.println("Withdrawing amount");
            sBAccount.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sBAccount.getAccountDetails());


        
    }
}
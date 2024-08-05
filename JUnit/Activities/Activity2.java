package com.example.fst_m1_junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class Activity2 {

    // BankAccount class
    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void withdraw(double amount) throws NotEnoughFundsException {
            if (amount > balance) {
                throw new NotEnoughFundsException("Insufficient funds. Balance: " + balance + ", Requested: " + amount);
            }
            balance -= amount;
        }
    }

    // NotEnoughFundsException class
    static class NotEnoughFundsException extends Exception {
        public NotEnoughFundsException(String message) {
            super(message);
        }
    }

    // Test method for not enough funds
    @Test
    public void notEnoughFunds() {
        // Create a BankAccount object with a balance of 10
        BankAccount account = new BankAccount(10);

        // Assert that withdrawing 20 throws NotEnoughFundsException
        Assertions.assertThrows(NotEnoughFundsException.class, () -> {
            account.withdraw(20);
        });
    }

    // Test method for enough funds
    @Test
    public void enoughFunds() {
        // Create a BankAccount object with a balance of 100
        BankAccount account = new BankAccount(100);

        // Assert that withdrawing 50 does not throw an exception
        Assertions.assertDoesNotThrow(() -> {
            account.withdraw(50);
        });
    }
}

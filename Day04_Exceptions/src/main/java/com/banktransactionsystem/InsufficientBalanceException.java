package com.banktransactionsystem;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }

}

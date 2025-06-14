package com.ATM;

import java.util.Scanner;

public class Entity {
	int balance=10000;
	
	void withdraw(int withdraw) {
		if(this.balance>=withdraw) {
			this.balance=-withdraw;
			System.out.println(withdraw+" = inr withdrawan from your account.");
			System.out.println(this.balance+" = is your current balance.");
			
		}else {
			System.out.println("You have insufficient balance.");
		}
	}
	void deposite(int deposite) {
		this.balance=+deposite;
		System.out.println(deposite+" = inr deposited in your account.");
		System.out.println(this.balance+" = is your current balance.");
	}
	void Cbalance() {
		System.out.println(this.balance+" = is your remining balance");
	}
}

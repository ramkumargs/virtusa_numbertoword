package com.virtusa;

import java.util.Scanner;

import com.virtusa.impl.NumberWordConverter;

public class NumberToWordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		String word = new NumberWordConverter().getWordFromNumber(myNum);
		System.out.println(word);
	}

}

package com.virtusa.impl;

import com.virtusa.Constants;
import com.virtusa.INumberWorderConverter;
import com.virtusa.exception.NumberValidationException;

public class NumberWordConverter implements INumberWorderConverter, Constants {
	
	public String getWordFromNumber(int number) {
		if (number <= 0) {
			throw new NumberValidationException(NUMBER_SHOULD_BE_GREATER_THAN_ZERO);
		}
		if (number > 999999999) {
			throw new NumberValidationException(NUMBER_SHOULD_NOT_BE_GREATER_THAN_999_999_999);
		}
		return new NumberWordConverter().converter(number);
	}

	private String converter(int num) {

		if (num < 20) {
			return one[num];
		}

		if (num < 100) {
			return ten[num / 10] + ((num % 10 != 0) ? STRING2 : STRING) + one[num % 10];
		}

		if (num < 1000) {
			return one[num / 100] + HUNDRED + ((num % 100 != 0) ? AND : STRING) + converter(num % 100);
		}

		if (num < 100000) {
			return converter(num / 1000) + THOUSAND + ((num % 10000 != 0) ? STRING2 : STRING) + converter(num % 1000);
		}

		if (num < 10000000) {
			return converter(num / 100000) + HUNDRED + ((num % 100000 != 0) ? AND : STRING) + converter(num % 100000);
		}

		return converter(num / 1000000) + MILLION + ((num % 1000000 != 0) ? STRING2 : STRING) + converter(num % 1000000);
	}

}

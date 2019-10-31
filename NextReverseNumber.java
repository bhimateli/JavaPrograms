public class NextReverseNumber {

	static int revNumber = 0;

	public static int reverseNumber(int number) {
		int rev = 0;

		while (number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number = number / 10;

		}
		System.out.println("The reverse number is " + rev);
		return rev;
	}

	public static int findNumber(String str, int number) {
		boolean flag = false;
		revNumber = reverseNumber(number);
		while (flag == false) {

			if (number == revNumber) {

				flag = true;
			} else {
				if (str.equalsIgnoreCase("POSITIVE"))
					number = number + 1;
				else
					number = number - 1;

				revNumber = reverseNumber(number);
				flag = false;
			}
		}
		return revNumber;
	}

	public static void main(String args[]) {

		int number = 1234;

		int revNumberPostive = findNumber("POSITIVE", number);
		int revNumberNegative = findNumber("NEGATIVE", number);
		System.out.println("The Positive palindrome is  " + revNumberPostive);
		System.out.println("The Negative palindrome is  " + revNumberNegative);

		int sum = number - revNumberNegative;
		int sum1 = revNumberPostive - number;
		if (sum > sum1) {
			System.out.println("The required palindrome number is " + revNumberPostive);
		} else {
			System.out.println("The required palindrome number is " + revNumberNegative);
		}
	}

}


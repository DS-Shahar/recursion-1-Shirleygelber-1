package recursion;

public class Main {
	public static void main (String [] args) {
		int a = f (7);
		System.out.println(("a= " + a));
		
		int b = sumFrom1ToN(7);
		System.out.println ("b= " + b);
		
		
		int g = productOfOddNumbers(7);
		System.out.println ("g= " + g);
		
		int digitsInNumber = numberOfDigitsInNumber (723);
		System.out.println ("digitsInNumber " + digitsInNumber);
		
		
		int divisionInt = divisionInt(25, 4);
		System.out.println ("division- Int " + divisionInt);
		
		double divisionDouble = divisionDouble(25, 4);
		System.out.println ("division- Double " + divisionDouble);
		
		boolean Ismultiplier = multiplier (25, 5);
		System.out.println ("Is x multiple of y? " + Ismultiplier);
		
		boolean IsAllZoogiOrEiZoogi = zoogiOrEiZoogi (2224);
		System.out.println ("IsAllZoogiOrEiZoogi " + IsAllZoogiOrEiZoogi);
	}
	

	public static int f(int n) {
		if (n==0) {
			return 1;
		}
		return n * f(n-1);
	}
	
	public static int sumFrom1ToN (int n) {
		if (n==0) {
			return 0;
		}
		return n + sumFrom1ToN(n-1);
	}
	
	public static int productOfOddNumbers (int n) {
		if (n == 1) {
			return 1;
		}
		if (n % 2 !=0) {
			return n * productOfOddNumbers(n-2);
		}
		else {
			return 1 * productOfOddNumbers(n-1);
		}
	}
	
	public static int numberOfDigitsInNumber( int n) {
	    if (n == 0) {
            return 0;
        }
		return 1 + numberOfDigitsInNumber(n/10);
	}
	
	public static int divisionInt(int mone, int mechane) {
		if (mechane <= 0) {
			return 0;
		}
		
		if (mone < mechane) {
			return 0;
		}
		
		return  1 + divisionInt(mone - mechane, mechane);
	}
	
    public static double divisionDouble(int mone, int mechane) {
    	if (mechane <= 0) {
            return 0;
        }
        if (mone < mechane) {
            return mone;
        }
        return divisionDouble(mone - mechane, mechane);
    }
	
	public static boolean multiplier (int x, int y) {
		if (y == 0) {
            return false; // אין מספר שהוא כפולה של 0
        }
		if (x == y) {
            return true;
        }
		if (x < y) {
            return false;
        }
		return multiplier(x - y, y);
	}
	
	
	//public static boolean isPrime(int number) {
	//}
	
	
	public static boolean zoogiOrEiZoogi(int number) {
	 if (number < 10) {
	        return true;
	    }
	    int lastDigit = number % 10;
	    int secondLastDigit = (number / 10) % 10;
	    if ((lastDigit % 2) != (secondLastDigit % 2)) {
	        return false;
	    }
	    return zoogiOrEiZoogi (number / 10);
	}

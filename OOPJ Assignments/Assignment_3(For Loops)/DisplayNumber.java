
public class DisplayNumber {

//	Using for loops write a Java Program to display all odd numbers from 1 to 1000
	public void oddNumber() {
		System.out.println("Display every odd numbers from 1 to 1000: ");
		
		for(int iTmp = 1; iTmp <= 1000; iTmp++) {
			if(iTmp % 2 != 0)
				System.out.print(iTmp + " ");
		}
	}
	
//	Using for loops write a Java Program to display all even numbers from 1 to 1000
	public void evenNumber() {
		System.out.println("Display every even numbers from 1 to 500: ");
		
		for(int iTmp = 1; iTmp <= 500; iTmp++) {
			if(iTmp % 2 == 0)
				System.out.print(iTmp + " ");
		}
	}
	
//	using for loops write a Java Program to display every 7th number from 1 to 200
	public void seventhNumber() {
		System.out.println("Display every 7th numbers from 1 to 200: ");
		
		for(int iTmp = 1; iTmp <= 200; iTmp++) {
			if(iTmp % 7 == 0)
				System.out.print(iTmp + " ");
		}
	}
	
//	 Using For loops write a program to display the following pattern 1
	public void patternOne() {
		System.out.println("Display Pattern1 ");
		for(int iTmp = 0; iTmp < 5; iTmp++) {
			for(int jTmp = 0; jTmp < iTmp + 1; jTmp++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	 Using For loops write a program to display the following pattern 2
	public void patternTwo() {
		System.out.println("Display Pattern2 ");
		for(int iTmp = 0; iTmp < 5; iTmp++) {
			for(int jTmp = 0; jTmp < (5 - iTmp); jTmp++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// Using for loops write a program to display the following pattern 3
	public void patternThree() {
		System.out.println("Display Pattern3 ");
		int num = 1;
		for(int iTmp = 0; iTmp < 5; iTmp++) {
			for(int jTmp = 0; jTmp < iTmp; jTmp++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
	
//	 Using for loops write a program to display the following pattern 4
	public void patternFour() {
		System.out.println("Display Pattern4 ");
		for(int iTmp = 1; iTmp <= 6; iTmp++) {
			for(int jTmp = 1; jTmp <= iTmp; jTmp++) {
				System.out.print((jTmp) + " ");
			}
			System.out.println();
		}
	}

	
//	 Using for loops write a program to display the following pattern 5
	public void patternFive() {
		System.out.println("Display Pattern5 ");
		for(int iTmp = 1; iTmp <= 6; iTmp++) {
			for(int jTmp = 1; jTmp <= (6 - iTmp) + 1; jTmp++) {
				System.out.print((jTmp) + " ");
			}
			System.out.println();
		}
	}
	
}



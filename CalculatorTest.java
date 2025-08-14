public class CalculatorTest {
	public static void main(String[] args) {
		Calculator add = (a, b)-> a+b;
		Calculator subtract = (a, b)-> a-b; 
        Calculator divide = (a, b)-> a/b;
		
		System.out.println("Addition is: "+add.calculate(10, 5));
		System.out.println("Subtraction is: "+subtract.calculate(10, 5));
        System.out.println("Division is: "+divide.calculate(10, 0));
        System.out.println("Multiplicatio is: "+multiply.calculate(214748, 214748634));
	}
 
 
}
 
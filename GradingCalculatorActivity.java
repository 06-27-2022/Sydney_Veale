public class GradingCalculatorActivity{
	public static void main(String[] args) {
		int [] arr = {95,85,62,40,79};
		 
		int Math = 95;
		int English = 85;
		int Science = 62; 
		int History = 40;
		int Art = 79;
		
//		{System.out.println("Math: ");}
//		score[1] = 85;
//		{System.out.println("English: ");}
//		score[2] = 62;
//		{System.out.println("Science: ");}
//		score[3] = 40;
//		{System.out.println("History: ");}
//		score[4] = 79;
//		{System.out.println("Art: ");}
		
		//for (int i = 0; i < arr.length; i++) {
	
		
		if(Math >= 90)
		{System.out.println("Math: A");}
		if (English >= 80)
		{System.out.println("English: B");}
		else if (Science >= 70)
		{System.out.println("Science: C");}
		 if (History >= 60)
		{System.out.println("History: D");}
		 if (Art <= 59)
		{System.out.println("Art: F");}
	}
}


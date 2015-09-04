import java.util.Scanner;
public class validationFromInput
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("Please input your possible credit card number. (no spaces) ");
				long cardNum = userInput.nextLong();
				long cardArray[] = new long[16];
				for(int i = 0; i < 16; i++)
					{
						if((i % 2) == 1)
							{
								if(((cardNum % 10) * 2) > 9)
									{
										long temp = (cardNum % 10) * 2;
										long second = temp % 10;
										long first = temp / 10;
										cardArray[15 - i] = first + second;
									}
								else
									{
										cardArray[15 - i] = (cardNum % 10) * 2;
									}
							}
						else
							{
								cardArray[15 - i] = (cardNum % 10);
							}
						cardNum /= 10;
					}
				long sum = 0;
				for(long steve: cardArray)
					{
						sum += steve;
					}
				if(sum % 10 == 0)
					System.out.println("You have a valid card number. ");
				else
					System.out.println("That card number is invalid. ");
			}
	}
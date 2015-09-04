
public class Creation
	{
		public static void main(String[] args)
			{
				long validNum[] = new long[100];
				int z = 0;
				while(true)
					{
						long cardNum = 0;
						for(int i = 0; i < 16; i++)
							{
								long x;
								if(i == 0)
									x = (long)((Math.random() * 9) + 1);
								else
									x = (long)(Math.random() * 10);
								cardNum += x;
								if(i < 15)
									cardNum *= 10;
							}
						long memNum = cardNum;
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
							{
							validNum[z] = memNum;
							z++;
							}
						if(z == 100)
							{
							for(long joe: validNum)
								System.out.println(joe);
							break;
							}
					}
			}
	}




public class Assignment2 {
	public static void main(String[]str)
	{
		int counter = 0;

        for (int i = 1; i <= 100; i++)
        {
            counter = 0;

            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    counter++;
                }

                if (counter > 2)
                {
                    break;
                }
            }

            if (counter == 2)
            {
                System.out.println(i);
            }
            
        }		
	}

}

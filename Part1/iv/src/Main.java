public class Main {
    public static void main(String[] args)
    {
        int triangleHeight = Integer.parseInt(args[0]);

	    for (int rowNum = 0; rowNum < triangleHeight; rowNum++)
        {
            for (int colNum = 0; colNum <= rowNum; colNum++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
	    int triangleSize = Integer.parseInt(args[0]);

	    for (int rowNum = 0; rowNum < triangleSize; rowNum++)
        {
            for (int spaceNum = 0; spaceNum < (triangleSize - rowNum - 1); spaceNum++)
            {
                System.out.print(" ");
            }

            for (int asteriskNum = 0; asteriskNum < ((rowNum * 2) + 1); asteriskNum++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

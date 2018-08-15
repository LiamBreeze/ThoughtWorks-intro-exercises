public class Main
{
    public static void main(String[] args)
    {
        int diamondSize = Integer.parseInt(args[0]);

        int numSpaces = diamondSize - 1;
        int numAsterisk = 1;

        // Print diamond top half.
        for (int rowNum = 0; rowNum < diamondSize; rowNum++)
        {
            for (int spaceNum = 0; spaceNum < numSpaces; spaceNum++)
            {
                System.out.print(" ");
            }

            for (int asteriskNum = 0; asteriskNum < numAsterisk; asteriskNum++)
            {
                System.out.print("*");
            }

            System.out.println();
            numSpaces--;
            numAsterisk += 2;
        }

        numSpaces += 2;
        numAsterisk -= 4;

        // Print diamond bottom half.
        for (int bottomRowNum = 0; bottomRowNum < (diamondSize - 1); bottomRowNum++)
        {
            for (int spaceNum = 0; spaceNum < numSpaces; spaceNum++)
            {
                System.out.print(" ");
            }

            for (int asteriskNum = 0; asteriskNum < numAsterisk; asteriskNum++)
            {
                System.out.print("*");
            }

            System.out.println();
            numSpaces++;
            numAsterisk -= 2;
        }
    }
}

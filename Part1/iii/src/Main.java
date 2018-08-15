public class Main {
    public static void main(String[] args)
    {
	    int lineLength = Integer.parseInt(args[0]);

	    for (int asteriskCount = 0; asteriskCount < lineLength; asteriskCount++)
        {
            System.out.println("*");
        }
    }
}

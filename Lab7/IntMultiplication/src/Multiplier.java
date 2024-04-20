public class Multiplier {

    public static int computer(int num1, int num2)
    {
        int total = num1;

        if(num2 == 1)
            return total;
        else
        {
            total = num1 + computer(num1, num2 - 1);
        }

        return total;
    }
}

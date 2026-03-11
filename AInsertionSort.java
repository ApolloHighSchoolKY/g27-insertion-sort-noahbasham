import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        System.out.println(Arrays.toString(myNumbers));

        boolean switchedIt;

        for(int currentPosition = 1; currentPosition < myNumbers.length; currentPosition++)
        {
            int currentNum = myNumbers[currentPosition];
            switchedIt = false;
            for(int currentComparison = 0; currentComparison < currentPosition; currentComparison++)
            {
                int currentCompNum = myNumbers[currentComparison];
                if(currentNum < currentCompNum && !switchedIt)
                {
                    
                    for(int currentMove = currentPosition; currentMove > currentComparison; currentMove--)
                    {
                        int previousNum = myNumbers[currentMove - 1];
                        myNumbers[currentMove] = previousNum;
                    }
                    
                    myNumbers[currentComparison] = currentNum;
                    
                    switchedIt=true;
                }
            }
        }

        System.out.println(Arrays.toString(myNumbers));

    }
}

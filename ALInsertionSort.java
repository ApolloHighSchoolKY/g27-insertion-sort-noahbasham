import java.util.ArrayList;
import java.util.Arrays;
public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int currentPosition = 1; currentPosition<myNumbers.length; currentPosition++){
			//Check with each of the numbers in the sorted list
			inserted=false;
			for(int currentComparison = 0; currentComparison<currentPosition; currentComparison++)
			{

				//If this number is less than one in the sorted list,
				//insert it there
				if(myNumbers[currentPosition] < sorted.get(currentComparison) && !inserted)
				{
					sorted.add(currentComparison, myNumbers[currentPosition]);
					inserted = true;
				}
			//If it was not inserted, stick it on the end.
				if(!inserted)
					sorted.add(myNumbers[currentPosition]);
				System.out.println(sorted);
			}
		//End Loop for unsorted list
		}

		System.out.println(sorted);

		//Move the data back to the array
		int currentVal = 0;
		int position = 0;
		for(int i = 0; i < sorted.size(); i++)
		{
			if(sorted.get(i)>=currentVal && position < myNumbers.length)
			{
				myNumbers[position] = sorted.get(i);
				position++;
				currentVal = sorted.get(i);
			}
		}
		//Print the contents of the array
		System.out.println(Arrays.toString(myNumbers));
    }


}

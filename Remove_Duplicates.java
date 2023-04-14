import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Remove_Duplicates
{
	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(23);
		num.add(3);
		num.add(65);
		num.add(17);
		num.add(7);
		num.add(23);
		num.add(3);
		num.add(11);
		System.out.println("list of prime numbers : " + num);
		Set<Integer> primesWithoutDuplicates
		= new LinkedHashSet<Integer>(num);
		num.clear();
		num.addAll(primesWithoutDuplicates);
 
		System.out.println("List of Numbers Without Duplicates : " + num);
	}
}
package zaid;

import java.util.Comparator;

public class ComparePlayer implements Comparator<ComparatorQ> {
	public int compare(ComparatorQ q1,ComparatorQ q2)
	{
		if(q1.score==q2.score)
		{
			if(q1.player.compareTo(q2.player)<0)
				return -1;
			
			else if(q1.player.compareTo(q2.player)<0)
		
			return 1;
		
			return 0;
		}
	
		
		else if(q1.score>q2.score)
		{
			return -1;
		}
		else if(q1.score<q2.score)
		{
			return 1;
		}
		else 
			return 0;
	}

}

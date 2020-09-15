package zaid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConparatorTest {
	
	public static void main(String args[])
	{	
		int a;
		List<ComparatorQ> list = new ArrayList<>();
		Scanner obj = new Scanner(System.in);
		do {
		System.out.println("enter name");
		String n = obj.next();
		System.out.println("enter score");
		int m = obj.nextInt();
		
		list.add(new ComparatorQ(n,m));
		System.out.println("want to enter more");
		a=obj.nextInt();
		
		}while(a==1);
		
		System.out.println("players without sorting"+list);
		
		ComparePlayer p = new ComparePlayer();
		
		Collections.sort(list,p);
		
		System.out.println(list);
	}

}

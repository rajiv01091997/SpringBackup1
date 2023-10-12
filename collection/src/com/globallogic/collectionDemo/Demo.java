package com.globallogic.collectionDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add(2);
ar.add(3);
ar.add(null);
ar.add("rajiv");
//System.out.println(ar);
//ar.remove(2);
//System.out.println(ar);
//ar.remove((Object)"rajiv");
//System.out.println(ar);
ListIterator itr=ar.listIterator(ar.size());
while(itr.hasPrevious())
{
	System.out.println(itr.previous());
}
	}

}

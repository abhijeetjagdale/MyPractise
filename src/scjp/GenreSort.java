package scjp;

import java.util.Comparator;

public class GenreSort implements Comparator<Dvdinfo>{

	@Override
	public int compare(Dvdinfo o1, Dvdinfo o2) {
		// TODO Auto-generated method stub
		System.out.println("Sort using Comparator - compare ");
		return o1.getGenre().compareTo(o2.genre);
	}
}

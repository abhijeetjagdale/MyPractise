package scjp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Dvdinfo implements Comparable<Dvdinfo> {
	String title;
	String genre;
	String leadactor;
	
	public Dvdinfo(String t, String g, String a) {
		this.title = t;
		this.genre = g;
		this.leadactor = a;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return title+ " "+genre+" "+leadactor;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public String getActor(){
		return this.leadactor;
	}

	@Override
	public int compareTo(Dvdinfo o) {
		// TODO Auto-generated method stub
		System.out.println("Sort using Comparable-  ComapreTO ");
		return title.compareTo(o.getTitle());
	}

}

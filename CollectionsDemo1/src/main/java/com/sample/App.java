package com.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import com.sample.model.Authors;
import com.sample.model.Books;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static void mainMenu(HashMap<Integer, Authors> authors) {
		System.out.println("1. Add An Author");
		System.out.println("2. View All Authors");
		System.out.println("3. View Author Details");
		System.out.println("4. Remove an Author");
		System.out.println("5. Update an Author");
		System.out.println("6. Exit");
		
		System.out.print("Enter your option: ");
		int ch = sc.nextInt();
		
		submenu(ch, authors);
	}
	
	private static void submenu(int ch, HashMap<Integer, Authors> authors) {
		switch(ch) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			Runtime.getRuntime().exit(0);
		default:
			System.out.println("Please choose the right option");
			mainMenu();
		}
	}
	
	
    public static void main( String[] args )
    {
    	   	
    	HashMap<Integer, Authors> authors = new HashMap<Integer, Authors>();
    	
    	mainMenu(authors);
    	
//        System.out.println( "Hello World!" );
//    	Queue<Integer> queue = new PriorityQueue<Integer>();
//    	
//    	queue.add(3);
//    	queue.add(1);
//    	queue.add(3);
//    	queue.offer(10);
//    	
//    	System.out.println(queue);
//    	
//    	int ele = queue.remove();
//    	System.out.println("Removed: " + ele);
//    	System.out.println(queue);
    	
//    	Queue<Books> books = new PriorityQueue<Books>();
//    	
//    	books.add(new Books(1, "title1", 23));
//    	books.add(new Books(2, "title2", 34));
//    	
//    	System.out.println(books);
//    	HashSet<Integer> numbers = new HashSet<Integer>(32);
//    	HashSet<Integer> evennumbers= new HashSet<>();
//    	evennumbers.add(2);
//    	evennumbers.add(4);
//    	evennumbers.add(6);
//    	System.out.println(evennumbers);
//    	evennumbers.remove(2);
//    	System.out.println(evennumbers);
//    	HashSet<Integer> oddnumbers= new HashSet<>();
//    	oddnumbers.add(1);
//    	oddnumbers.add(3);
//    	oddnumbers.add(3);
//    	oddnumbers.addAll(evennumbers);
//    	
//    	//numbers.addAll(evennumbers);
//    	System.out.println(oddnumbers);
    	
//    	HashSet<Books> books = new HashSet<Books>();
//    	books.add(new Books(1, "title1", 23));
//    	books.add(new Books(2, "title2", 30));
//    	books.add(new Books(1, "title1", 23));
//    	
//    	System.out.println(books);
//    	
//    	for(Books b: books) {
//    		if(b.getBookId() == 2) {
//    			books.remove(b);
//    			break;
//    		}
//    	}
    	
//    	System.out.println(books);
//    	HashMap<Integer,String> hm= new HashMap<Integer,String>();
//    	
//    	hm.put(100,"Praveen");
//    	hm.put(101, "Syed");
//    	System.out.println(hm);
//    	hm.putIfAbsent(103,"Mrinal");
//    	System.out.println(hm);
//    	hm.replace(100,"Praveen", "Ganesh");
//    	System.out.println(hm);
//    	hm.remove(100);
//    	System.out.println(hm);
    	
//    	HashMap<Integer, Books> books = new HashMap<Integer, Books>();
//    	
//    	books.put(1, new Books(1, "title1", 23));
//    	books.put(2, new Books(2, "title2",34));
//    	
//    	System.out.println(books);
//    	
//    	Books b = books.get(1);
//    	System.out.println(b.toString());
//    	
//    	Set<Integer> keys = books.keySet();
//    	
//    	System.out.println("Keys: " + keys);
//    	
////    	Set<Books> vals = (Set<Books>) books.values();
////    	System.out.println("Values: " + vals);
//    	System.out.println("Values: " + books.values());
//    	
//    	for(Entry<Integer, Books> entries: books.entrySet()) {
//    		System.out.println(entries);
//    	}
//    	
//    	b = books.remove(1);
//    	System.out.println(b.toString());
//    	
//    	System.out.println(books);
    	
    }
}

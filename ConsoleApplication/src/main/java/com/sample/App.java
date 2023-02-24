package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sample.model.Books;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
//    	int arr[] = new int[5];
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try {
    		
    		List<Books> books = new ArrayList<Books>();
    		
    		while(true) {
    			boolean flag = true;
    			System.out.println("1. Add a Book");
    			System.out.println("2. View Book Details");
    			System.out.println("3. Update Book Details");
    			System.out.println("4. Remove a Book");
    			System.out.println("5. View All Books");
    			System.out.println("6. Exit");
    			
    			int ch = sc.nextInt();
    			switch (ch) {
    			case 1:
    				System.out.print("Book number: ");
    				int n = sc.nextInt();
    				
    				System.out.print("Title: ");
    				String title = br.readLine();
    				
    				System.out.print("Price: ");
    				double price = sc.nextDouble();
    				
    				Books book = new Books(n,title,price);
    				books.add(book);
    				break;
    			case 2:
    			case 3:
    				System.out.print("Enter Book number: ");
    				int no1 = sc.nextInt();
    				
    				if(!books.isEmpty()) {
    					for(Books b: books) {
    						if(b.getBookNo() == no1) {
    							int index = books.indexOf(b);
    							System.out.println("Enter the new price: ");
    							double p = sc.nextDouble();
    							
    							b.setPrice(p);
    							books.set(index, b);
    							
    							flag = true;
    							break;
    						} else {
    							flag = false;
    						}
    					}
    					
    					if (flag == false) {
    						System.out.println("Book with id: " + no1 + " not found");
    					}
    				} else {
    					System.out.println("List empty");
    				}
    				break;
    			case 4:
    				System.out.print("Enter Book number: ");
    				int no = sc.nextInt();
    				
    				if(!books.isEmpty()) {
    					for(Books b: books) {
    						if(b.getBookNo() == no) {
    							int index = books.indexOf(b);
    							Books ele = books.remove(index);
    							System.out.println("Removed Book: ");
    							System.out.println(ele.toString());
    							flag = true;
    							break;
    						} else {
    							flag = false;
    						}
    					}
    					
    					if (flag == false) {
    						System.out.println("Book with id: " + no + " not found");
    					}
    					
    				} else {
    					System.out.println("List empty");
    				}
    				break;
    			case 5:
    				Iterator<Books> itr = books.iterator();
    				while(itr.hasNext()) {
    					Books b = itr.next();
    					System.out.println(b.toString());
    				}
    			break;
    			default:
    				Runtime.getRuntime().exit(0);
    			}
    		}
//    		books.add(new Books(1, "Title 1", 34.00));
//    		books.add(new Books(2, "Title 2", 23.50));
//    		books.add(new Books(4, "Another title", 34.00));
//    		
//    		for(int i = 0; i < books.size(); i++) {
//    			System.out.println(books.get(i));
//    		}
    		
    		
//    		List<Integer> numbers = new ArrayList<Integer>();
//    		numbers.add(4);
//    		numbers.add(3);
//    		numbers.add(5);
//    		
//    		System.out.println("Numbers: " + numbers);
//    		numbers.add(1, 7);
//    		System.out.println("Numbers: " + numbers);
//    		
//    		int ele = numbers.remove(3);
//    		System.out.println("Removed ele: " + ele);
//    		
//    		System.out.println(numbers.contains(5));
//    		
//    		numbers.set(2, 1);
//    		System.out.println("Numbers: " + numbers);
//    		Books books[] = new Books[5];
//        	for(int i = 0; i<books.length; i++) {
//        		books[i] = new Books();
//        		System.out.print("Book number: ");
//        		int no = sc.nextInt();
//        		
//        		System.out.print("Title: ");
//        		//String title = sc.next();
//        		String title = br.readLine();
//        		
//        		System.out.print("Price: ");
//        		double amt = sc.nextDouble();
//        		
//        		books[i].setBookNo(no);
//        		books[i].setTitle(title);
//        		books[i].setPrice(amt);
//        	}
//        	
//        	System.out.println("Content of the array");
//        	for(Books b: books) {
//        		System.out.println(b.toString());
//        	}
    		
    	} catch(IOException ex) {
    		System.out.println(ex.getMessage());
    	} finally {
    		try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	//Books book; //= new Books();
    	
//        System.out.println( "Hello World!" );
    }
}

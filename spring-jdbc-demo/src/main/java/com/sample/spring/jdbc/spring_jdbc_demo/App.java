package com.sample.spring.jdbc.spring_jdbc_demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.jdbc.spring_jdbc_demo.dao.ProductsDao;
import com.sample.spring.jdbc.spring_jdbc_demo.model.Products;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");
        ProductsDao dao = (ProductsDao) ctx.getBean("productsDao", ProductsDao.class);
        
        while (true) {
        	System.out.println("1. View All Products");
        	System.out.println("2. View Product Details");
        	System.out.println("3. Add New Product");
        	System.out.println("4. Update Product");
        	System.out.println("5. Delete Product");
        	
        	System.out.print("Please choose: ");
        	int ch = sc.nextInt();
        	
        	switch(ch) {
        	case 1:
        		List<Products> products = dao.listAllProducts();
        		System.out.println(products);
        		break;
        	case 2:
        		System.out.print("Enter product id: ");
        		int id = sc.nextInt();
        		Products product = dao.getProductById(id);
        		System.out.println(product.toString());
        		break;
        	case 3:
        		System.out.print("Enter Product Id: ");
        		int pId = sc.nextInt();
        		System.out.print("Enter Product Name: ");
        		String name = sc.next();
        		System.out.print("Enter Price Per Unit: ");
        		double price = sc.nextDouble();
        		Products p = new Products(pId, name, price);
        		dao.saveProduct(p);
        		break;
        	case 4:
        	case 5:
        		System.out.println("Under construction");
        		break;
        	default:
        		Runtime.getRuntime().exit(0);
        		break;
        	}
        }
        
//        Products p = new Products(1, "Dell Inspiron", 89000.00);
//        
//        dao.saveProduct(p);
//        
//        List<Products> products = dao.listAllProducts();
//        System.out.println(products);
        
    }
}

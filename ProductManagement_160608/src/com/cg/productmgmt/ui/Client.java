package com.cg.productmgmt.ui;
import java.util.Scanner;

import com.cg.productmgmt.exception.ProductException;
import com.cg.productmgmt.service.ProductService;

public class Client {
    static Scanner sc = null;
    static ProductService prodSer = null;

    public static void main(String[] args) {
    	//User Interface which display the menu and accept the Input from user
    	//Create object for service and execute the respective methods
        sc =  new Scanner(System.in);
        prodSer = new ProductService();
        int choice= 0;
        while (true)
        {
            System.out.println("1: Update the Product Price ");
            System.out.println("2: Exit");
            choice =sc.nextInt();
            switch(choice)
            {
            case 1: updateProd(); break;
            case 2: exit(); break;
            default:System.exit(0);
            }

        }
    }
    
    private static void updateProd() {
        System.out.println("Enter Category ");
        String category = sc.next();
        System.out.println("Enter Hike Rate");
        int hikeRate = sc.nextInt();
        try {
            if(prodSer.validateCategory(category) && prodSer.validateHikeRate(hikeRate))
            {
                prodSer.updateProducts(category, hikeRate);
                
            }
        } catch (ProductException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
                
    }

    private static void exit() {
        System.out.println("Exit Thank you");
        System.exit(0);
        
    }

    

}


package com.barclays.ims;

import com.barclays.ims.controller.CustomerOperations;
import com.barclays.ims.dao.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.Scanner;

/*
 * Class responsible for the functionality of the menu system.
 * You may build this out in any way you wish, provided that you stick to CLI.
 * GUIs, such as swing, are not permitted.
 */
public class MenuSystem {

    public static final Logger LOGGER = LogManager.getLogger();

    public MenuSystem() {
        init();
    }

    public void init() {
        DbUtils.connect();
        DbUtils.getInstance().init("src/main/resources/sql-schema.sql", "src/main/resources/sql-data.sql");
    }

    public void menu() throws SQLException {
        int select;
        String input;
        Customer cust;
        do {
            CrudController custOps = new CustomerOperations();
            System.out.println(" Welcome to Inventory Management System \n ");
            System.out.println(" 1 - Add a customer \n 2 - View all customers \n 3 - Update a customer \n 4 - Delete a customer" +
                    "\n 5 - Add an item \n 6 - View all items \n 7 - Update an item \n 8 - Delete an item \n 9 - Create an Order" +
                    "\n 10 - View all Orders \n 11 - Delete an Order \n 12 - Add an item to an Order \n 13 - Calculate a cost for an Order" +
                    "\n 14 - Delete an item in an Order \n 15 - Exit \n Please select menu item from above list \n");

            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();
            String message = "IMS feature not supported yet\n";

            switch (select) {
                case 1:
                    scanner = new Scanner(System.in);
                    cust = new Customer();
                    System.out.println("Please enter customers First Name");
                    input = scanner.nextLine();
                    cust.setFirstName(input);
                    System.out.println("Please enter customers Last Name");
                    input = scanner.nextLine();
                    cust.setLastName(input);
                    custOps.create(cust);
                    System.out.println("Customer Added\n Updated Table \n");
                    custOps.readAll();
                    break;
                case 2:
                    custOps.readAll();
                    break;
                case 3:
                    cust = new Customer();
                    scanner = new Scanner(System.in);
                    System.out.println("List of Customers\n");
                    custOps.readAll();
                    System.out.println("Please enter customers id to be updated from above list");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    cust.setCustomerId(id);
                    System.out.println("Please enter customers updated First Name");
                    input = scanner.nextLine();
                    cust.setFirstName(input);
                    System.out.println("Please enter customers updated Last Name");
                    input = scanner.nextLine();
                    cust.setLastName(input);
                    custOps.update(cust);
                    break;
                case 4:
                    cust = new Customer();
                    scanner = new Scanner(System.in);
                    System.out.println("List of Customers\n");
                    custOps.readAll();
                    System.out.println("Please enter the customers id of the customer to be deleted from above list");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    cust.setCustomerId(id1);
                    custOps.delete(cust);
                    System.out.println("Customer Deleted from the table \n Updated Table \n");
                    custOps.readAll();
                    break;
                case 5:
                    System.out.println(message);
                    break;
                case 6:
                    System.out.println(message);
                    break;
                case 7:
                    System.out.println(message);
                    break;
                case 8:
                    System.out.println(message);
                    break;
                case 9:
                    System.out.println(message);
                    break;
                case 10:
                    System.out.println(message);
                    break;
                case 11:
                    System.out.println(message);
                    break;
                case 12:
                    System.out.println(message);
                    break;
                case 13:
                    System.out.println(message);
                    break;
                case 14:
                    System.out.println(message);
                    break;
                case 15:
                    System.exit(0);
            }

        } while (select != 16);
    }

}

package com.barclays.ims.controller;

import com.barclays.ims.CrudController;
import com.barclays.ims.DbUtils;
import com.barclays.ims.dao.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class CustomerOperations implements
        CrudController {
    private DbUtils dbUtils ;
    private ResultSet rs = null;
    @Override
    public List readAll() throws SQLException {
        dbUtils = new DbUtils();
        String getAll = "select * from ims.CUSTOMERS";
        dbUtils.executeQuery(getAll);
        return null;
    }

    @Override
    public String readyById(int id) {
        dbUtils = new DbUtils();
        String getById = "select * from ims.CUSTOMERS where CustId="+id+"";
        dbUtils.executeQuery(getById);
        return null;
    }

    @Override
    public String create(Customer cust) {
        dbUtils = new DbUtils();
        String insertCust = "INSERT INTO ims.Customers (CustId, FirstName, LastName) VALUES ("+gen()+", '"+ cust.getFirstName()+"', '"+cust.getLastName()+"')";
        dbUtils.insert(insertCust);
        return null;
    }

    public int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    @Override
    public String update(Customer cust) throws SQLException {
        dbUtils = new DbUtils();
        String update = "UPDATE ims.Customers set FirstName='"+cust.getFirstName()+"', LastName='"+cust.getLastName()+"' WHERE CustId='"+cust.getCustomerId()+"'";
        dbUtils.insert(update);

        System.out.println("Updated Customer Table\n");
        readAll();
        return null;
    }

    @Override
    public String delete(Customer cust) {
        dbUtils = new DbUtils();
        String getById = "DELETE FROM ims.Customers WHERE CustId="+cust.getCustomerId()+"";
        dbUtils.insert(getById);
        return null;
    }
}

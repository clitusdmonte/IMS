package com.barclays.ims;

import com.barclays.ims.dao.Customer;

import java.sql.SQLException;
import java.util.List;

/*
 * Interface defining abstract CRUD methods for each of your Controllers.
 */
public interface CrudController<T> {

    List<T> readAll() throws SQLException;

    //T readyById();

    //T create();

   // T update() throws SQLException;

    //int delete();

    public String create(Customer cust);
    public String readyById(int id);
    public String update(Customer cust) throws SQLException;
    public String delete(Customer cust);

}

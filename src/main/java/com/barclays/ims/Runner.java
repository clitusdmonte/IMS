package com.barclays.ims;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

/*
 * Entry point for the system.
 * Log4J is the preferred logging system.
 * The stock Scanner class is the preferred user-input system.
 */
public class Runner {

    public static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws SQLException {
        MenuSystem ims = new MenuSystem();
        ims.menu();
    }

}

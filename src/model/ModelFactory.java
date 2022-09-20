package model;

import model.dao.BankDB;

public class ModelFactory {
    /**Factory method that returns the
     * DAO with access to the database.
     */
    public static Modelable getAccess() {
        return new BankDB();
    }
}

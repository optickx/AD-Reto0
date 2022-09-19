package model;

import obj.*;

public interface Modelable {
    /**Stores a new customer in the databse. */
    public void createCustomer(Customer pCustomer);
    /**Use an object to send the data and check if the
     * Customer is or not stored in the database.
     */
    public Customer checkDataCustomer(Customer pCustomer);
    /**Use an object to send the data and checj if the
    Account is or not stored in the database.
    */


    public Account [] checkAccount(Customer pCustomer);
    /**Input a Customer, the function returns an array
     * of all the account of the Customer. (null if none)
     */
    public Account checkDataAccount(Account pAccount);


    /**Input a movement and it will be stored in the
     * database. YOU HAVE TO CHECK THE ACCOUNT.
     */
    public void addMovement(Movement pMovement);
    /**Use an object to send the data and check if the
    Movement is or not stored in the database.
    */
    public Movement [] checkMovement(Account pAccount);
}

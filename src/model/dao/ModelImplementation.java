package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Modelable;
import obj.*;

public class ModelImplementation extends SQLAccess implements Modelable {
    
    private PreparedStatement stmt;
    
    @Override
    public void createCustomer(Customer pCustomer) throws GestorException {
        // TODO Auto-generated method stub
        
        try{
            openConnection();
            String instertCustomer = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(instertCustomer);
            stmt.setInt(1, pCustomer.getID());
            stmt.setString(2, pCustomer.getCity());
            stmt.setString(3, pCustomer.getEmail());
            stmt.setString(4, pCustomer.getLastName());
            stmt.setString(5, pCustomer.getFirstName());
            stmt.setString(6, pCustomer.getMiddleInitial());
            stmt.setInt(7, pCustomer.getPhone());
            stmt.setString(8, pCustomer.getState());
            stmt.setString(9, pCustomer.getStreet());
            stmt.setInt(10, pCustomer.getZip());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
                String error = "Error in the connection to the database";
                GestorException exception = new GestorException(error);
                throw exception;
        } finally{
            try{
                closeConnection();
            
        } catch (SQLException e){
                String error = "Error in the connection to the database";
                GestorException exception = new GestorException(error);
                throw exception;
                }
        
    }       
        }

    @Override
    public Customer checkDataCustomer(Integer pID) {
        ResultSet rs = null;
        Customer pCustomer;
        
        String checkDataCustomer = "SELECT * FROM CUSTOMER WHERE ID = ?";
        
        return null;
    }

    @Override
    public Account[] checkAccount(Customer pCustomer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account checkDataAccount(Account pAccount) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addMovement(Movement pMovement) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Movement[] checkMovement(Account pAccount) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

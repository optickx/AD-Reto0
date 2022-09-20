package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Modelable;
import obj.*;

public class ModelImplementation extends SQLAccess implements Modelable {
    private PreparedStatement stmt;
    
    final String addMovement = "INSERT INTO MOVEMENT VALUES (?,?,?,?,?,?)";
    final String checkMovement = "SELECT M.* FROM MOVEMENT M,ACCOUNT A WHERE A.ID=? AND M.ACCOUNT_ID=A.ID";
    
    @Override
    public void createCustomer(Customer pCustomer) {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public Customer checkDataCustomer(Customer pCustomer) {
        // TODO Auto-generated method stub
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
       //Open connection
        openConnection();
        
        try {
            stmt = con.prepareStatement(addMovement);
        } catch (SQLException ex) {
            Logger.getLogger(ModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

    @Override
    public Movement[] checkMovement(Account pAccount) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

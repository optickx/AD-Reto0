package model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Modelable;
import obj.*;

public class ModelImplementation extends SQLAccess implements Modelable {

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
        ResultSet rs;
        /*        ArrayList<Account> accounts = new ArrayList<>;*/        String sacarCuentas= "select * from account a,customer_account ca where ca.customers_id=?";
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

package model.dao;

import java.sql.ResultSet;
import obj.AccountType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Modelable;
import obj.*;

public class ModelImplementation extends SQLAccess implements Modelable {

    @Override
    public Customer checkDataCustomer(Integer pID) {
        ResultSet rs = null;
        Customer pCustomer;
        
        String checkDataCustomer = "SELECT * FROM CUSTOMER WHERE ID = ?";
        
        return null;
    }

    @Override
    public void checkAccount(Customer pCustomer) {
        ResultSet rs;
        Account account = null;
        String sacarCuentas = "select a.* from account a,customer_account ca where ca.customers_id=?";
        try {
            openConnection();
            stmt = con.prepareStatement(sacarCuentas);
            stmt.setString(1, pCustomer.getID().toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                account = new Account(rs.getInt("a.id"),
                        rs.getString("a.description"),
                        rs.getDouble("a.balance"),
                        rs.getDouble("a.creditLine"),
                        rs.getDouble("a.beginBalance"),
                        rs.getDate("a.beginBalanceTimestamp").toLocalDate(),
                        rs.getInt("a.type"));
                pCustomer.getCuentas().add(account);
            }
            
        } catch (SQLException e) {
        }
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

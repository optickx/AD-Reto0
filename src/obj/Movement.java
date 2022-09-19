package obj;

import java.time.LocalDate;

public class Movement {
    
    private final Integer ID;
    private LocalDate timestamp;
    private double amount;
    private double balance;
    private String description;

    public Movement(Integer pID) {
        ID = pID;
    }

    public Movement(
        Integer pID, LocalDate pTimestamp, 
        double pAmount, double pBalance, String pDescription) {
        ID = pID;
        timestamp = pTimestamp;
        amount = pAmount;
        balance = pBalance;
        description = pDescription;
    }    
}
package task2;
public class Expense {
    private String date;
    private String description;
    private double amount;
    /**
     * @param date
     * @param description
     * @param amount
     */
    public Expense(String date,String description,double amount){
        this.date=date;
        this.description=description;
        this.amount=amount;
    }
    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public double getAmount(){
        return amount;
    }
    public String toString(){
        return "Expense(date=" +date+ ",description=" + description + ",amount=" +amount+ ")";
    }
}

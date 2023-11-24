

package restaurant;


public class Cashier extends Employee {
    
    private static String job = "Cashier";

    public Cashier() {
    }
    public Cashier(String name, long ID, double salary,int WorkHours) {
       super(name,ID,salary,WorkHours);
      
    }
        
     @Override             
    public String toString (){ 
    String s = "Job: " + job+ "\t";
    return s + super.toString();
           
    }
    
        
}

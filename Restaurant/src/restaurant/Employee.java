
package restaurant;


public  abstract class Employee {
    
     private String name ;
     private long ID ;

     //private int numOfEmp I will add it in the main method  

    public Employee() {
    }

    public Employee(String name, long ID) {
        this.name = name;
        this.ID = ID;
       
    }

    public String getName() {
        return name;
    }

    public long getID() {
        return ID;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public abstract void salary(double salary);
     
    public abstract void workHours(); 
    
     public abstract void  addBounse();
         //to add increment o the employee salary
       
     
                
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

public class Waiter extends Employee {
    
    private static String job = "Waiter";

    public Waiter() {
    }
    public Waiter(String name, long ID, double salary,int WorkHours) {
       super(name,ID,salary, WorkHours);
      
    }
    
    /* @Override
     public boolean equals(Object obj){  
         Waiter Emp=(Waiter)obj;
         return(this.getID()==Emp.getID());
     }*/
  
     @Override             
    public String toString (){ 
    String s = "Job: " + job+ "\t";
    return s + super.toString();
           
    }
              
   
    
}

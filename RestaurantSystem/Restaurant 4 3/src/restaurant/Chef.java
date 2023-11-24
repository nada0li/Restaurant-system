/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

public class Chef extends Employee {
    
    private static String job = "Chef";

    public Chef() {
    }
    public Chef(String name, long ID, double salary,int WorkHours) {
       super(name,ID,salary, WorkHours);
      
    }
   
     @Override             
    public String toString (){ 
    String s = "Job: " + job+ "\t";
    return s + super.toString();
           
    }
}

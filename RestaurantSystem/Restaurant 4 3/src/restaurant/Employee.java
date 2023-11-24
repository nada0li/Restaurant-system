
package restaurant;


public abstract class Employee {
    
     private String name ;
     private long ID ;
     private double salary ;
     private int  WorkHours;
     
    public Employee() {
    }

    public Employee(String name, long ID, double salary,int WorkHours) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.WorkHours=WorkHours;
      
    }

    public String getName() {
        return name;
    }

    public long getID() {
        return ID;
    }

  
    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return WorkHours;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

   
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkHours(int WorkHours) {
        this.WorkHours = WorkHours;
    }
     
    
     public void addBonus( int WorkHours) { 
         //to add increment to the employee salary
         int increment=0; 
         if((WorkHours>=4)&&(WorkHours<=6)){
             //increment by 2%
         increment+=((this.salary*2)/100);
         this.salary=(this.salary+increment);
        //  System.out.println("Increment has been added successfully.\n Employee new information is: \n ");
        // toString(); }
         }
         else if(WorkHours>=7){
                 //increment by 4%
         increment+=(this.salary*4)/100;
         this.salary=(this.salary+increment);
        // System.out.println("Increment has been added successfully.\n Employee new information is: \n ");
        // toString();  
                 
                 }
         System.out.println("Increment has been added successfully.. Employees new information is:\n");
         toString();  
      
        }
     
    
   /* public void printInfo(Employee [] obj) {
      to print the array of employee that we have 
      for(int i=0 ;i<obj.length; i++){
      obj[i].toString();
   
     */
  
     
     @Override
     public boolean equals(Object obj){   
     return(this==obj);
     }
     
      @Override             
    public String toString (){ 
        
     // to return a string that contain name and ID and salary 
   
    String msg =  "Name: "+ name + " \tID: " + ID +"\tWork Hourse: "+WorkHours+"\tSalary: " +salary+"\n"  ;
    
    return msg + "\n----------------------------------------------------------------------------";
    }
    
}
    


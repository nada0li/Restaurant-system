/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author A
 */
    public class Order implements Bill {
        
    private static int OrderNumber=0;
    private static double Income;
    private double Total=0;
   

    public Order(){
       OrderNumber++; 
    }
    
   
    
    public int getOrderNumber() {
        return this.OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public static double getIncome() {
        return Order.Income;
    }

    public static void setIncome(double Income) {
        Order.Income = Income;
    }
    
     public double getTotal() {
        return this.Total;
    }

    public void setTotal() {
        this.Total = Total;
    }
    
     
    public double Calculatetotal(ArrayList<Dish> dishs, int[]quantity){
         
        for (int i = 0; i < dishs.size(); i++) {
            Total+=dishs.get(i).getPrice()*quantity[i];
            Income += Total;
        }
   return Total;
    }
   
    
    
   public void infrmationsBILL( ArrayList<Dish> dishs, int[]quantity){
        Calculatetotal( dishs ,quantity);
        System.out.println("-----------[ Bill INFORMATION ]---------");
        System.out.println("\n Order Number[ "+this.OrderNumber+" ]");
        for (int i = 0; i < dishs.size(); i++) {
        System.out.println(dishs.get(i).toString()+" \n Quantity: "+quantity[i]);
       }
        System.out.println("-----------[ TOTAL ]---------");
        System.out.println("The Total for your order is : "+Total+" SR ");
        
    }
    
    public double Income(double Income){
        return Income; 
  }

    @Override
    public String toString() {
        return "Bill Information: \n_________________________\n " + "Order Number: " + OrderNumber+ "\n  Total: \n" + Total ;
       
        //}
    }

   

    @Override
    public boolean equals(Object obj) {   
     return(this==obj);
     }
}

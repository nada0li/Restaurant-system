package restaurant;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A
 */
public interface Bill {
     
     public int getOrderNumber() ;
     public void setOrderNumber(int OrderNumber);
    // public double getIncome(); 
    // public void setIncome(double Income);
     public double getTotal();
     public void setTotal();
     public double Calculatetotal(ArrayList<Dish> dishs, int[]quantity);
     public void infrmationsBILL(ArrayList<Dish> dishs, int[]quantity);
}

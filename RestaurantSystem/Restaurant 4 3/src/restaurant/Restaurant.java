

package restaurant;

import java.util.ArrayList;
import java.util.*;

public class Restaurant {

    public static void main(String[] args) {
       
        
        System.out.println("__________________________ Welcome In Our Restaurant :) __________________________ \n");
        String answer =" ";
        String an = " ";
        String n = "no";
        int cho = 0;
        int ch = 0;
        //Order y =new Order();
         ArrayList<Rating> ratingList = new ArrayList<>();
 
        int numOfEmp = 7; // the Number of employee that we have
        Employee[] EmpList = new  Employee[numOfEmp];
        //adding Employee Information
        EmpList[0]=new Chef("Emad",344221,7000,8);
        EmpList[1]=new Cashier("Badr",464333,3500,6);
        EmpList[2]=new Cashier("Ahmed",947721,3500,6);
        EmpList[3]=new Waiter("Adham",444441,4500,9);
        EmpList[4]=new Waiter("Raad",888861,4500,9);
        EmpList[5]=new Waiter("Adam",500321,4500,9);
        EmpList[6]=new Waiter("Yasser",421171,2500,4);
       
        Dish [] MainList = new Dish [9];
        MainList [0] = new Dish("Salmon Steak    ",65.0,208,"Main dish");
        MainList [1] = new Dish("Meat Steak      ",80.0,570,"Main dish");
        MainList [2] = new Dish("Chicken Steak   ",45.0,113,"Main dish");
        MainList [3] = new Dish("Fettuccine Pasta",55.0,266,"Main dish");
        MainList [4] = new Dish("Spaghetti       ",35.0,190,"Main dish");
        MainList [5] = new Dish("Margherita Pizza",30.0,230,"Main dish");
        MainList [6] = new Dish("Pepperoni Pizza ",30.0,290,"Main dish");
        MainList [7] = new Dish("Chicken Burger  ",50.0,403,"Main dish");
        MainList [8] = new Dish("Meat Burger     ",60.0,563,"Main dish");
        
        Dish [] AppetizerList = new Dish [5];
        AppetizerList [0] = new Dish("French Fries         ",15.0,312,"Appetizer");
        AppetizerList [1] = new Dish("Mozzarella Sticks    ",20.0,351,"Appetizer");
        AppetizerList [2] = new Dish("Dynamite Shrimp      ",35.0,466,"Appetizer");
        AppetizerList [3] = new Dish("Nachos Salad         ",45.0,344,"Appetizer");
        AppetizerList [4] = new Dish("Chicken Wings        ",40.0,346,"Appetizer");
        
        Dish [] DrinksList = new Dish [9];
        DrinksList [0] = new Dish("Water         ",1.00,0,"  Drinks");
        DrinksList [1] = new Dish("Watermelon    ",14.0,150,"Drinks");
        DrinksList [2] = new Dish("Apple         ",12.0,180,"Drinks");
        DrinksList [3] = new Dish("Orange        ",11.0,180,"Drinks");
        DrinksList [4] = new Dish("Strawberry    ",15.0,335,"Drinks");
        DrinksList [5] = new Dish("Grape         ",15.0,180,"Drinks");
        DrinksList [6] = new Dish("Pepsi         ",4.00,135,"Drinks");
        DrinksList [7] = new Dish("Sprite        ",5.00,140,"Drinks");
        DrinksList [8] = new Dish("Mernda Orange ",3.00,355,"Drinks");
        
        Dish [] DessertList = new Dish [5];
        DessertList [0] = new Dish("Soffle         ",25.0,169,"Dessert");
        DessertList [1] = new Dish("Cheesecake     ",20.0,321,"Dessert");
        DessertList [2] = new Dish("Brownie        ",20.0,298,"Dessret");
        DessertList [3] = new Dish("Creme Brulee   ",30.0,274,"Dessert");
        DessertList [4] = new Dish("IceCream       ",10.0,207,"Dessert");
        
        int input=0;
        do{
        //The Tasks : 1.for Customer , 2.for Employee and Manager 
        System.out.println("Would you like to :\n"
                          + "1-Create a new order.\n"
                          +"2-Show Information.\n"
                          +"3-Exit. "   );
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your choice from 1 to 3 :  ");
        try{//Exception Handling
        input= number.nextInt(); }//Reading the number of Task from the user
        catch(Exception e){
            System.out.println("Sorry , please Enter a number. ");
        }
        switch(input){
           case 1: {// for Customer 
               int choice  = 0;
           do{ 
           System.out.println(" 1-Show The Menu.\n"
                             +" 2-Ordering.\n"
                             +" 3-Review the Restaurant.\n"
                             +" 4-Exit. "    );
     
        System.out.println(" Enter your choice from 1 to 4 ");
        try{
        choice = number.nextInt();}
        catch(Exception e){
            
            System.out.println("Sorry , please Enter a number. ");
        }
           switch(choice){
               case 1: {
                   int choosem = 0;
                   do{
                   System.out.println("1- Show main dishes menu\n2"
                           + "- Show appetizer menu\n"
                           + "3- Show drinks menu\n"
                           + "4- Show dessert menu\n"
                           + "5- Exit ");
                   System.out.println("Enter your choice from 1 to 5");
                   try{
                   choosem = number.nextInt();}
                   catch(Exception e ){
                       System.out.println("Sorry , please Enter a number. ");
                   }
                   if(choosem == 1){
                System.out.println("_________________________ Main Dishes Menu_________________________ \n");
                for(int m = 0; m < MainList.length; m++)
                System.out.println(m+"."+MainList[m]);
                System.out.println("___________________________________________________________________");
                                   }
                   if(choosem == 2){
                System.out.println("_________________________Appetizer Menu_________________________ \n");
                for(int a = 0; a < AppetizerList.length; a++)
                System.out.println(a+"."+AppetizerList[a]);
                System.out.println("_________________________________________________________________"); 
                                   }
                if(choosem == 3){
                System.out.println("_________________________Drinks Menu_________________________ \n");
                for(int d = 0; d < DrinksList.length; d++)
                System.out.println(d+"."+DrinksList[d]);
                System.out.println("_____________________________________________________________");
                                }
                if(choosem == 4){
                System.out.println("_________________________Dessert Menu_________________________ \n");
                for(int t = 0; t < DessertList.length; t++)
                System.out.println(t+"."+DessertList[t]);
                System.out.println("______________________________________________________________");
                                }
                if(choosem == 5){
                break ;
                                }
                   } while(choosem != 5);
                   break;
               }
               case 2: {
                 int Qdish=0; 
                 String str ="";
                 String stri ="";
                 int i =0 , w = 0 , e = 0,o = 0;
            ArrayList<Dish> order = new ArrayList<>(); // من نوع اراي ليست "كولكشن" لأخذ الطلبات 
          //  ArrayList<Double> price = new ArrayList<>(); 
           // Scanner str = new Scanner(System.in);
           // System.out.println("Enter the Order number: ");//اليوزر يدخل رقم الطلب
            //int j = number.nextInt();
           
           //y.setOrderNumber(j);
            // الان باخذ ارقام الاطباق واتأكد اذا موجوده
            //for(int r=0;r<1;r++){
               System.out.println("Do you want to order a Main Dish? : \n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
               cho =number.nextInt();
              if(cho == 1){  
              do{  
               System.out.println("Enter the Main dish number: ");// الطبق الرئيسي
               for( i=0;i<MainList.length;i++){
                   int number1=number.nextInt();
                   if(number1>MainList.length)
                   System.out.println("We do not have");
                   else if(number1<MainList.length){
                       MainList[i]= MainList[number1];
                       
                   System.out.println("Enter the quantity ");
                   Qdish=number.nextInt();}break;}
                    System.out.println("Do you want to order another Main Dish? :\n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                       ch = number.nextInt();
                   }while(ch != 2);
                  }
             
                 //  price.add(MainList[number1].getPrice()*Qdish1);
                System.out.println("Do you want to order a Drink? : \n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                cho=number.nextInt();
              if(cho == 1)  {  
                  do{
               System.out.println("Enter the drink number: ");// المشروب
               for( e=0;e<DrinksList.length;e++){
                   int number2=number.nextInt();
                   if(number2>DrinksList.length)
                   System.out.println("We do not have");
                   else if(number2<DrinksList.length){
                      DrinksList[e]= DrinksList[number2];
                   System.out.println("Enter the quantity ");
                Qdish=number.nextInt();}break;}
                       System.out.println("Do you want to order another Drink? :\n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                       ch = number.nextInt();
                   }while(ch != 2);
                
                }
                //price.add(DrinksList[number2].getPrice()*Qdish2);
                   
               
                System.out.println("Do you want to order an Appetizer? :\n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                cho=number.nextInt();
              if(cho == 1)  {  
                  do{
                System.out.println("Enter the Appetizer number: ");// المقبلات
               for( o=0;o<AppetizerList.length;o++){
                   int number3=number.nextInt();
                   if(number3>AppetizerList.length)
                   System.out.println("We do not have");
                   else if(number3<AppetizerList.length){
                      AppetizerList[o]= AppetizerList[number3];
                   System.out.println("Enter the quantity ");
                   Qdish=number.nextInt();}break;}
                    System.out.println("Do you want to order another Appetizer? : \n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                       ch = number.nextInt();
                   }while(ch != 2);
                   }
               
                    //  price.add(AppetizerList[number3].getPrice()*Qdish3);
                   System.out.println("Do you want to order an Dessert? :\n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                cho=number.nextInt();
              if(cho == 1)  {   
                  do{
                   System.out.println("Enter the Dessert number: ");// الحلويات
                   for(w=0;w<DessertList.length;w++){
                   int number4=number.nextInt();
                   if(number4>DessertList.length)
                   System.out.println("We do not have");
                   else if(number4<DessertList.length){
                   DessertList[w]=DessertList[number4];
                   System.out.println("Enter the quantity ");
                   Qdish=number.nextInt();}break;}
                   System.out.println("Do you want to order another Dessert? : \n"
                       + "1-yes \n"
                       + "2-no \n"
                       +"Enter your choice from 1 to 2");
                       ch = number.nextInt();
                   }while(ch != 2);
                  
                  }
                   
                //   price.add(AppetizerList[number3].getPrice()*Qdish3);
                   // طباعة معلومات الطلب لليوزر 
                    //System.out.println("-----------[ Bill INFORMATION ]---------");
                   // System.out.println("\n Order Number[ "+y.getOrderNumber()+" ]");
                    //System.out.println(MainList[i]+"\n quantity: "+Qdish1);
                   // System.out.println(DrinksList[e]+" \n Quantity: "+Qdish2);
                   // System.out.println(AppetizerList[o]+" \n Quantity: "+Qdish3);
                   // System.out.println(DessertList[w]+" \n Quantity: "+Qdish4);
                   
                   
                    order.add(MainList[i]);
                    order.add(DrinksList[e]);
                    order.add(AppetizerList[o]);
                    order.add(DessertList[w]);
                   
                   
                   int[]quantorder=new int [4];
                  quantorder[0]=Qdish;
                  quantorder[1]=Qdish;
                  quantorder[2]=Qdish;
                  quantorder[3]=Qdish;
                  Order obj = new Order();
                  //obj.setOrderNumber(j);
                  obj.infrmationsBILL(order,quantorder);
                  
                  ////////////////////////////////////////////
              //}}}
             
               //}}}}}} 
                   
               break;}
              
               case 3:{     
                    //بعد نخلص من الفاتورة نقول له يقيم مطعمنا
               Scanner in = new Scanner(System.in);
       
            System.out.print("Enter your name :");
            String Name = in.next();
            System.out.print("Enter your Email :");
            String Email = in.next();
            Rating obj = new Rating(Name, Email);
            
            obj.printinfo();
            
       for (int r = 0; obj.reatingtype.length > r; r++) {
            System.out.println(obj.reatingtype[r]);
            System.out.print("Enter your Choice: -From 1 to 5-");
            int Choice = in.nextInt();
             
            switch (Choice) {
                case 1:
                    obj.choice[r] = obj.reatingLevle[0];
                    break;
                case 2:
                    obj.choice[r] = obj.reatingLevle[1];
                    break;
                case 3:
                    obj.choice[r] = obj.reatingLevle[2];
                    break;
                case 4:
                    obj.choice[r] = obj.reatingLevle[3];
                    break;
                case 5:
                    obj.choice[r] = obj.reatingLevle[4];
                    break;
                default:
                    System.out.println("wrong choice");
            }
              

        }
            ratingList.add(obj);  
            break;}  
                   
               case 4: {
              System.out.println(" Thanks for ordering ");
                   break;}
               default : System.out.println("wrong choice");
               break;}
           
                System.out.println("Do you want another service ? yes, no :" );
                Scanner str = new Scanner(System.in);
                an = str.next();
                }while(choice !=4 && an.equals("yes"));
                   
        
          break; }
               case 2:{
            //for Employee and Manager 
          System.out.println(" Are you:\n"
                           + "1-Manager\n"
                           + "2-Employee\n"
                           + "3-Exit " ); 
          //Ask the user for work position
          System.out.print("Enter your choice from 1 or 2 : ");
          int position=0;
          try{
          position= number.nextInt();}
          catch(Exception e){
            System.out.println("Sorry , please Enter a number. ");
          }
           do{
          switch(position){
             
              case 1 :{
         // MANAGER tasks
          System.out.println("1-Show Employee Information.\n"
                           + "2-Adding Bonus. \n"
                          // + "3-Show All Income.\n"
                           + "3-Show Restaurant reviews.\n"
                           + "4-Exit.");
                       
          System.out.print("Enter The service number you want from 1 to 4 : ");//Determine the required service
          int serv= number.nextInt();
          System.out.println("");
          switch(serv){
              case 1: {
              
              //Print The Employee Number and their Information 
           System.out.println("The Number Of Employee is : "+numOfEmp+"\n");
           System.out.println("And The Employee Information is :\n");
           for (int i = 0; i < EmpList.length; i++) {
           System.out.println(EmpList[i]); }
           break ; }
           
          
              case 2 : {
              //adding bonus for Employee according to the work hours
              for (int i = 0; i < EmpList.length; i++) {
              int hours=EmpList[i].getWorkHours();
              EmpList[i].addBonus(hours);
              System.out.println(EmpList[i]);
               }
          
              break ;
              }
            /*  case 3 :{
                 
                  System.out.println("The Total Income is : "+ Order.getIncome()+" SR" );
              
               break ;
              } */
             // 
          
          case 3:{
              
                for(int j=0; j<ratingList.size(); j++){
                    System.out.println(ratingList.get(j));}
              
         break; }
          
          default: System.out.println("Wrong Choice !");
          
          }
              break;} 
            
              
          case 2 :{// EMPLOYEE tasks
                //show Employee Information when he is enter his ID
                System.out.print("Enter your ID number to Show Your Information : "   );  
                long id= number.nextLong(); 
                int index = EmpList.length;
                boolean flag=false;
                for (int i = 0; i < EmpList.length; i++) {
                //search about ID in Employee List and take the correct index if there
                     if(id==EmpList[i].getID()){
                     index=i;
                     flag=true;}
                }
                if (flag==true){
                System.out.println(EmpList[index]);//print the correct information
                }
                else{
                System.out.println("Sorry,There is No Employee with this Entered ID !");
                //Error message when no matching ID is found in Employee List
                 break;
                 }}
            case 3 :
            {
            //Exit 
            break;
            }
             
            default :{ 
                System.out.println("Wrong Choice !!! " ); 
                break;
            }
            
            
             }
             System.out.println("Do you want to perform another task ? yes, no :" );
             try{
             answer= number.next();}
             catch(Exception e){
                   System.out.println("Sorry , please Enter a yes or no . ");
             }
             }while(answer.equals("yes"));
              break; }
         //////////////////////////////////////////////////////////////////////////
           case 3 : {
             //Exit, show good bye message
             System.out.println("\" Thank you , we hope you’ve enjoyed your experience\n"
                                + " and we can’t wait to see you again soon..\" " );
            break; }    
           default: 
             System.out.println("Wrong Choice !!! " ); //if the user inter any wrong other number .   
             break;
            }
            System.out.println("Do you want another service ? yes, no :" );
            answer= number.next();
            
        }while(input!=3 && answer.equals("yes"));
           
           }} 

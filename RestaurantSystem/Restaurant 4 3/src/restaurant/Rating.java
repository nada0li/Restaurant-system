/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author rola92
 */
public class Rating {
    String[] reatingLevle = {"Very Good ;)", "Good :)", "fine :|", "Bad:(", "Very bad :(("};
    String[] reatingtype = {"Food Quality : ", "Overall Service Quality : ", "Order Accuracy : ", "Overall Experience : "};
    String[] choice = new String[4];

    private int ratingsCount = 0;
    private String Name;
    private String Email;

    public Rating() {

    }

    public Rating(String Name, String Email) {
        this.Name = Name;
        this.Email = Email;
        ratingsCount++;
    }

    public void setName(String Name) {
        this.Name = Name;
        ratingsCount++;
    }

    public String getName() {
        return this.Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;

    }

    public String getEmail() {
        return this.Email;
    }

    public void printinfo() {
        System.out.println("Hi " + getName());
        System.out.println("------ Please let us know how was the food and service ------");
        for (int r = 0; reatingtype.length > r; r++) {
            System.out.println(reatingtype[r]);
            for (int j = 0; reatingLevle.length > j; j++) {
                System.out.print(j + 1 + ". " + reatingLevle[j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");

    }

    @Override
    public boolean equals(Object obj) {
        Rating W = (Rating) obj;
        return (this.getName() == W.getName());
    }

    @Override
    public String toString() {
        String str = "The number of pepole how rate " + ratingsCount + "\n" + "Customer Rating : \n";
        str += "Name : " + getName() + "\t" + "Email : " + getEmail() + "\n";
        for (int r = 0; reatingtype.length > r; r++) {
            str += reatingtype[r] + "\n" + "Customer choic --> " + choice[r] + "\n";
        };
        return str;
    }


    
    
}

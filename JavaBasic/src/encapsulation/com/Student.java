package encapsulation.com;

public class Student {
    private int roll=1;
    private String name="Mr Suresh Kumar";
    private String address= "Akhtar Colony Karachi";


    public void setRoll(int roll) {
        this.roll = roll; }

    public int getRoll() {
        return roll;  }

    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address; }

    public String getAddress() {
        return address;
    }

    public void display(){
         System.out.println("Your Roll Number is "+ getRoll());
        System.out.println("Your Name  is "+ getName());
        System.out.println("Your Address is "+ getAddress());

    }

}


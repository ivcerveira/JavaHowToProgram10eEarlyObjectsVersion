package ch03.fig03_01_02;

public class Account {
    private String name; // instance variable

    // method to set the name in the object
    public void setName(String name)
    {
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName()
    {
        return name + " Cerveira"; // return value of name to caller
    }
}

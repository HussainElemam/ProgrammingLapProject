/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author majda
 */
public class Person {
    private String Name;
    private int Age;
    private int ID;
    private String Gender;
    public Person(){
        Name = null;
        Age = 0;
        ID = 0;
        Gender = null;
                
    }
    public Person(String Name, int Age, int ID, String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.ID = ID;
        this.Gender = Gender;
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    

    @Override
    //change the to string
    public String toString() { 
        return "Person{" + "Name=" + Name + ", Age=" + Age + ", ID=" + ID + "Gender = " + Gender + '}';
    }
    
    
    
}

package classes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author majda
 */
public class Person {
    private String Name;
    private LocalDate dob;
    private String ID;
    private char Gender;
    
    public Person(){
        Name = "";
        dob = null;
        ID = "";
        Gender = '\u0000';
                
    }
    public Person(String Name, LocalDate dob, String ID, char Gender) {
        this.Name = Name;
        this.dob = dob;
        this.ID = ID;
        this.Gender = Gender;
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
    
    public int getAge(){
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }

    @Override
    //change the to string
    public String toString() { 
        return Name + "," + dob + "," + ID + "," + Gender;
    }
    
}

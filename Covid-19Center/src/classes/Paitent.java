/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;



/**
 *
 * @author majda
 */
public class Paitent extends Person {
    VaccinationData Paitentvaccine ;
    private boolean Result;

    public Paitent(VaccinationData Paitentvaccine, boolean Result) {
        super();
        this.Paitentvaccine = Paitentvaccine;
        this.Result = Result;
    }

    public Paitent(VaccinationData Paitentvaccine, boolean Result, String Name, int Age, int ID, String Gender) {
        super(Name, Age, ID, Gender);
        this.Paitentvaccine = Paitentvaccine;
        this.Result = Result;
    }

    public VaccinationData getPaitentvaccine() {
        return Paitentvaccine;
    }

    public void setPaitentvaccine(VaccinationData Paitentvaccine) {
        this.Paitentvaccine = Paitentvaccine;
    }

    public boolean isResult() {
        return Result;
    }

    public void setResult(boolean Result) {
        this.Result = Result;
    }
    public boolean isSuitable(Vaccine v){//this will be used to check if the paitents selected vaccine is suitable or not due to AGE
        if (super.getAge() > v.getMinAge())
        return true; // idk why i had to write 2 times
        return false;
    }
    
    
    
}

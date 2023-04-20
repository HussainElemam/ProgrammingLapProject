package classes;

import java.time.LocalDate;



/**
 *
 * @author majda
 */
public class Patient extends Person {
    VaccinationData Paitentvaccine ;
    private char Result;

//    public Patient() {
//    }

    public Patient(VaccinationData Paitentvaccine, char Result) {
        super();
        this.Paitentvaccine = Paitentvaccine;
        this.Result = Result;
    }

    public Patient(String Name, LocalDate date, String ID, char Gender, VaccinationData Paitentvaccine, char Result) {
        super(Name, date, ID, Gender);
        this.Paitentvaccine = Paitentvaccine;
        this.Result = Result;
    }

    public VaccinationData getPaitentvaccine() {
        return Paitentvaccine;
    }

    public void setPaitentvaccine(VaccinationData Paitentvaccine) {
        this.Paitentvaccine = Paitentvaccine;
    }

    public char getResult() {
        return Result;
    }

    public void setResult(char Result) {
        this.Result = Result;
    }
    public boolean isSuitable(Vaccine v){
        //this will be used to check if the paitents selected vaccine is suitable or not due to AGE
        return super.getAge() >= v.getMinAge();
    }
    
}

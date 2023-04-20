package classes;

import java.time.*;

/**
 *
 * @author Hussain
 */
public class VaccinationData {
    private Vaccine vaccine;
    private LocalDate date;

    public VaccinationData(){
        this(null, null);
    }
    
    public VaccinationData(Vaccine vaccine, LocalDate date) {
        this.vaccine = vaccine;
        this.date = date;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(int day, int month, int year) {
        this.date = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return vaccine + "," + date;
    }
}

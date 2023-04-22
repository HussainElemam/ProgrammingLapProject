package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hussain
 */
public class database {

    public static ArrayList<Patient> patients = new ArrayList();
    public static ArrayList<Vaccine> vaccines = new ArrayList();

    private Scanner patientsFile = null;
    private Scanner vaccinesFile = null;

    public database() {

        try {
            patientsFile = new Scanner(new FileReader("patientsFile.txt"));
            vaccinesFile = new Scanner(new FileReader("vaccinesFile.txt"));

            while (vaccinesFile.hasNext()) {
                String[] line = vaccinesFile.nextLine().split(",");
                vaccines.add(new Vaccine(
                        line[0],
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3])
                ));
            }
       
            while (patientsFile.hasNext()) {
                String[] line = patientsFile.nextLine().split(",");
                VaccinationData vd;
                if (line[4].equals("null")) {
                    vd = null;
                } else {
                    String[] vds = (line[4].equals("null")) ? null : line[4].split(";");
                    vd = new VaccinationData(getVaccineByName(vds[0]), LocalDate.parse(vds[1]), (vds[2].equals("null"))? null :LocalDate.parse(vds[2]), Integer.parseInt(vds[3]));
                }
                patients.add(new Patient(
                        line[0],
                        LocalDate.parse(line[1]),
                        line[2],
                        line[3],
                        vd,
                        line[5].charAt(0)
                ));
            }
            patientsFile.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }
    }

    public static Vaccine getVaccineByName(String name) {
        for (Vaccine v : vaccines) {
            if (v.getvName().equals(name)) {
                return v;
            }
        }
        return null;
    }

    public static Patient getPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getName().toLowerCase().equals(name.toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    public static Patient getPatientById(String name) {
        for (Patient p : patients) {
            if (p.getID().equals(name)) {
                return p;
            }
        }
        return null;
    }

}

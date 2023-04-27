package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
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
                    vd = new VaccinationData(getVaccineByName(vds[0]), LocalDate.parse(vds[1]), (vds[2].equals("null")) ? null : LocalDate.parse(vds[2]), Integer.parseInt(vds[3]));
                }
                new Patient(
                        line[0],
                        LocalDate.parse(line[1]),
                        line[2],
                        line[3],
                        vd,
                        line[5].charAt(0)
                );
            }
            patientsFile.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }
        
//        int check;
//        do{
//            check = 0;
//        for (int i = 0; i < patients.size() - 1; i++) {
//            if(Integer.parseInt(patients.get(i).getID()) > Integer.parseInt(patients.get(i+1).getID())){
//                System.out.println(patients.get(i).getID());
//                System.out.println(patients.get(i+1).getID());
//                patients.add(i, patients.get(i + 1));
//                patients.remove(i + 2);
//                check++;
//            }
//        }
//            System.out.println("check: " + check);
//        }while(check != 0);
/*        Not Important I just wanted to sort the patient in the file by their ID 
          manually then I said why not to do it outomaticly ^-^
*/

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

    public static void save() {
        try {
            PrintWriter write = new PrintWriter("patientsFile.txt");
            String data = "";
            for(Patient p: patients){
                if(p.getPaitentvaccine() != null){
                    if(p.getPaitentvaccine().getDateOfSecondDose() != null){
                        data += p + "\n";
                    }else{
                        data += p.pToString() + "," + p.getPaitentvaccine().getVaccine().getvName() + ";" + p.getPaitentvaccine().getDateOfFirstDose() + ";null;" + p.getPaitentvaccine().getNumOfDoses() + "," + p.getResult() + "\n";
                    }
                }else{
                    data += p.pToString() + ",null," + p.getResult() + "\n";
                }
            }
            write.print(data);
            write.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }
    }

}

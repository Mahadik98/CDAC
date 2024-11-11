import lib.*;

public class program {
    public static void main(String[] args) {

        Patient pa = new Patient(100, 5, "Darshan", BedType.STANDARD);
        System.out.println("\nPatient");
        System.out.println("Patient Name: " + pa.getName());
        System.out.println("Patient ID: " + pa.getPatientId());
        System.out.println("Bill Amount: " + pa.GetAmount());


        Inhouse in = new Inhouse( 101,  "Shubham",  10, BedType.LUXURY,0);
        System.out.println("\nInhouse Patient\n");
        System.out.println("Patient Name: " + in.getName());
        System.out.println("Patient ID: " + in.getPatientId());
        System.out.println("Bill Amount: " + in.GetAmount());
    }

}

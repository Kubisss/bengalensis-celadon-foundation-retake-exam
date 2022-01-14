package hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        Patient patient4 = new Patient();
        Patient patient5 = new Patient();
        Patient patient6 = new Patient();
        Patient patient7 = new Patient();
        Patient patient8 = new Patient();

        Hospital hospital = new Hospital(new SafeQueue());
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);

        Hospital hospital2 = new Hospital(new ClassicQueue());
        hospital2.addPatient(patient5);
        hospital2.addPatient(patient6);
        hospital2.addPatient(patient7);
        hospital2.addPatient(patient8);

        System.out.println(hospital);
        hospital.treatNextPatient();
        hospital.treatNextPatient();
        System.out.println(hospital);
        System.out.println();

        System.out.println(hospital2);
        hospital2.treatNextPatient();
        hospital2.treatNextPatient();
        System.out.println(hospital2);

    }


}

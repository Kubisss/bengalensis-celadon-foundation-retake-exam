package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private Queue queue;
    private List<Patient> patientList;

    public Hospital(Queue queue) {
        this.queue = queue;
        this.patientList = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.queue.queuePatientUp(patient);
    }

    public void treatNextPatient(Patient patient) {
        this.queue.getNextPatient().treat();
    }
}


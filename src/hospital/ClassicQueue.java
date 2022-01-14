package hospital;

import java.util.List;
import java.util.ListIterator;

public class ClassicQueue extends Queue{
//    private List<Patient> patientsQue;
//
//    public ClassicQueue() {
//        this.patientsQue = patientsQue;
//    }



    @Override
    public Patient getNextPatient() {
        if (getPatientsQue().size() == 0) {
            return null;
        }
        ListIterator<Patient> iterator = getPatientsQue().listIterator();
        return iterator.next();
    }
}

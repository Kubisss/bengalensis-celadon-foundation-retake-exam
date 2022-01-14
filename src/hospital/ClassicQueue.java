package hospital;

import java.util.List;
import java.util.ListIterator;

public class ClassicQueue extends Queue {

    @Override
    public Patient getNextPatient() {
        if (getPatientsQue().size() == 0) {
            return null;
        }
//        ListIterator<Patient> iterator = getPatientsQue().listIterator();
//        System.out.println(iterator.next());
        System.out.println(getPatientsQue().get(0));
        removePatient(0);
        return getPatientsQue().get(0);
    }

    public void removePatient(int x) {
        getPatientsQue().remove(x);
    }
}

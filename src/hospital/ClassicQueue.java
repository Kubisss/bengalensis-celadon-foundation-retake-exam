package hospital;

import java.util.List;
import java.util.ListIterator;

public class ClassicQueue extends Queue{

    @Override
    public Patient getNextPatient() {
        if (getPatientsQue().size() == 0) {
            return null;
        }
        ListIterator<Patient> iterator = getPatientsQue().listIterator();
        return iterator.next() ;

    }
}

package Task1;

import Task1.AbstractFantasy;
import Task1.Dream;

public abstract class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Younis Mirani";



    @Override
    public String toString() {
        String result = "Fanstasy created by" + studentName;

        // TODO must be implemented
        return result;
    }
}

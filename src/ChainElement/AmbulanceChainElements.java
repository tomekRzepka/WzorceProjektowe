package ChainElement;

/**
 * Created by RENT on 2017-06-02.
 */
public class AmbulanceChainElements implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber==999;
    }

    @Override
    public void doAction() {
        System.out.println("Calling ");
    }
}

package ChainElement;

/**
 * Created by RENT on 2017-06-02.
 */
public class FirefightersChainelemnt implements ChainElement{
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber==998;
    }

    @Override
    public void doAction() {
        System.out.println("Calling Firefighters");
    }
}

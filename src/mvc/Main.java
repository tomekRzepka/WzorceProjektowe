package mvc;

/**
 * Created by RENT on 2017-06-06.
 */
public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handle("home json");
    }
}

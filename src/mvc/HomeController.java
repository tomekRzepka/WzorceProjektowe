package mvc;

import builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class HomeController implements Controller {
    @Override
    public Object handle() {
        return new User("Tomek","Rzepka","12345678987655",27);
    }
}

package mvc;

import builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class AboutContorler implements Controller {
    @Override
    public Object handle() {
        return new User("Andrzej","Janusz","009879187986076",33);
    }
}

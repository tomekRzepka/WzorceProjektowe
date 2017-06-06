package mvc;

import builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class HTMLview implements View<User> {
    @Override
    public String home(User model) {
        return new StringBuilder()
                .append("<h1>" + model.getFirstName()+" "+model.getLastName()+ "</h1>\n")
                .append("<h3> Age" + model.getAge()+"</h3>\n")
                .append("<p>PhoneNumber : " + model.getPhoneNumber()+"<p>\n")
                .toString();
    }
}

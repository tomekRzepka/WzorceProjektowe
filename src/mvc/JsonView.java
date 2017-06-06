package mvc;

import builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class JsonView  implements View<User>{
    @Override
    public String home(User model) {
        return new  StringBuilder()
                .append("{\n")
                .append("firstName: \""+model.getFirstName()+"\",\n")
                .append("lastName: \""+model.getLastName()+"\",\n")
                .append("phoneNumber: \""+model.getPhoneNumber()+"\",\n")
                .append("age: \""+model.getAge()+"\n")
                .append("}").toString();

    }
}

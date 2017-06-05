package builder;

import lombok.Builder;
import lombok.Data;
@Data
@Builder

/**
 * Created by RENT on 2017-06-05.
 */
public class User {


    private String firstName;

    private String lastName;
    private String phoneNumber;
    private int age;


}

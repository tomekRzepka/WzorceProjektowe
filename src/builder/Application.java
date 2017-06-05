package builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    public static void main(String[] args) {
//        User user= new User();
//        user.setFirstName("Tomek");
//        user.setLastName("Rzepka");
//        user.setPhoneNumber("1234567890");
//        user.setAge(27);

        User user = User.builder()
                .firstName("Ola")
                .lastName("Zyto")
                .age(18)
                .phoneNumber("123454321")
                .build();
        System.out.println(user);

    }
}

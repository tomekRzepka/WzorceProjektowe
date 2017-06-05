package dao;

import builder.User;

import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class UserDaoInMemory implements UserDao {
    private List<User> users;
    public UserDaoInMemory(){
        users.add(User.builder()
                        .firstName("Michal")
                        .lastName("Nowak")
                        .age(23)
                        .phoneNumber("12332351541")
                        .build());
        users.add(User.builder()
                .firstName("Tomek")
                .lastName("Maka")
                .age(23)
                .phoneNumber("1213123151541")
                .build());



    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

package dao;

import builder.User;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class Main {
    private static final String PATH="C:\\Users\\RENT\\IdeaProjects\\DesignPatterns\\src\\dao\\user";
    public static void main(String[] args) {

        UserDao userDao= new UserDaoInFile(new File(PATH));
        userDao.addUser(User.builder()
                        .firstName("Michal")
                        .lastName("Nowak")
                        .age(23)
                        .phoneNumber("12332351541")
                        .build());
        List<User> allUsers= userDao.getAllUsers();
        allUsers.forEach(e-> System.out.println(e));
        allUsers.forEach(System.out::println);
    }
}

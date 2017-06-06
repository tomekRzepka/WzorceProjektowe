package dao;

import builder.User;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        System.out.println("List");

        List<List<String>> nameList= Arrays.asList(Arrays.asList("Wiktot","Szymon","Adam"),Arrays.asList("Agnieszka","Antonina","Marysia"));
        nameList.stream()
                .flatMap(e->e.stream())
                .filter(e-> e.startsWith("A"))
                .forEach(e-> System.out.println(e));

        System.out.println("Map");

        Map<String,List<String>> map = new HashMap<>();
        map.put("men",Arrays.asList("Szymek","Romek", "Artur"));
        map.put("woman", Arrays.asList("Agnieszka","Antosia","Angela"));
        map.entrySet()
                .stream()
                .flatMap(e->e.getValue().stream())
                .filter(UserPredicateFactory.nameStarsWith("A"))
                .forEach(e-> System.out.println(e));

    }
}

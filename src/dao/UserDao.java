package dao;

import builder.User;
import java.util.List;
/**
 * Created by RENT on 2017-06-05.
 */
public interface UserDao {
   List<User> getAllUsers();
   void addUser(User user);

}

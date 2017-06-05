package dao;

import builder.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RENT on 2017-06-05.
 */
public class UserDaoInFile implements UserDao {

    private File file;

    public UserDaoInFile(File file){
        this.file= file;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            UserMapper userMapper= new UserMapper();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                users.add(userMapper.map(line));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public void addUser(User user) {
        try(FileWriter fw= new FileWriter(file,true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
            out.println();
         }catch(IOException e){
                e.printStackTrace();
        }
    }
}

package mvc;

import builder.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-06-06.
 */
public class FrontController {
    private Map<String,Controller> controllers;
    private Map<String,View> views;

    public FrontController(){
        controllers= new HashMap<>();
        views=new HashMap<>();

        setupControllers();
        setupViews();

    }

    private void setupViews() {
        views.put("json", new JsonView());
        views.put("html", new HTMLview());
    }

    private void setupControllers(){
        controllers.put("home", new HomeController());
    }
    // handle ("home.json")
    public void handle (String value){
        String[] split = value.split(" ");
        Object object;
        if(controllers.containsKey(split[0])){
            //1, Wybieramy controller i wywolujemy jego methode ktora zwraca obiekt
            Controller controller= controllers.get(split[0]);
             object = controller.handle();
             //2.wywolujemy widok
            if(views.containsKey(split[1])){
                View<User> view = views.get(split[1]);
                System.out.println(view.home((User) object));
            }

        }else {
            System.out.println("Controler for "+ split[0]+"not found");
        }
    }



}

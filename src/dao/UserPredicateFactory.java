package dao;

import java.util.function.Predicate;

/**
 * Created by RENT on 2017-06-06.
 */
public class UserPredicateFactory {
    public static Predicate<String> nameStarsWith(String prefix){
        //lambda - anonimowa implementacja interfejsu z jedną metodą
//        return new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        };
        return (e)->e.startsWith(prefix);
    }
}

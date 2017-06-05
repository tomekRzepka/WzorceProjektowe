package builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class User {
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    private String lastName;
    private String phoneNumber;
    private int age;
    public  static UserBuilder builder(){
        return new UserBuilder();

    }
    public  static class UserBuilder{
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private int age;
        public UserBuilder firstName (String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName (String lastName ){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder phoneNumber (String phoneNumber ){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder age (int age){
            this.age = age;
            return  this;
        }

        public User build(){
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setPhoneNumber(phoneNumber);
            user.setAge(age);
            return user;
        }
    }

}

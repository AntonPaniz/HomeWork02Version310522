package src.com.vivamostoles.homework03;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String surname;

    User user = new User(45648, "ozzy", "osbourne");
    User user1 = new User(98898, "lavon", "volski");
    User user2 = new User(667, "lubov", "ivanovna");
    User user3 = new User(3213215, "pablo", "picasso");
    User user4 = new User(12188, "leo", "messi");
    User user5 = new User(1596985, "iosif", "stalvin");
    User user6 = new User(132154987, "elton", "john");

    private List <User> userFriends = new ArrayList<>();
    userFriends.add(user);





    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}}

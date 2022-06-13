package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.User;
import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.service.PatronymicNamesList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGeneration {
    public static List<User> generation(int numberOfUsersToMake) {
    List<User> users01Friends = new ArrayList(numberOfUsersToMake);
    String [] userSurName = AuthorLastNamesList.lastNames;
    String [] userName = AuthorFirstNamesList.firstNames;

    for (int i = 0; i <numberOfUsersToMake; i++){
        int randomValueOfUserSurName = new Random().nextInt(userName.length);
        int randomValueOfUserName = new Random().nextInt(userName.length);
        Random rand = new Random();
        int valueToImproveVariety = 15000;
        int valueSizeOfVariety = 10;
        long randomValueOfUserID = rand.nextLong(valueSizeOfVariety)*valueToImproveVariety;
        User userFromGenerator = new User(randomValueOfUserID, userName[randomValueOfUserName],
                userSurName[randomValueOfUserSurName]);
        users01Friends.add(userFromGenerator);
        //System.out.println(userFromGenerator);
    }
    return users01Friends;

}

          public static void objectUserGeneration (int countOfUserToCreat){




}
}

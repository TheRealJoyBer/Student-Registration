package academy;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<String[]> users = new ArrayList<>();
    
    private UserData() {}

    // Add full row from table (13 columns)
    public static void addUser(String[] userRow) {
        users.add(userRow);
    }

    // Validate login using username and password
    public static boolean validateUser(String username, String password) {
        for (String[] user : users) {
            // username = column 10, password = column 12 (0-indexed)
            if (user[10].equals(username) && user[12].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
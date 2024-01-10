package creational.builder;

import java.util.List;

public class UserProfileService {

    public UserProfile getUserProfile(String username, boolean detailed) {
        UserProfileBuilder builder = new UserProfileBuilder("Mohammad Ali", username);

        builder.email("m.ali@example.com");

        if (detailed) {
            builder.friends(getUserFriends(username));
        }

        return builder.build();
    }

    private List<String> getUserFriends(String username) {
        return List.of("Mike Tyson", "Malcolm X");
    }
}

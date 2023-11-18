import java.util.ArrayList;
import java.util.List;

public class DatingApp {
    private List<Profile> profiles;

    public DatingApp() {
        profiles = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public List<Profile> searchFriends(String interest) {
        List<Profile> friends = new ArrayList<>();
        for (Profile profile : profiles) {
            if (profile.getInterests().contains(interest)) {
                friends.add(profile);
            }
        }
        return friends;
    }

    public List<Profile> matchMaking() {
        List<Profile> matches = new ArrayList<>();
        for (Profile profile : profiles) {
            if (profile.getInterests().contains("marriage") && profile.getContacts().contains("single")) {
                matches.add(profile);
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        DatingApp app = new DatingApp();

        // Создаем несколько профилей
        Profile profile1 = new Profile("John", "photo1.jpg", List.of("music", "movies"), List.of("email1@example.com", "phone1"));
        Profile profile2 = new Profile("Alice", "photo2.jpg", List.of("books", "games"), List.of("email2@example.com", "phone2"));
        Profile profile3 = new Profile("Bob", "photo3.jpg", List.of("music", "sports"), List.of("email3@example.com", "phone3"));
        Profile profile4 = new Profile("Eva", "photo4.jpg", List.of("movies", "sports"), List.of("email4@example.com", "phone4"));

        // Добавляем профили в приложение
        app.addProfile(profile1);
        app.addProfile(profile2);
        app.addProfile(profile3);
        app.addProfile(profile4);

        // Поиск друзей по интересам
        List<Profile> friends = app.searchFriends("music");
        System.out.println("Friends who like music:");
        for (Profile friend : friends) {
            System.out.println(friend.getName());
        }

        // Брачные знакомства
        List<Profile> matches = app.matchMaking();
        System.out.println("Matches for marriage:");
        for (Profile match : matches) {
            System.out.println(match.getName());
        }
    }
}

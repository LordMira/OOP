import java.util.ArrayList;
import java.util.List;

class Profile {
    private String name;
    private String photo;
    private List<String> interests;
    private List<String> contacts;

    public Profile(String name, String photo, List<String> interests, List<String> contacts) {
        this.name = name;
        this.photo = photo;
        this.interests = interests;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public List<String> getInterests() {
        return interests;
    }

    public List<String> getContacts() {
        return contacts;
    }
}


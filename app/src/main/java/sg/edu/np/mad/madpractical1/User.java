package sg.edu.np.mad.madpractical1;

import java.io.Serializable;

public class User implements Serializable {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User() {

    }

    public User(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isFollowed() {
        return Followed;
    }

    public void setFollowed(boolean followed) {
        Followed = followed;
    }
}

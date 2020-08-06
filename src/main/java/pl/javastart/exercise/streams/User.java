package pl.javastart.exercise.streams;

public class User {

    private String name;
    private int age;
    private String nickname;

    public User(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        User user = (User) o;

        if (age != user.age)
            return false;
        if (!name.equals(user.name))
            return false;
        return nickname.equals(user.nickname);
    }

    @Override public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + nickname.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

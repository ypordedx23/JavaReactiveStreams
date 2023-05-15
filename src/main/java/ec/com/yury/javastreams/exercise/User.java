package ec.com.yury.javastreams.exercise;

public class User {
    Integer number;
    String userName;
    String userLastName;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public User(Integer number, String userName, String userLastName) {
        this.number = number;
        this.userName = userName;
        this.userLastName = userLastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }
}

package Main;

/**
 * Класс "Пользователь", который хранит в себе id, пароль и логин пользователя
 */
public class User {

    /**
     * id пользователя
     */
    private int id;
    /**
     * Логин
     */
    private String name;
    /**
     * Пароль
     */
    private String password;

    /**
     * Конструктор
     * @param id id
     * @param name Логин
     * @param password Пароль
     */
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setLogin(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}

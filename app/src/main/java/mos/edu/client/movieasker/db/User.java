package mos.edu.client.movieasker.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    private int globalId;
    /** Not-null value. */
    private String login;
    /** Not-null value. */
    private String password;
    /** Not-null value. */
    private String email;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, int globalId, String login, String password, String email) {
        this.id = id;
        this.globalId = globalId;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGlobalId() {
        return globalId;
    }

    public void setGlobalId(int globalId) {
        this.globalId = globalId;
    }

    /** Not-null value. */
    public String getLogin() {
        return login;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLogin(String login) {
        this.login = login;
    }

    /** Not-null value. */
    public String getPassword() {
        return password;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPassword(String password) {
        this.password = password;
    }

    /** Not-null value. */
    public String getEmail() {
        return email;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setEmail(String email) {
        this.email = email;
    }

}

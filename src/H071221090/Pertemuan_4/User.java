package H071221090.Pertemuan_4;

public class User {
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    User (String username, String password) {
        this.username = username;
        this.password = password;
    }
}

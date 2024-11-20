// Sistem Login
class Petani {
    private String username;
    private String password;

    public Petani(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String usernameInput, String passwordInput) {
        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }
}

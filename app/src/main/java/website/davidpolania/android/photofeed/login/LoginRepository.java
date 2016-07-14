package website.davidpolania.android.photofeed.login;

/**
 * Created by DavidPolania.
 */
public interface LoginRepository {
    void signUp(final String email, final String password);
    void signIn(String email, String password);
}

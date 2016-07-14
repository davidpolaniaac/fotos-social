package website.davidpolania.android.photofeed.login;

import website.davidpolania.android.photofeed.login.events.LoginEvent;

/**
 * Created by DavidPolania.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onEventMainThread(LoginEvent event);
    void login(String email, String password);
    void registerNewUser(String email, String password);
}

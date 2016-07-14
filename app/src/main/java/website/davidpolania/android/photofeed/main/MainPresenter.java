package website.davidpolania.android.photofeed.main;

import android.location.Location;

import website.davidpolania.android.photofeed.main.events.MainEvent;

/**
 * Created by DavidPolania.
 */
public interface MainPresenter {
    void onCreate();
    void onDestroy();

    void logout();
    void uploadPhoto(Location location, String path);
    void onEventMainThread(MainEvent event);
}

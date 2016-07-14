package website.davidpolania.android.photofeed.main;

import android.location.Location;

/**
 * Created by DavidPolania.
 */
public interface MainRepository {
    void logout();
    void uploadPhoto(Location location, String path);
}

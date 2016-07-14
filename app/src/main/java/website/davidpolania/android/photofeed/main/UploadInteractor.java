package website.davidpolania.android.photofeed.main;

import android.location.Location;

/**
 * Created by DavidPolania.
 */
public interface UploadInteractor {
    void execute(Location location, String path);
}

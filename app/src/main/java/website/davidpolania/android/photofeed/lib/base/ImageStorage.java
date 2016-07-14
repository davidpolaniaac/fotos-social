package website.davidpolania.android.photofeed.lib.base;

import java.io.File;

/**
 * Created by DavidPolania.
 */
public interface ImageStorage {
    String getImageUrl(String id);
    void upload(File file, String id, ImageStorageFinishedListener listener);
}

package website.davidpolania.android.photofeed.lib.base;

/**
 * Created by DavidPolania.
 */
public interface ImageStorageFinishedListener {
    void onSuccess();
    void onError(String error);
}

package website.davidpolania.android.photofeed.main.ui;

/**
 * Created by DavidPolania.
 */
public interface MainView {
    void onUploadInit();
    void onUploadComplete();
    void onUploadError(String error);
}

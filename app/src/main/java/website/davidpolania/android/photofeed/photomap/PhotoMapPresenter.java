package website.davidpolania.android.photofeed.photomap;

import website.davidpolania.android.photofeed.photomap.events.PhotoMapEvent;

/**
 * Created by DavidPolania.
 */
public interface PhotoMapPresenter {
    void onCreate();
    void onDestroy();

    void subscribe();
    void unsubscribe();

    void onEventMainThread(PhotoMapEvent event);
}

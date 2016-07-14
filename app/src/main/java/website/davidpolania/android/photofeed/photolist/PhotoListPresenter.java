package website.davidpolania.android.photofeed.photolist;

import website.davidpolania.android.photofeed.entities.Photo;
import website.davidpolania.android.photofeed.photolist.events.PhotoListEvent;

/**
 * Created by DavidPolania.
 */
public interface PhotoListPresenter {
    void onCreate();
    void onDestroy();

    void subscribe();
    void unsubscribe();

    void removePhoto(Photo photo);
    void onEventMainThread(PhotoListEvent event);
}

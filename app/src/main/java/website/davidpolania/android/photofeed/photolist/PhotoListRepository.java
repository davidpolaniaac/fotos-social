package website.davidpolania.android.photofeed.photolist;

import website.davidpolania.android.photofeed.entities.Photo;

/**
 * Created by DavidPolania.
 */
public interface PhotoListRepository {
    void subscribe();
    void unsubscribe();
    void remove(Photo photo);
}

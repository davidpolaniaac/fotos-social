package website.davidpolania.android.photofeed.photolist;

import website.davidpolania.android.photofeed.entities.Photo;

/**
 * Created by DavidPolania.
 */
public interface PhotoListInteractor {
    void subscribe();
    void unsubscribe();
    void removePhoto(Photo photo);
}

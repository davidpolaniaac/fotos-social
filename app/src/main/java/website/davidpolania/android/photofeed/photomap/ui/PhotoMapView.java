package website.davidpolania.android.photofeed.photomap.ui;

import website.davidpolania.android.photofeed.entities.Photo;

/**
 * Created by DavidPolania.
 */
public interface PhotoMapView {
    void addPhoto(Photo photo);
    void removePhoto(Photo photo);
    void onPhotosError(String error);
}

package website.davidpolania.android.photofeed.photolist.ui;

import website.davidpolania.android.photofeed.entities.Photo;

/**
 * Created by DavidPolania.
 */
public interface PhotoListView {
    void showList();
    void hideList();
    void showProgress();
    void hideProgress();

    void addPhoto(Photo photo);
    void removePhoto(Photo photo);
    void onPhotosError(String error);
}

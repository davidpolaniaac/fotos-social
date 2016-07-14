package website.davidpolania.android.photofeed.photolist.ui.adapters;

import android.widget.ImageView;

import website.davidpolania.android.photofeed.entities.Photo;

/**
 * Created by DavidPolania.
 */
public interface OnItemClickListener {
    void onPlaceClick(Photo photo);
    void onShareClick(Photo photo, ImageView img);
    void onDeleteClick(Photo photo);
}

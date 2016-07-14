package website.davidpolania.android.photofeed.photomap;

import org.greenrobot.eventbus.Subscribe;

import website.davidpolania.android.photofeed.lib.base.EventBus;
import website.davidpolania.android.photofeed.photolist.events.PhotoListEvent;
import website.davidpolania.android.photofeed.photomap.events.PhotoMapEvent;
import website.davidpolania.android.photofeed.photomap.ui.PhotoMapView;

/**
 * Created by DavidPolania.
 */
public class PhotoMapPresenterImpl implements PhotoMapPresenter {
    EventBus eventBus;
    PhotoMapView view;
    PhotoMapInteractor interactor;

    public PhotoMapPresenterImpl(EventBus eventBus, PhotoMapView view, PhotoMapInteractor interactor) {
        this.eventBus = eventBus;
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        this.view = null;
        eventBus.unregister(this);
    }

    @Override
    public void subscribe() {
        interactor.subscribe();
    }

    @Override
    public void unsubscribe() {
        interactor.unsubscribe();
    }

    @Override
    @Subscribe
    public void onEventMainThread(PhotoMapEvent event) {
        if (this.view != null) {
            String error = event.getError();
            if (error != null) {
                view.onPhotosError(error);
            } else {
                if (event.getType() == PhotoListEvent.READ_EVENT) {
                    view.addPhoto(event.getPhoto());
                } else if (event.getType() == PhotoListEvent.DELETE_EVENT) {
                    view.removePhoto(event.getPhoto());
                }
            }
        }
    }
}

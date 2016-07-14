package website.davidpolania.android.photofeed.photomap.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import website.davidpolania.android.photofeed.domain.FirebaseAPI;
import website.davidpolania.android.photofeed.lib.base.EventBus;
import website.davidpolania.android.photofeed.photomap.PhotoMapInteractor;
import website.davidpolania.android.photofeed.photomap.PhotoMapInteractorImpl;
import website.davidpolania.android.photofeed.photomap.PhotoMapPresenter;
import website.davidpolania.android.photofeed.photomap.PhotoMapPresenterImpl;
import website.davidpolania.android.photofeed.photomap.PhotoMapRepository;
import website.davidpolania.android.photofeed.photomap.PhotoMapRepositoryImpl;
import website.davidpolania.android.photofeed.photomap.ui.PhotoMapView;

/**
 * Created by DavidPolania.
 */
@Module
public class PhotoMapModule {
    PhotoMapView view;

    public PhotoMapModule(PhotoMapView view) {
        this.view = view;
    }

    @Provides @Singleton
    PhotoMapView providesPhotoContentView() {
        return this.view;
    }

    @Provides @Singleton
    PhotoMapPresenter providesPhotoContentPresenter(EventBus eventBus, PhotoMapView view, PhotoMapInteractor listInteractor) {
        return new PhotoMapPresenterImpl(eventBus, view, listInteractor);
    }

    @Provides @Singleton
    PhotoMapInteractor providesPhotoContentInteractor(PhotoMapRepository repository) {
        return new PhotoMapInteractorImpl(repository);
    }

    @Provides @Singleton
    PhotoMapRepository providesPhotoContentRepository(FirebaseAPI firebase, EventBus eventBus) {
        return new PhotoMapRepositoryImpl(firebase, eventBus);
    }
}

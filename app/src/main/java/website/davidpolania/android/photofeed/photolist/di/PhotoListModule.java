package website.davidpolania.android.photofeed.photolist.di;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import website.davidpolania.android.photofeed.domain.FirebaseAPI;
import website.davidpolania.android.photofeed.domain.Util;
import website.davidpolania.android.photofeed.entities.Photo;
import website.davidpolania.android.photofeed.lib.base.EventBus;
import website.davidpolania.android.photofeed.lib.base.ImageLoader;
import website.davidpolania.android.photofeed.photolist.PhotoListInteractor;
import website.davidpolania.android.photofeed.photolist.PhotoListInteractorImpl;
import website.davidpolania.android.photofeed.photolist.PhotoListPresenter;
import website.davidpolania.android.photofeed.photolist.PhotoListPresenterImpl;
import website.davidpolania.android.photofeed.photolist.PhotoListRepository;
import website.davidpolania.android.photofeed.photolist.PhotoListRepositoryImpl;
import website.davidpolania.android.photofeed.photolist.ui.PhotoListView;
import website.davidpolania.android.photofeed.photolist.ui.adapters.OnItemClickListener;
import website.davidpolania.android.photofeed.photolist.ui.adapters.PhotoListAdapter;

/**
 * Created by DavidPolania.
 */
@Module
public class PhotoListModule {
    PhotoListView view;
    OnItemClickListener onItemClickListener;

    public PhotoListModule(PhotoListView view, OnItemClickListener onItemClickListener) {
        this.view = view;
        this.onItemClickListener = onItemClickListener;
    }

    @Provides @Singleton
    PhotoListView providesPhotoContentView() {
        return this.view;
    }

    @Provides @Singleton
    PhotoListPresenter providesPhotoListPresenter(EventBus eventBus, PhotoListView view, PhotoListInteractor listInteractor) {
        return new PhotoListPresenterImpl(eventBus, view, listInteractor);
    }

    @Provides @Singleton
    PhotoListInteractor providesPhotoListInteractor(PhotoListRepository repository) {
        return new PhotoListInteractorImpl(repository);
    }

    @Provides @Singleton
    PhotoListRepository providesPhotoListRepository(FirebaseAPI firebase, EventBus eventBus) {
        return new PhotoListRepositoryImpl(firebase, eventBus);
    }

    @Provides @Singleton
    PhotoListAdapter providesPhotosAdapter(Util utils, List<Photo> photoList, ImageLoader imageLoader, OnItemClickListener onItemClickListener) {
        return new PhotoListAdapter(utils, photoList, imageLoader, onItemClickListener);
    }

    @Provides @Singleton
    OnItemClickListener providesOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Provides @Singleton
    List<Photo> providesPhotosList() {
        return new ArrayList<Photo>();
    }

}

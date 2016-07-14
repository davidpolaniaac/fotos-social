package website.davidpolania.android.photofeed.photolist.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;
import website.davidpolania.android.photofeed.domain.di.DomainModule;
import website.davidpolania.android.photofeed.lib.di.LibsModule;
import website.davidpolania.android.photofeed.photolist.ui.PhotoListFragment;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {PhotoListModule.class, DomainModule.class, LibsModule.class, PhotoFeedAppModule.class})
public interface PhotoListComponent {
    void inject(PhotoListFragment fragment);
}

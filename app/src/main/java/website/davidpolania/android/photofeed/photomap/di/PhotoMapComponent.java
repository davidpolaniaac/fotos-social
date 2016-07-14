package website.davidpolania.android.photofeed.photomap.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;
import website.davidpolania.android.photofeed.domain.di.DomainModule;
import website.davidpolania.android.photofeed.lib.di.LibsModule;
import website.davidpolania.android.photofeed.photomap.ui.PhotoMapFragment;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {PhotoMapModule.class, DomainModule.class, LibsModule.class, PhotoFeedAppModule.class})
public interface PhotoMapComponent {
    void inject(PhotoMapFragment fragment);
}

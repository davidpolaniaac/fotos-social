package website.davidpolania.android.photofeed.lib.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {LibsModule.class, PhotoFeedAppModule.class})
public interface LibsComponent {
}

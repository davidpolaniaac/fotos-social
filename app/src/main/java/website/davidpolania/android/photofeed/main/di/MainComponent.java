package website.davidpolania.android.photofeed.main.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;
import website.davidpolania.android.photofeed.domain.di.DomainModule;
import website.davidpolania.android.photofeed.lib.di.LibsModule;
import website.davidpolania.android.photofeed.main.ui.MainActivity;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {MainModule.class, DomainModule.class, LibsModule.class, PhotoFeedAppModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}

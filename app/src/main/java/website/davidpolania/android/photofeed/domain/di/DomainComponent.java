package website.davidpolania.android.photofeed.domain.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {DomainModule.class, PhotoFeedAppModule.class})
public interface DomainComponent {
}

package website.davidpolania.android.photofeed.login.di;

import javax.inject.Singleton;

import dagger.Component;
import website.davidpolania.android.photofeed.PhotoFeedAppModule;
import website.davidpolania.android.photofeed.domain.di.DomainModule;
import website.davidpolania.android.photofeed.lib.di.LibsModule;
import website.davidpolania.android.photofeed.login.ui.LoginActivity;

/**
 * Created by DavidPolania.
 */
@Singleton
@Component(modules = {LoginModule.class, DomainModule.class, LibsModule.class, PhotoFeedAppModule.class})
public interface LoginComponent {
    void inject(LoginActivity activity);
}

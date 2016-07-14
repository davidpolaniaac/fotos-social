package website.davidpolania.android.photofeed.login.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import website.davidpolania.android.photofeed.domain.FirebaseAPI;
import website.davidpolania.android.photofeed.lib.base.EventBus;
import website.davidpolania.android.photofeed.login.LoginInteractor;
import website.davidpolania.android.photofeed.login.LoginInteractorImpl;
import website.davidpolania.android.photofeed.login.LoginPresenter;
import website.davidpolania.android.photofeed.login.LoginPresenterImpl;
import website.davidpolania.android.photofeed.login.LoginRepository;
import website.davidpolania.android.photofeed.login.LoginRepositoryImpl;
import website.davidpolania.android.photofeed.login.SignupInteractor;
import website.davidpolania.android.photofeed.login.SignupInteractorImpl;
import website.davidpolania.android.photofeed.login.ui.LoginView;

/**
 * Created by DavidPolania.
 */
@Module
public class LoginModule {
    LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides @Singleton
    LoginView providesLoginView() {
        return this.view;
    }

    @Provides @Singleton
    LoginPresenter providesLoginPresenter(EventBus eventBus, LoginView loginView, LoginInteractor loginInteractor, SignupInteractor signupInteractor) {
        return new LoginPresenterImpl(eventBus, loginView, loginInteractor, signupInteractor);
    }

    @Provides @Singleton
    LoginInteractor providesLoginInteractor(LoginRepository repository) {
        return new LoginInteractorImpl(repository);
    }

    @Provides @Singleton
    SignupInteractor providesSignupInteractor(LoginRepository repository) {
        return new SignupInteractorImpl(repository);
    }

    @Provides @Singleton
    LoginRepository providesLoginRepository(FirebaseAPI firebase, EventBus eventBus) {
        return new LoginRepositoryImpl(firebase, eventBus);
    }
}

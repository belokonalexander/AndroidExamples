package ru.belokonalexander.androidexamples.MVP.DaggerTools;

import dagger.Module;
import dagger.Provides;
import ru.belokonalexander.androidexamples.MVP.Models.User;
import ru.belokonalexander.androidexamples.MVP.Presenters.UserPresenter;
import ru.belokonalexander.androidexamples.MVP.UserContract;

/**
 * Created by Alexander on 20.04.2017.
 */

@Module
public class PresenterModule {

    private final UserContract.View view;

    private final User user;

    public PresenterModule(UserContract.View view, User user) {
        this.view = view;
        this.user = user;
    }

    @Provides
    UserContract.View provideTaskDetailContractView() {
        return view;
    }

    @Provides
    User provideUser() {
        return user;
    }

   /* @Provides
    UserContract.Presenter providePresenter(){
        return new UserPresenter(user,view);
    }*/

}

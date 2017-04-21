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

    public PresenterModule(UserContract.View view) {
        this.view = view;
    }

    @Provides
    UserContract.View provideTaskDetailContractView() {
        return view;
    }

    @Provides
    User provideUser() {
        return new User("Test", 18);
    }


}

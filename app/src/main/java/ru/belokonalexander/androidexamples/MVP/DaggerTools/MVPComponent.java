package ru.belokonalexander.androidexamples.MVP.DaggerTools;

import dagger.Component;
import ru.belokonalexander.androidexamples.MVP.MVPUser;
import ru.belokonalexander.androidexamples.MVP.Models.User;
import ru.belokonalexander.androidexamples.MVP.UserContract;

/**
 * Created by Alexander on 20.04.2017.
 */

@Component(modules = {PresenterModule.class, TestModule.class})
public interface MVPComponent {
    void inject(MVPUser mvpUserActivity);
}

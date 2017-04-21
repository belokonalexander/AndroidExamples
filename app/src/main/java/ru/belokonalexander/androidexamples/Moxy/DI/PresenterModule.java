package ru.belokonalexander.androidexamples.Moxy.DI;

import dagger.Module;
import dagger.Provides;
import ru.belokonalexander.androidexamples.MVP.Models.User;

/**
 * Created by Alexander on 21.04.2017.
 */

@Module
public class PresenterModule {

    @Provides
    User getUser(){
        return new User("Test",18);
    }

}

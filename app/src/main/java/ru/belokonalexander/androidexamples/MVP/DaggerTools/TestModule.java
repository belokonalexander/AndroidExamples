package ru.belokonalexander.androidexamples.MVP.DaggerTools;

import dagger.Module;
import dagger.Provides;
import ru.belokonalexander.androidexamples.MVP.Models.User;
import ru.belokonalexander.androidexamples.MVP.UserContract;

/**
 * Created by Alexander on 20.04.2017.
 */

@Module
public class TestModule {



    @Provides
    String provideTaskDetailContractView() {
        return "Hello";
    }




}

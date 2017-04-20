package ru.belokonalexander.androidexamples.MVP.DaggerTools;

import dagger.Subcomponent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import ru.belokonalexander.androidexamples.MVP.MVPUser;

/**
 * Created by Alexander on 20.04.2017.
 */

@Subcomponent
public interface MVPUserSubcomponent extends AndroidInjector<MVPUser>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MVPUser> {};

}

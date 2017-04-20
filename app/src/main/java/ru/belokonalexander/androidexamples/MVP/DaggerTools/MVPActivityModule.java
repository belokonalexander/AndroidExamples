package ru.belokonalexander.androidexamples.MVP.DaggerTools;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ru.belokonalexander.androidexamples.MVP.MVPUser;

/**
 * Created by Alexander on 20.04.2017.
 */

@Module(subcomponents = {MVPUserSubcomponent.class})
public abstract class MVPActivityModule  {
    @Binds
    @IntoMap
    @ActivityKey(MVPUser.class)
    abstract AndroidInjector.Factory<? extends Activity> bindYourActivityInjectorFactory(MVPUserSubcomponent.Builder builder);
}

package ru.belokonalexander.androidexamples.Moxy.DI;

import ru.belokonalexander.androidexamples.Moxy.Presenter;

/**
 * Created by Alexander on 21.04.2017.
 */
@dagger.Component(modules = {PresenterModule.class})
public interface Component {
    void inject(Presenter presenter);
}

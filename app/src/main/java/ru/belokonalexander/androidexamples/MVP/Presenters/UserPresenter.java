package ru.belokonalexander.androidexamples.MVP.Presenters;



import javax.inject.Inject;

import GS.StaticHelpers;
import ru.belokonalexander.androidexamples.MVP.Models.User;
import ru.belokonalexander.androidexamples.MVP.UserContract;

/**
 * Created by Alexander on 20.04.2017.
 */

public class UserPresenter implements UserContract.Presenter {

    //связь с моделью
    private User user;

    //связь с интерфейсом вью
    private  UserContract.View view;

    @Inject
    public UserPresenter(User user, UserContract.View view) {
        this.user = user;
        this.view = view;
    }

    @Override
    public void saveName(String name) {
        StaticHelpers.LogThis("saving ... ");
        user.setName(name);
        view.showMessage("Your name is " + name);
    }

    @Override
    public void saveAge(int age) {
        if(age>0 && age < 120) {
            user.setAge(age);
            view.showMessage("Your age is " + age);
        } else
            view.showMessage("Incorrect age");
    }

    @Override
    public void sendMessage() {

        StaticHelpers.LogThis("sending ... ");
        view.showError(new UnsupportedOperationException("В данный момент операция не поддерживается"));
    }
}

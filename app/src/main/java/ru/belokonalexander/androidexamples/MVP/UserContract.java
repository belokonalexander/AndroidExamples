package ru.belokonalexander.androidexamples.MVP;

/**
 * Created by Alexander on 20.04.2017.
 */

public interface UserContract {


    interface View {
        void showMessage(String msg);
        void showError(Exception e);
    }

    interface Presenter {
        void saveName(String name);
        void saveAge(int age);
        void sendMessage();
    }

}

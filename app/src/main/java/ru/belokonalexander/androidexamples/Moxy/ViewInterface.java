package ru.belokonalexander.androidexamples.Moxy;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Alexander on 21.04.2017.
 */

public interface ViewInterface extends MvpView{

    void showMessage(String message);

    void showTimer();

    void hideTimer();

    void setTimer(int time);
}

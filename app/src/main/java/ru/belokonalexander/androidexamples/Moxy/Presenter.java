package ru.belokonalexander.androidexamples.Moxy;

import android.os.AsyncTask;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import javax.inject.Inject;

import ru.belokonalexander.androidexamples.MVP.DaggerTools.DaggerMVPComponent;
import ru.belokonalexander.androidexamples.MVP.Models.User;
import ru.belokonalexander.androidexamples.Moxy.DI.DaggerComponent;

/**
 * Created by Alexander on 21.04.2017.
 */

@InjectViewState
public class Presenter extends MvpPresenter<ViewInterface> {

    @Inject
    User user;

    public Presenter() {

        DaggerComponent.create().inject(this);

        getViewState().showTimer();
        new AsyncTask<Void, Integer, Void>() {
            @Override
            protected Void doInBackground(Void... params) {

                for(int i =0; i < 2; i++) {
                    publishProgress(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                return null;
            }
            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                //getViewState().hideTimer();
                getViewState().showMessage(user.toString());

            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                getViewState().setTimer(values[0]);
            }
        }.execute();
    }

    public void getResponse() {
        getViewState().showMessage("Привет от Moxy");
    }

}

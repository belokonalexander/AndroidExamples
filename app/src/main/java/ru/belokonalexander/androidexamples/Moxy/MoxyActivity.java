package ru.belokonalexander.androidexamples.Moxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.belokonalexander.androidexamples.NavigationActivity;
import ru.belokonalexander.androidexamples.R;

public class MoxyActivity extends MvpAppCompatActivity implements  ViewInterface {
    @InjectPresenter
    Presenter presenter;

    /*@ProvidePresenter
    Presenter providePresenter(){
       return  new Presenter(8);
    }*/

    @BindView(R.id.moxy_text_view)
    TextView moxyTextView;

    @BindView(R.id.activity_moxy)
    ViewGroup activityRoot;



    @OnClick(R.id.moxy_button)
    void moxyButtonClick(){
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);
        ButterKnife.bind(this);
        moxyTextView.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {
        moxyTextView.setText(message);
    }

    @Override
    public void showTimer() {
       moxyTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideTimer() {
        moxyTextView.setVisibility(View.GONE);
    }

    @Override
    public void setTimer(int time) {
        moxyTextView.setText(String.valueOf(time));
    }
}

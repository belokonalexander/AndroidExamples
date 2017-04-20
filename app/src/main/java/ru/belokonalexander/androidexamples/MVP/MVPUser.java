package ru.belokonalexander.androidexamples.MVP;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import GS.Views.CustomEditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


import dagger.android.AndroidInjection;

import ru.belokonalexander.androidexamples.MVP.Presenters.UserPresenter;
import ru.belokonalexander.androidexamples.R;
import ru.belokonalexander.androidexamples.SampleActivity;

//MVP PATTERN

public class MVPUser extends SampleActivity implements UserContract.View {

    @Inject
    UserPresenter presenter;

    @BindView(R.id.name_edit)
    CustomEditText editText;

    @BindView(R.id.age_edit)
    CustomEditText ageText;

    @OnClick(R.id.sendMessage)
    void save(){
        presenter.sendMessage();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        ButterKnife.bind(this);

        //DaggerMVPComponent.builder().presenterModule(new PresenterModule(this,new User())).build().inject(this);


        initViews();
    }

    private void initViews() {
        editText.setOnKeyActionListener(() -> presenter.saveName(editText.getText().toString()));
        ageText.setOnKeyActionListener(() -> presenter.saveAge(Integer.valueOf(ageText.getText().toString())));
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getBaseContext()," Success! " + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(Exception e) {
        Toast.makeText(getBaseContext()," Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}

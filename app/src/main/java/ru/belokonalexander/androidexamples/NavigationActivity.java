package ru.belokonalexander.androidexamples;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import ru.belokonalexander.androidexamples.MVP.MVPUser;
import ru.belokonalexander.androidexamples.Moxy.MoxyActivity;


public class NavigationActivity extends AppCompatActivity {


    @BindView(R.id.sample_container)
    ViewGroup sampleContainer;

    Class[] samples =  new Class[]{MVPUser.class, ToolbarSample.class, MoxyActivity.class};

    LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        ButterKnife.bind(this);

        layoutInflater = (LayoutInflater ) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        for(Class sample : samples){
           View v = layoutInflater.inflate(R.layout.sample_link, null);
            Button button = (Button) v.findViewById(R.id.link_text);
            button.setText(sample.getName());

            button.setOnClickListener(v1 -> {
                Intent intent = new Intent(getBaseContext(),sample);
                startActivity(intent);

            });

            sampleContainer.addView(v);

        }

    }
}

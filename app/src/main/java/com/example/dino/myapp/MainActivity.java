package com.example.dino.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.imgView_turing)
    ImageView ImageView_turing;
    @BindView(R.id.imgView_lovelace)
    ImageView ImageView_lovelace;
    @BindView(R.id.imgView_neumann)
    ImageView ImageView_neumann;
    @BindView(R.id.imgView_wirth)
    ImageView ImageView_wirth;
    @BindView(R.id.imgView_ritchie)
    ImageView ImageView_ritchie;
    @BindView(R.id.imgView_stroustrup)
    ImageView ImageView_stroustrup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ImageView_turing.setOnClickListener(this);
        ImageView_lovelace.setOnClickListener(this);
        ImageView_neumann.setOnClickListener(this);
        ImageView_wirth.setOnClickListener(this);
        ImageView_ritchie.setOnClickListener(this);
        ImageView_stroustrup.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.imgView_turing:
                Toast.makeText(this, R.string.String_turing_quote,Toast.LENGTH_LONG).show();
                break;
            case R.id.imgView_lovelace:
                Toast.makeText(this, R.string.String_lovelace_quote,Toast.LENGTH_LONG).show();
                break;
            case R.id.imgView_neumann:
                Toast.makeText(this, R.string.String_neumann_quote,Toast.LENGTH_LONG).show();
                break;
            case R.id.imgView_wirth:
                Toast.makeText(this, R.string.String_wirth_quote,Toast.LENGTH_LONG).show();
                break;
            case R.id.imgView_ritchie:
                Toast.makeText(this, R.string.String_ritchie_quote,Toast.LENGTH_LONG).show();
                break;
            case R.id.imgView_stroustrup:
                Toast.makeText(this, R.string.String_stroustrup_quote,Toast.LENGTH_LONG).show();
                break;
        }
    }
}

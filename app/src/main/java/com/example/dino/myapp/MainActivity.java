package com.example.dino.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.imgView_turing)
    ImageView ImageView_turing;
    @BindView(R.id.imgView_lovelace)
    ImageView ImageView_lovelace;
    @BindView(R.id.imgView_neumann)
    ImageView ImageView_neumann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ImageView_turing.setOnClickListener(this);
        ImageView_lovelace.setOnClickListener(this);
        ImageView_neumann.setOnClickListener(this);
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
        }
    }
}

package edu.upc.eseiaat.pma.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.widget.TextView;

public class TitleActivity extends AppCompatActivity {

    private String title= "Aquest es el titol inicial...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        TextView title_text= (TextView) findViewById(R.id.title);
    }

    public void editTitle (View view){
        //1. Crear un 'intent'
        Intent intent= new Intent (this,EditTitleActivity.class);
       //2. Afegir parametres (dades extra) a la crida de l'activitat
        intent.putExtra("title",title);
        //3.Passar l'intent a Android perque obri l'activitat
        startActivity(intent);
    }
}

package com.edgar.Tarea3.Clases;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.edgar.Tarea3.Fragmentos.FragmentoPrimero;
import com.edgar.Tarea3.Fragmentos.FragmentoSegundo;
import com.edgar.Tarea3.R;

public class Fragmento1  extends AppCompatActivity implements FragmentoPrimero.OnFragmentInteractionListener, FragmentoSegundo.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento1);
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }

}

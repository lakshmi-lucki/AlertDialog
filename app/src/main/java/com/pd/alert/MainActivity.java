package com.pd.alert;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pd.alert.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btn1 = (Button) findViewById( R.id.btn_a1 );
        btn1.setOnClickListener( this );
        btn2 = (Button) findViewById( R.id.btn_a2 );
        btn2.setOnClickListener( this );
        btn3 = (Button) findViewById( R.id.btn_a3 );
        btn3.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        switch (view.getId()) {
            case R.id.btn_a1:
                Log.i( "Button id", "On Btn1 Clicked" );
                builder.setTitle( "Sample Alert" );
                builder.setMessage( "Alert with One Action Button" );
                builder.setPositiveButton( "ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "OK Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.show();

                break;
            case R.id.btn_a2:
                Log.i( "Button id", "On Btn2 Clicked" );
                builder.setTitle( "Sample Alert" );
                builder.setMessage( "Alert with Two Action Button" );
                builder.setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "YES Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.setNegativeButton( "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "NO Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.show();

                break;

            case R.id.btn_a3:
                Log.i( "Button id", "On Btn3 Clicked" );
                builder.setTitle( "Sample Alert" );
                builder.setMessage( "Alert with Three Action Button" );
                builder.setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "YES Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.setNegativeButton( "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "NO Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.setNeutralButton( "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( MainActivity.this, "CANCEL Button is Clicked", Toast.LENGTH_SHORT ).show();
                    }
                } );
                builder.show();

                break;


        }

    }
}
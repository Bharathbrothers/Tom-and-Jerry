package com.starks.cowsbulls;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    Button Single;
    Button Multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Single = (Button) findViewById(R.id.buttonsingle);
        Multi = (Button) findViewById(R.id.buttonmulti);
        /*
 * AlertDialog with one button.
 */
        alertOneButton();
        alertOneButton1();


        Single.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent single = new Intent(SelectActivity.this,SingleActivity.class);

                startActivity(single);
            }
        });
        Multi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent multi = new Intent(SelectActivity.this,MultiActivity.class);

                startActivity(multi);
            }
        });
    }
    public void alertOneButton(){

        new AlertDialog.Builder(SelectActivity.this)
                .setTitle("Instructions")
                .setMessage("The Main Aim Of game is guess the four distinct numbers from 0-9")
                .setPositiveButton("Got it?", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                }).show();
    }
    public void alertOneButton1(){

        new AlertDialog.Builder(SelectActivity.this)
                .setTitle("Instructions")
                .setMessage("If the count of jerry is 1,then it means you have guessed the number exactly in its position and in case of tom, it is correct number but not in position. At last to win this game ,the Jerry count should be 4 ")
                .setPositiveButton("Got it?", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                }).show();
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SelectActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
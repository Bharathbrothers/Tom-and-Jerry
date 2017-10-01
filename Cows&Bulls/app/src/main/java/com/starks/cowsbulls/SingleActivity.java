package com.starks.cowsbulls;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.stream.Collectors;

public class SingleActivity extends AppCompatActivity {

    TextView e1, e2, e3, e4;
    Button check,clear;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    private int cows = 0, bulls = 0;
    TextView cow, bull;
    int count=0,clearcount=0;
    ArrayList<Integer> array = new ArrayList<>(4);
    ArrayList<Integer> input = new ArrayList<>(4);
   // @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        check = (Button)findViewById(R.id.button);
        clear= (Button)findViewById(R.id.button12);
        e1 = (TextView) findViewById(R.id.input1);
        e2 = (TextView) findViewById(R.id.input2);
        e3 = (TextView) findViewById(R.id.input3);
        e4 = (TextView) findViewById(R.id.input4);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);

       // Random r =  new Random();



        cow = (TextView)findViewById(R.id.cowstext);
        bull = (TextView)findViewById(R.id.bullstext);
        TextView texcow = (TextView) findViewById(R.id.textView4);
        TextView textbull = (TextView) findViewById(R.id.textView2);


       /* for (int i = 1; i <= 4; i++) {
           // List<Integer> randIntegers = new Random().ints(1, 256).distinct().limit(255).boxed().collect(Collectors.toList());
            int j=r.nextInt(10);
            array.add(j);
           /* for(int k=1;k<=i;k++) {
                if (j != array.get(k)){
                    array.add(j);
                }
                else{
                    i=i-1;
                }
            }*/
         /*   Toast.makeText(SingleActivity.this,array.toString(),Toast.LENGTH_SHORT).show();
        }
            */
    for(int i=0;i<10;i++){
        array.add(i);
    }
        Collections.shuffle(array);
    for(int j=0;j<4;j++){
        input.add(array.get(j));
       // Toast.makeText(SingleActivity.this,input.toString(),Toast.LENGTH_SHORT).show();
    }


        b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(count==0) {
                     e1.setText(b1.getText());
                     count++;
                 }
                 else if(count==1) {
                     e2.setText(b1.getText());
                     count++;
                 }
                 else if(count==2) {
                     e3.setText(b1.getText());
                     count++;
                 }
                 else{
                     e4.setText(b1.getText());
                     count++;
                 }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==0) {
                    e1.setText(b2.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b2.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b2.getText());
                    count++;
                }
                else {
                    e4.setText(b2.getText());
                    count++;
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b3.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b3.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b3.getText());
                    count++;
                }
                else {
                    e4.setText(b3.getText());
                    count++;
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b4.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b4.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b4.getText());
                    count++;
                }
                else {
                    e4.setText(b4.getText());
                    count++;
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //e1.setText(b5.getText());
                if(count==0) {
                    e1.setText(b5.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b5.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b5.getText());
                    count++;
                }
                else {
                    e4.setText(b5.getText());
                    count++;
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b6.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b6.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b6.getText());
                    count++;
                }
                else {
                    e4.setText(b6.getText());
                    count++;
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b7.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b7.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b7.getText());
                    count++;
                }
                else {
                    e4.setText(b7.getText());
                    count++;
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b8.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b8.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b8.getText());
                    count++;
                }
                else  {
                    e4.setText(b8.getText());
                    count++;
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b9.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b9.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b9.getText());
                    count++;
                }
                else  {
                    e4.setText(b9.getText());
                    count++;
                }

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                e1.setText(b1.getText());
                if(count==0) {
                    e1.setText(b10.getText());
                    count++;
                }
                else if(count==1) {
                    e2.setText(b10.getText());
                    count++;
                }
                else if(count==2) {
                    e3.setText(b10.getText());
                    count++;
                }
                else  {
                    e4.setText(b10.getText());
                    count++;
                }

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(SingleActivity.this,ScoreActivity.class);
               // startActivity(intent);


                   // Toast.makeText(ScoreActivity.this, array.toString(), Toast.LENGTH_SHORT).show();


                TextView e1 = (TextView) findViewById(R.id.input1);

                TextView e2 = (TextView) findViewById(R.id.input2);

                TextView e3 = (TextView) findViewById(R.id.input3);

                TextView e4 = (TextView) findViewById(R.id.input4);

                TextView e5=(TextView)findViewById(R.id.textView5);
                TextView cow = (TextView)findViewById(R.id.cowstext);
                TextView bull = (TextView)findViewById(R.id.bullstext);
                // TextView texcow = (TextView) findViewById(R.id.textView4);
                // TextView textbull = (TextView) findViewById(R.id.textView2);
                if((e2.getText() == "" )||( e2.getText() == "") ||( e3.getText() == "" )|| (e4.getText()=="")){
                    Toast.makeText(SingleActivity.this,"Four integers should be given as input",Toast.LENGTH_LONG).show();
                    return;
                }
                if((e1.getText()==e2.getText())||(e1.getText()==e3.getText())||(e1.getText()==e4.getText())){
                    Toast.makeText(SingleActivity.this,"Four inputs should be unique.Please enter again",Toast.LENGTH_LONG).show();
                    return;
                }
                if((e2.getText()==e3.getText())||(e2.getText()==e4.getText())){
                    Toast.makeText(SingleActivity.this,"Four inputs should be unique.Please enter again",Toast.LENGTH_LONG).show();
                    return;
                }
                if((e3.getText()==e4.getText())){
                    Toast.makeText(SingleActivity.this,"Four inputs should be unique.Please enter again",Toast.LENGTH_LONG).show();
                    return;
                }

                String s1 = e1.getText().toString();clearcount++;
                String s2 = e2.getText().toString();clearcount++;
                String s3 = e3.getText().toString();clearcount++;
                String s4 = e4.getText().toString();clearcount++;
                //s5=s1+s2+s3+s4;
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int i3 = Integer.parseInt(s3);
                int i4 = Integer.parseInt(s4);
                if (i1 == input.get(0)) {
                    cows++;
                }
                if (i2 == input.get(1)) {
                    cows++;
                }
                if (i3 == input.get(2)) {
                    cows++;
                }
                if (i4 == input.get(3)) {
                    cows++;
                }
                for (int i = 0; i < 4; i++) {
                    if (i1 == input.get(i)&&i1!=input.get(0)) {
                        bulls++;
                    }
                }
                for (int i = 0; i <4; i++) {
                    if (i2 == input.get(i)&&i2!=input.get(1)) {
                        bulls++;
                    }
                }
                for (int i = 0; i < 4; i++) {
                    if (i3 == input.get(i)&&i3!=input.get(2)) {
                        bulls++;
                    }
                }
                for (int i = 0; i < 4; i++) {
                    if (i4 == input.get(i)&&i4!=input.get(3)) {
                        bulls++;
                    }
                }

                cow.setText(cows+"");
                bull.setText(bulls+"");
                // check.setText("checked");
                if(cows==4){
                    Toast.makeText(SingleActivity.this, "You have guessed it correctly", Toast.LENGTH_LONG).show();
                    finish();
                    Intent intent = new Intent(SingleActivity.this,ScoreActivity.class);
                    startActivity(intent);
                }
                if(bulls==4){
                    Toast.makeText(SingleActivity.this, "You have guessed the numbers,but not in order", Toast.LENGTH_LONG).show();
                }
                if((cow.getText()!="")||(bull.getText()!="")){
                    e5.setText(i1+" "+i2+" "+i3+" "+i4+" ");
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    count=0;
                    cows=0;
                    bulls=0;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(clearcount==4){
                    e4.setText("");
                   clearcount=clearcount-1;
                   count=count-1;
                   return;
                }
                if(clearcount==3){
                    e3.setText("");
                    clearcount=clearcount-1;
                    count=count-1;
                    return;
                }
                 if(clearcount==2){
                    e2.setText("");
                     clearcount=clearcount-1;
                     count=count-1;
                     return;
                }
                if(clearcount==1){
                    e1.setText("");
                    clearcount=clearcount-1;
                   // count=count-1;
                    return;
                }

                //clearCalcDisplay = DONT_CLEAR;

            }
        });
}
}



package com.example.ham.calculater;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    EditText result;//result in interface
    Button c;//clear screen
    Button mc;//clear memory
    Button mr;//call  memory
    Button ma;//add to memory
    Button back;//back one (delete one digit from screen
    Button n;//negative signal
    Button div;//Division
    Button seven;//number seven
    Button eight;//number eight
    Button nine;//number nine
    Button mul;//multiply
    Button four;//number four
    Button five;//number five
    Button six;//number six
    Button sub;//Subtract
    Button one;//number one
    Button two;//number two
    Button three;//number three
    Button add;//addition
    Button zero;//number zero
    Button equ;//equal
    double res=0;//result
    double memory=0.0;//memory to save numbers
    int op=0;//flag to save which operation is used
    boolean opp=false;//flag to be sure user choose one of operation
    boolean neg=false;//flag to save a negative signal if use choose it
    boolean equal=false;//flag to save a equal if use choose it
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(EditText)findViewById(R.id.result);
        c=(Button)findViewById(R.id.c);
        mc=(Button)findViewById(R.id.mc);
        mr=(Button)findViewById(R.id.mr);
        ma=(Button)findViewById(R.id.mp);
        back=(Button)findViewById(R.id.back);
        n=(Button)findViewById(R.id.n);
        div=(Button)findViewById(R.id.div);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        mul=(Button)findViewById(R.id.mul);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        sub=(Button)findViewById(R.id.sub);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        add=(Button)findViewById(R.id.add);
        zero=(Button)findViewById(R.id.zero);
        equ=(Button)findViewById(R.id.equ);
        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number one button
                addd(1);

            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to number one button
                if(neg==true){
                    op=3;
                    res=Double.parseDouble(result.getText().toString().substring(1))*-1;
                    opp=true;
                    neg=false;
                }else {
                    op = 3;
                    res = Double.parseDouble(result.getText().toString());
                    opp = true;
                }
            }
            });
        equ.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to equal button
                //first of all check about op to select which one of operation is choose
                if(op==1){//if op =1 that mean the operation is addition
                    if(neg==true){
                        res= res +(Double.parseDouble(result.getText().toString().substring(1))*-1);

                    }
                    else
                    res= res +Double.parseDouble(result.getText().toString());

                }
                else if(op==2){//if op =1 that mean the operation is subtract
                    if(neg==true){
                        res= res -(Double.parseDouble(result.getText().toString().substring(1))*-1);

                    }
                    else
                    res=res-Double.parseDouble(result.getText().toString());

                }
                else if(op==3){//if op =1 that mean the operation is multiply
                    if(neg==true){
                        res= res *(Double.parseDouble(result.getText().toString().substring(1))*-1);

                    }
                    else
                    res=res*Double.parseDouble(result.getText().toString());

                }
                else if(op==4){//if op =1 that mean the operation is division
                    if(neg==true){
                        res= res /(Double.parseDouble(result.getText().toString().substring(1))*-1);

                    }
                    else
                    res=res/Double.parseDouble(result.getText().toString());

                }

                result.setText(res+"");
                equal=true;
            }
            });
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to addition button
                if(neg==true){
                    op=1;
                    res=Double.parseDouble(result.getText().toString().substring(1))*-1;
                    opp=true;
                    neg=false;
                }
                else{
                    op=1;
                res=Double.parseDouble(result.getText().toString());
                opp=true;}
            }
        });
        n.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to negative button
                if(result.getText().toString().equals("")||res!=0){
                neg=true;
                result.setText("-");}

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//action listener to subtract button
                if(neg==true){
                    op=2;
                    res=Double.parseDouble(result.getText().toString().substring(1))*-1;
                    opp=true;
                    neg=false;
                }
                else{    op = 2;
                res=Double.parseDouble(result.getText().toString());
                opp=true;}

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//action listener to division button
                if(neg==true){
                    op=4;
                    res=Double.parseDouble(result.getText().toString().substring(1))*-1;
                    opp=true;
                    neg=false;
                }
                else{op = 4;
                res=Double.parseDouble(result.getText().toString());
                opp=true;}

            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number two button
                addd(2);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number three button
                addd(3);

            }
        });
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number four button
               addd(4);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {//action listener to number five button

            @Override
            public void onClick(View v) {
                addd(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number six button
                addd(6);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number seven button
                addd(7);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number eight button
                addd(8);

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number nine button
                addd(9);

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//action listener to number zero button
                addd(0);

            }
        });
        c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to clear button
               opp=false;
                res=0;
                result.setText("");

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//action listener to back button
                if(equal==false)
                result.setText(result.getText().toString().substring(0, result.length() - 1));


            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//action listener to clear memory button
               memory=0;
            }
        });
        mr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {//action listener to all memory button
                result.setText(memory+"");
            }
        });
        ma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {//action listener to add memory button
                memory=Double.parseDouble(result.getText().toString());
                result.setText("");
            }
        });
    }

    public void addd(int x) {//method use to set resutl in result edit text on screen
        if(opp==true){
            result.setText(x+"");
            opp=false;
        }
        else{
            result.append(x + "");}
        equal=false;

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

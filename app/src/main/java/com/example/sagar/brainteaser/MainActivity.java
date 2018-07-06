package com.example.sagar.brainteaser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button str;
    Button op1;
    Button op2;
    Button op3;
    Button op4;
    TextView head;
    TextView time;
    TextView count;
    static int counti=0;
    static int countans=0;
    static  int countques=0;
public void stopClick(View view){
        Toast.makeText(MainActivity.this,Integer.toString(countans)+Integer.toString(countques),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time=(TextView)findViewById(R.id.timer);
        time.setText("00:30");
        str=(Button)findViewById(R.id.strt);
        count=(TextView)findViewById(R.id.counter);
        count.setText("0/0");


    }
    public void onClick(View view){
        str.setText("next");
        int result=0;
        counti=counti+1;
        head=(TextView)findViewById(R.id.question);
        op1=(Button)findViewById(R.id.option1);
        op2=(Button)findViewById(R.id.option2);op3=(Button)findViewById(R.id.option3);
        op4=(Button)findViewById(R.id.option4);
        op1.setEnabled(true);
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);

        Random r=new Random();
        int a=r.nextInt(100);
        int b=r.nextInt(100);
        if(counti%4==0){
            head.setText(a+"+"+b);
            countques+=1;
            result=a+b;
            int op=r.nextInt(4);
            if(op==1){
                op1.setText(Integer.toString(result));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;

                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==2){
                op1.setText(Integer.toString(result+1));
                op2.setText(Integer.toString(result));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;

                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==3){
                op1.setText(Integer.toString(result-1));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;

                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==4){
                op1.setText(Integer.toString(result+3));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                    }
                });
            }

        }
        //case2







        else if(counti%4==1){
            head.setText(a+"-"+b);
            result=a-b;
            int op=r.nextInt(4);
            countques+=1;
            if(op==1){
                op1.setText(Integer.toString(result));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==2){
                op1.setText(Integer.toString(result+1));
                op2.setText(Integer.toString(result));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==3){
                op1.setText(Integer.toString(result-1));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==4){
                op1.setText(Integer.toString(result+3));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
        }

        //case3



        else if(counti%4==2){
            head.setText(a+"*"+b);
            result=a*b;
            countques+=1;
            int op=r.nextInt(4);
            if(op==1){
                op1.setText(Integer.toString(result));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==2){
                op1.setText(Integer.toString(result+1));
                op2.setText(Integer.toString(result));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==3){
                op1.setText(Integer.toString(result-1));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==4){
                op1.setText(Integer.toString(result+3));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
        }
        //case4





        else if(counti%4==3){
            head.setText(a+"/"+b);
            result=a/b;
            countques+=1;
            int op=r.nextInt(4);
            if(op==1){
                op1.setText(Integer.toString(result));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==2){
                op1.setText(Integer.toString(result+1));
                op2.setText(Integer.toString(result));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==3){
                op1.setText(Integer.toString(result-1));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result));
                op4.setText(Integer.toString(result+3));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=1;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
            if(op==4){
                op1.setText(Integer.toString(result+3));
                op2.setText(Integer.toString(result+1));
                op3.setText(Integer.toString(result-1));
                op4.setText(Integer.toString(result));
                op1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=0;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
                op4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        countans+=4;
                        op1.setEnabled(false);
                        op2.setEnabled(false);
                        op3.setEnabled(false);
                        op4.setEnabled(false);
                    }
                });
            }
        }


    }
}

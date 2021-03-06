package com.softlab.khayrul.programmingaccessories;

/**
 * Created by khayrul
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edittxt;
    ScrollView scroll;
    Button button ;
    static int pos = -1;
    Activity2 activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity2 = new Activity2();
        firstRun();
    }

    TextView txt;
    public  void firstRun()
    {
        pos = 1;
        setContentView(R.layout.first);

    }

    public void programming(View v)
    {
        pos = 2;
        setContentView(R.layout.programming);
    }

    public void academic(View v)
    {
        pos = 2;
        setContentView(R.layout.academic);
    }

    public void showBtn3(View v)
    {
        txt = (TextView)findViewById(R.id.text);
        txt.setText("About");
    }

    //show show clickable string
    public void showContent(View v)
    {
        pos = -1;
        Button button = (Button)v;
        String string = button.getText().toString();
        string = activity2.removeSpace(string);
        string = string.toLowerCase();
//        txt = (TextView)findViewById(R.id.showtext);
//        txt.setText(string);
        switch (string)
        {
            case "catalannumber" :
                setContentView(R.layout.catalannumber);
                break;

            case "eulertotientfunction" :
                setContentView(R.layout.eulertotientfunction);
                break;

            case "fermatslitletheorem" :
                setContentView(R.layout.fermatslitletheorem);
                break;

            case "factorials" :
                setContentView(R.layout.factorials);
                break;

            case "fibonacci" :
                setContentView(R.layout.fibonacci);
                break;

            case "gcd" :
                setContentView(R.layout.gcd);
                break;
            case "modulararithmetic" :
                setContentView(R.layout.modulararithmetic);
                break;

            case "perfectnumber" :
                setContentView(R.layout.perfectnumber);
                break;

            case "primenumber" :
                setContentView(R.layout.primenumber);
                break;

            case "stirlingformula" :
                setContentView(R.layout.stirlingformula);
                break;

            case "binaryindextree" :
                setContentView(R.layout.binaryindextree);
                break;

            case "disjointset" :
                setContentView(R.layout.disjointset);
                break;

            case "heap" :
                setContentView(R.layout.heap);
                break;

            case "queue" :
                setContentView(R.layout.queue);
                break;

            case "segmenttree" :
                setContentView(R.layout.segmenttree);
                break;

            case "trie" :
                setContentView(R.layout.trie);
                break;

            case "adjacencylist" :
                setContentView(R.layout.adjacencylist);
                break;

            case "adjacencymatrix" :
                setContentView(R.layout.adjacencymatrix);
                break;

            case "bellmanford" :
                setContentView(R.layout.bellmanford);
                break;

            case "bfs" :
                setContentView(R.layout.bfs);
                break;

            case "topologicalsort" :
                setContentView(R.layout.topologicalsort);
                break;

            case "waarshall" :
                setContentView(R.layout.warshall);
                break;

            case "bubblesort" :
                setContentView(R.layout.bubblesort);
                break;

            case "insertionsort" :
                setContentView(R.layout.insertionsort);
                break;

            case "heapsort" :
                setContentView(R.layout.heapsort);
                break;

            case "mergesort" :
                setContentView(R.layout.mergesort);
                break;

            case "quicksort" :
                setContentView(R.layout.quicksort);
                break;

            case "selectionsort" :
                setContentView(R.layout.selectionsort);
                break;

            case "combination" :
                setContentView(R.layout.combination);
                break;

            case "inclusionexclution" :
                setContentView(R.layout.inclusionexclution);
                break;

            case "permutation" :
                setContentView(R.layout.permutation);
                break;

            default:
                break;
        }
    }

    //This method open the link by default browser
    public void click(View v)
    {
        TextView text = (TextView)v;
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public  void back(View v)
    {
        pos = 2;
        setContentView(R.layout.programming);

    }


    public void back2(View v)
    {
        pos = 2;
        setContentView(R.layout.programming);
    }



    //Exit the app by button click
    public void exitApp(View v)
    {
        System.exit(1);
    }

    //Exit the app
    public void exitApp()
    {
        System.exit(1);
    }


    //Search something from list
    public void search(View v)
    {
        edittxt = (EditText)findViewById(R.id.editText);
        scroll = (ScrollView)findViewById(R.id.scroll);
        String string = edittxt.getText().toString();
        string = activity2.removeSpace(string);
        string = string.toLowerCase();
        int resID = getResources().getIdentifier(string, "id", getPackageName());
        button = (Button)findViewById(resID);
        scroll.scrollTo(0,button.getTop());
    }

    public void showProgramming(View v)
    {
        pos = 2;
        setContentView(R.layout.programming);
    }

    //Use android default back button
    @Override
    public void onBackPressed() {

        if(pos == 1)
        {
            exitApp();
        }
        else if (pos == 2)
        {
            pos = 1;
            setContentView(R.layout.first);
        }
        else
        {
            pos = 2;
            setContentView(R.layout.programming);
        }
    }

    public void about(View v)
    {
        pos = 2;
        setContentView(R.layout.about);
    }
}

package com.softlab.khayrul.programmingaccessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firstRun();
    }

    TextView txt;
    public  void firstRun()
    {
        setContentView(R.layout.first);
    }
    public void showBtn1(View v)
    {

    }

    public void showBtn2(View v)
    {
        setContentView(R.layout.programming);
    }

    public void showBtn3(View v)
    {
        txt = (TextView)findViewById(R.id.text);
        txt.setText("About");
    }

    public void showContent(View v)
    {
        Button button = (Button)v;
        String string = button.getText().toString();
        string = removeSpace(string);
        string = string.toLowerCase();
//        txt = (TextView)findViewById(R.id.showtext);
//        txt.setText(string);
        switch (string)
        {
            case "catalannumber" :
                setContentView(R.layout.show);
                break;

            case "eulertotientfunction" :
                setContentView(R.layout.eulertotientfunction);
                break;

            case "fermatstitletheorem" :
                setContentView(R.layout.fermatstitletheorem);
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

            case "bublesort" :
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

    public  void back(View v)
    {
        setContentView(R.layout.programming);
    }



    public void exitApp(View v)
    {
        System.exit(1);
    }
    public String removeSpace(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                str += s.charAt(i);
            }
        }
        return str;
    }
}

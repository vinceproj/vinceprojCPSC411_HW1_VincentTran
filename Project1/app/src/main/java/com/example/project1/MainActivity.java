/*
Vincent Tran
891036956
CPSC 411
HW Assignment #1
*/

package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.Gravity.CENTER;
import static android.view.Gravity.CENTER_HORIZONTAL;
import static android.view.Gravity.RIGHT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create HorizontalScrollView for main body
        HorizontalScrollView hsv = new HorizontalScrollView(this);

        //Create GridLayout to serve as body
        GridLayout root = new GridLayout(this);

        //Create ViewGroup.LayoutParams for MatchParent All
        ViewGroup.LayoutParams matchParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        //Create ViewGroup.LayoutParams for WrapContent All
        ViewGroup.LayoutParams wrapParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        //Create LinearLayout.LayoutParams for splitting a LinearLayout
        LinearLayout.LayoutParams splitParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1f
        );

        //Set HSV and GV
        hsv.setLayoutParams(matchParams);
        root.setLayoutParams(wrapParams);

        //Set grid attributes
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setColumnCount(5);
        root.setRowCount(11);
        root.setUseDefaultMargins(true);
        root.setPadding(5,5,5,5);

        /*Design Notes
        Setting padding expands the widget box; This expansion will carry to all with equal weights
        .setBackgroundColor(getResources().getColor(R.color.LightBlue)); Use to set custom background colors
         */

        //Row 1 Col FULL
        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(16);
        tv.setTextColor(Color.WHITE);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(Color.BLACK);
        GridLayout.Spec row_spec = GridLayout.spec(0);
        GridLayout.Spec col_spec = GridLayout.spec(0, 5, 1f);
        GridLayout.LayoutParams gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 2/3 Col 1
        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setPadding(50,25,50,25);
        row_spec = GridLayout.spec(1, 2, 1f);
        col_spec = GridLayout.spec(0,1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 2 Col 2
        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setPadding(200,0, 200, 0);
        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(1,1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 2 Col 3
        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setPadding(0,0,200,0);
        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 3 Col 2
        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        row_spec = GridLayout.spec(2);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 3 Col 3
        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(2);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 4 Col 1
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(3);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 4 Col 2
        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(3);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 4 Col 3
        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(3);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 5 Col 1
        tv = new TextView(this);
        tv.setTextSize(16);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(4);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 5 Col 2
        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(4);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 5 Col 3
        tv = new TextView(this);
        tv.setText(Html.fromHtml("System.out.printIn(greeting + " + "&ldquo; " + ", World!" + " &rdquo;" + ")")); //Use Html style to include "" in text string
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(4);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 6 Col 1
        tv = new TextView(this);
        tv.setTextSize(16);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(5);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);


        //Create LinearLayout to insert into grid; Row 6 Col 2
        LinearLayout lv = new LinearLayout(this);
        lv.setGravity(CENTER_HORIZONTAL);

        //Row 6 Col 2
        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        tv.setLayoutParams(splitParams);
        lv.addView(tv);

        //Row 6 Col 2.5
        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        tv.setLayoutParams(splitParams);

        row_spec = GridLayout.spec(5);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 6 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);


        //Row 6 Col 3
        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(CENTER);
        tv.setBackgroundColor(getResources().getColor(R.color.LightBlue));
        row_spec = GridLayout.spec(5);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);


        //Row 7 Col 1
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        row_spec = GridLayout.spec(6);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Create LinearLayout to insert into grid; Row 7 Col 2
        lv = new LinearLayout(this);
        lv.setGravity(CENTER_HORIZONTAL);

        //Row 7 Col 2
        tv = new TextView(this);
        tv.setText("From");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        lv.addView(tv);

        //Row 7 Col 2.5
        tv = new TextView(this);
        tv.setText("To");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);

        row_spec = GridLayout.spec(6);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 7 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);

        //Row 7 Col 3
        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(getResources().getColor(R.color.LightOrange));
        row_spec = GridLayout.spec(6);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row 8 Col 1
        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(7);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Create LinearLayout to insert into grid; Row 8 Col 2
        lv = new LinearLayout(this);

        //Row 8 Col 2
        tv = new TextView(this);
        tv.setText("0");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);
        lv.addView(tv);

        //Row 8 Col 2.5
        tv = new TextView(this);
        tv.setText("11");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);

        row_spec = GridLayout.spec(7);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 8 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);

        //Row 8 Col 3
        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.LightOrange));
        row_spec = GridLayout.spec(7);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Row9 Col 1
        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(8);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Create LinearLayout to insert into grid; Row 9 Col 2
        lv = new LinearLayout(this);

        //Row 9 Col 2
        tv = new TextView(this);
        tv.setText("12");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);
        lv.addView(tv);

        //Row 9 Col 2.5
        tv = new TextView(this);
        tv.setText("17");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);

        row_spec = GridLayout.spec(8);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 9 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);

        //Row 9 Col 3
        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.LightOrange));
        row_spec = GridLayout.spec(8);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);


        //Row 10 Col 1
        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(9);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Create LinearLayout to insert into grid; Row 10 Col 2
        lv = new LinearLayout(this);

        //Row 10 Col 2
        tv = new TextView(this);
        tv.setText("18");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);
        lv.addView(tv);

        //Row 10 Col 2.5
        tv = new TextView(this);
        tv.setText("21");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);

        row_spec = GridLayout.spec(9);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 10 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);

        //Row 10 Col 3
        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.LightOrange));
        row_spec = GridLayout.spec(9);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);


        //Row 11 Col 1
        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(10);
        col_spec = GridLayout.spec(0, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);

        //Create LinearLayout to insert into grid; Row 11 Col 2
        lv = new LinearLayout(this);

        //Row 11 Col 2
        tv = new TextView(this);
        tv.setText("22");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);
        lv.addView(tv);

        //Row 11 Col 2.5
        tv = new TextView(this);
        tv.setText("23");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.PastelYellow));
        tv.setLayoutParams(splitParams);
        tv.setGravity(RIGHT);

        row_spec = GridLayout.spec(10);
        col_spec = GridLayout.spec(1, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );

        //Set Row 11 Col 2
        lv.setLayoutParams(gridParams);//Set lv into grid row/col specs
        lv.addView(tv);
        root.addView(lv);

        //Row 11 Col 3
        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.LightOrange));
        row_spec = GridLayout.spec(10);
        col_spec = GridLayout.spec(2, 1f);
        gridParams = new GridLayout.LayoutParams(
                row_spec, col_spec
        );
        tv.setLayoutParams(gridParams);
        root.addView(tv);



        //Place root into hsv
        hsv.addView(root);

        //Place hsv into setContentView to run
        setContentView(hsv);

        //Place xml layout into setContentView to run
        //setContentView(R.layout.tablelayout);

    }
}

package com.tutorial.table_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
TableLayout is a ViewGroup subclass which is used to display the child View elements in rows and columns.

 TableLayout will position its children elements into rows and columns and
 it won’t display any border lines for rows, columns or cells.

 The TableLayout in android will work same as HTML table and table will have as many columns as the row with the most cells.
 The TableLayout can be explained as <table> and TableRow is like <tr> element.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.angcyo.sample.launchermode;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.angcyo.sample.R;

public class SingleActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.base_toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.base_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        e("onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        e("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        e("onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        e("onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        e("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        e("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        e("onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e("onNewIntent");

        boolean exit = intent.getBooleanExtra("exit", false);
        if (exit) {
            finish();
        }
    }


    private void e(String log) {
        Log.e("angcyo-->4-->" + getTaskId(), log);
    }
    public void button5(View view) {
        startActivity(new Intent(this, SingleTaskActivity.class));
    }

    public void buttonExit(View view) {
        Intent intent = new Intent(this, SingleTaskActivity.class);
        intent.putExtra("exit", true);
        startActivity(intent);
    }
}

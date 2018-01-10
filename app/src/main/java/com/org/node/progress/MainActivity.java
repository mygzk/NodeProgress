package com.org.node.progress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private NodeProgressView nodeProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    protected void initView() {
        nodeProgressView = findViewById(R.id.node_progress);
        findViewById(R.id.node_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.node_test:
                nodeProgressView.setCurentNode(1);
                nodeProgressView.reDraw();
                break;
        }

    }
}

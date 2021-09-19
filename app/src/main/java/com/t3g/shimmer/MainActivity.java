package com.t3g.shimmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    ShimmerFrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.shimmerFrame);
        Button btn = findViewById(R.id.actionShimmer);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (frameLayout.getVisibility()== View.GONE){
                    frameLayout.setVisibility(View.VISIBLE);
                    frameLayout.startShimmer();
                } else {
                    frameLayout.setVisibility(View.GONE);
                    frameLayout.stopShimmer();
                }
            }
        });
    }
}
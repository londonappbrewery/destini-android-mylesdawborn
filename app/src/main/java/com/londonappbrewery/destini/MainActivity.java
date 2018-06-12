package com.londonappbrewery.destini;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int storyIndex;

    private void storyOne () {
        storyIndex = 1;
        storyTextView.setText(R.string.T1_Story);
        buttonTop.setText(R.string.T1_Ans1);
        buttonBottom.setText(R.string.T1_Ans2);
    }

    private void storyTwo () {
        storyIndex = 2;
        storyTextView.setText(R.string.T2_Story);
        buttonTop.setText(R.string.T2_Ans1);
        buttonBottom.setText(R.string.T2_Ans2);
    }

    private void storyThree () {
        storyIndex = 3;
        storyTextView.setText(R.string.T3_Story);
        buttonTop.setText(R.string.T3_Ans1);
        buttonBottom.setText(R.string.T3_Ans2);
    }

    private void storyFour () {
        storyIndex = 4;
        storyTextView.setText(R.string.T4_End);
        buttonTop.setVisibility(View.GONE);
        buttonBottom.setVisibility(View.GONE);
    }

    private void storyFive () {
        storyIndex = 5;
        storyTextView.setText(R.string.T5_End);
        buttonTop.setVisibility(View.GONE);
        buttonBottom.setVisibility(View.GONE);
    }

    private void storySix () {
        storyIndex = 6;
        storyTextView.setText(R.string.T6_End);
        buttonTop.setVisibility(View.GONE);
        buttonBottom.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);

        storyOne();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1 || storyIndex == 4) {
                    storyThree();
                } else if (storyIndex == 3) {
                    storySix();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    storyTwo();
                    storyIndex = storyIndex + 2;
                } else if (storyIndex == 4) {
                    storyFour();
                } else  {
                    storyFive();
                }
            }
        });
    }
}

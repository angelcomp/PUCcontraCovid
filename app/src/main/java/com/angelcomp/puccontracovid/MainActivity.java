package com.angelcomp.puccontracovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(AppViewModel.class);
        viewModel.getCompletedQuestionsValue().observe(this, value -> {
            if (value) {
                //todo: make a dialog
                Toast.makeText(this, viewModel.getPositiveClicksValue().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
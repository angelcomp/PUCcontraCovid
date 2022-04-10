package com.angelcomp.puccontracovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import com.angelcomp.puccontracovid.databinding.DialogBinding;

public class MainActivity extends AppCompatActivity {

    private AppViewModel viewModel;
    DialogBinding dialogBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialogBinding = DialogBinding.inflate(getLayoutInflater());

        viewModel = new ViewModelProvider(this).get(AppViewModel.class);
        viewModel.getCompletedQuestionsValue().observe(this, value -> {
            if (value && viewModel.getPositiveClicksValue() != 0) {
                ShowDialog(true);
                Toast.makeText(this, viewModel.getPositiveClicksValue().toString(), Toast.LENGTH_SHORT).show();
            } else {
                ShowDialog(false);
            }
        });
    }

    private void ShowDialog(boolean covidAlert) {
        Dialog dialog = new Dialog(covidAlert);
        dialog.setCancelable(false);
        dialog.show(getSupportFragmentManager(), dialog.getTag());
    }
}
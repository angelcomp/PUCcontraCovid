package com.angelcomp.puccontracovid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.angelcomp.puccontracovid.databinding.FragmentQuestionOneBinding;

import java.util.Objects;

public class QuestionOneFragment extends Fragment {

    private FragmentQuestionOneBinding binding;
    private AppViewModel viewModel;
    NavController navController;
    private Button yes;
    private Button no;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentQuestionOneBinding.inflate(inflater, container, false);

        initProperties();
        setListeners();

        return binding.getRoot();
    }

    private void setListeners() {
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Resposta enviada", Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.action_questionOneFragment_to_questionTwoFragment);
                viewModel.incrementPositiveClick();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Resposta enviada", Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.action_questionOneFragment_to_questionTwoFragment);
            }
        });
    }

    private void initProperties() {
        navController = Navigation.findNavController(requireActivity(), R.id.navigation);
        viewModel = new ViewModelProvider(requireActivity()).get(AppViewModel.class);
        yes = binding.yes;
        no = binding.no;
    }
}
package com.angelcomp.puccontracovid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.angelcomp.puccontracovid.databinding.FragmentQuestionTwoBinding;

public class QuestionTwoFragment extends Fragment {

    private FragmentQuestionTwoBinding binding;
    NavController navController;
    private Button yes;
    private Button no;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuestionTwoBinding.inflate(inflater, container, false);

        initProperties();
        setListeners();

        return binding.getRoot();
    }

    private void setListeners() {
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Resposta enviada", Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.action_questionTwoFragment_to_questionThreeFragment);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Resposta enviada", Toast.LENGTH_SHORT).show();

                navController.navigate(R.id.action_questionTwoFragment_to_questionThreeFragment);
            }
        });
    }

    private void initProperties() {
        navController = Navigation.findNavController(requireActivity(), R.id.navigation);
        yes = binding.yes;
        no = binding.no;
    }
}
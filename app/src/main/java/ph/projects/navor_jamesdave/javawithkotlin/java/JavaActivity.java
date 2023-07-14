package ph.projects.navor_jamesdave.javawithkotlin.java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ph.projects.navor_jamesdave.javawithkotlin.R;
import ph.projects.navor_jamesdave.javawithkotlin.databinding.ActivityGreetingsBinding;

public class JavaActivity extends AppCompatActivity {
    private ActivityGreetingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGreetingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
    }

    private void setupUI(){
        binding.btnGreet.setOnClickListener( view -> {
            binding.msgGreetings.setText(R.string.hello_from_java);
        });
    }
}
package ph.projects.navor_jamesdave.javawithkotlin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ph.projects.navor_jamesdave.javawithkotlin.databinding.ActivityMainBinding;
import ph.projects.navor_jamesdave.javawithkotlin.java.JavaActivity;
import ph.projects.navor_jamesdave.javawithkotlin.kotlin.KotlinClickEvent;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupUI();
    }

    private void setupUI(){
        binding.btnToJava.setOnClickListener(view -> {
            Intent intent = new Intent(this, JavaActivity.class);
            startActivity(intent);
        });

        binding.btnToKotlin.setOnClickListener(view ->
                KotlinClickEvent.INSTANCE.toKotlin(this)
        );
    }
}
package com.example.loginregister;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.loginregister.model.GenericShoes;
import com.example.loginregister.service.GenericShoesService;
import com.example.loginregister.service.UserService;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Checkout extends AppCompatActivity {

    TextInputEditText signUpName, signUpEmail, signUpSex, signUpAddress, signUpPassword, signUpPasswordConfirm;
    AppCompatButton btnSignUp;
    ImageView signUpImage;
    TextView textAddImage;
    FrameLayout layoutImage;
    FirebaseAuth mAuth;
    String encodeImage;
    FirebaseFirestore mStore;
    ProgressBar progressBar;
    TextView signInNow;

    @Override
    public void onStart() {
        super.onStart();
        //FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        //signUpImage = findViewById(R.id.signUpImage);
        //layoutImage = findViewById(R.id.layoutImage);
        //textAddImage = findViewById(R.id.textAddImage);
        signUpName = findViewById(R.id.signUpName);
        signUpEmail = findViewById(R.id.signUpEmail);
        signUpSex = findViewById(R.id.signUpSex);
        signUpAddress = findViewById(R.id.signUpAddress);
        signUpPassword = findViewById(R.id.signUpPassword);
        //signUpPasswordConfirm = findViewById(R.id.signUpPasswordConfirm);
        btnSignUp = findViewById(R.id.btnSignUp);
        progressBar = findViewById(R.id.progessBar);
        //signInNow = findViewById(R.id.signInNow);
        mAuth = FirebaseAuth.getInstance();
        mStore = FirebaseFirestore.getInstance();
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://192.168.137.1:8089/api/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                UserService apiService = retrofit.create(UserService.class);
                Call<ResponseBody> call = apiService.checkOut(signUpEmail.getText().toString()); //call service
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        Toast.makeText(Checkout.this, "Checkout success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Toast.makeText(Checkout.this, "Checkout fail", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });
    }
}

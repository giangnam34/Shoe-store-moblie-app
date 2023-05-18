package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginregister.model.GenericShoes;
import com.example.loginregister.model.ProductOrder;
import com.example.loginregister.model.ShoesOrder;
import com.example.loginregister.model.User;
import com.example.loginregister.service.GenericShoesService;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {
    public List<ShoesOrder> shoesOrderList = new ArrayList<>();
    private TextView tvName;
    private TextView tvPrice;
    private ImageView igImage;
    private Spinner spinner;
    private EditText editText;
    FirebaseFirestore mStore;
    FirebaseAuth mAuth;
    private Double size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EditText editText = findViewById(R.id.spinnerColor);
        Intent intent = getIntent();
        Spinner spinner = (Spinner) findViewById(R.id.spinnerSize);
        int shoeId = intent.getIntExtra("shoe_id", 0);
        String shoeName = intent.getStringExtra("shoe_name");
        double shoePrice = intent.getDoubleExtra("shoe_price", 0.0);
        String shoeImage = intent.getStringExtra("shoe_image");
        int categoryId = intent.getIntExtra("shoe_CategoryId", 0);
        int stock = intent.getIntExtra("shoe_stock",0);
        GenericShoes genericShoes = new GenericShoes(shoeId,shoeName,shoePrice,shoeImage,0,0,"",null, null,"men", "adidas");
        List<Double> list = (List<Double>) intent.getSerializableExtra("shoe_size");
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                size = list.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Không cần thực hiện
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Không cần thực hiện
            }

            @Override
            public void afterTextChanged(Editable s) {
                String input = s.toString().trim();
                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    if (number < 0 || number > stock) {
                        // Giá trị không nằm trong khoảng cho phép, xử lý tại đây (ví dụ: thông báo lỗi)
                        editText.setError("Giá trị phải nằm trong khoảng từ 0 đến " + stock);
                    }
                }
            }
        });
        // Initialize the TextViews to display the shoe information
        tvName = findViewById(R.id.name);
        tvPrice = findViewById(R.id.price);
        igImage = findViewById(R.id.image);
        // Set the text of the TextViews to display the shoe information
        tvName.setText(shoeName);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/robotocondensedboiditalic.ttf");
        tvName.setTypeface(typeface);
        tvPrice.setTypeface(typeface);
        editText.setTypeface(typeface);

        String priceText = String.format("đ%f", shoePrice);

        SpannableString spannableString = new SpannableString(priceText);

        spannableString.setSpan(new StyleSpan(Typeface.BOLD), 0, priceText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        spannableString.setSpan(new UnderlineSpan(), 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tvPrice.setText(spannableString);
        Picasso.get().load(shoeImage)
                .into(igImage);

        if (getSupportActionBar() != null) {
            setTitle("Detail Page");
        }
        //notification
        Button btnAdd = findViewById(R.id.add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(String.valueOf(editText.getText()))>0){
                    Calendar calendar = Calendar.getInstance();
                    Date currentDateTime = calendar.getTime();
                    User user = new User();
                    FirebaseAuth auth = FirebaseAuth.getInstance();
                    FirebaseUser userfirebase = auth.getCurrentUser();
                    user.setUsername(userfirebase.getEmail());
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("http://192.168.137.1:8089/api/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    GenericShoesService apiService = retrofit.create(GenericShoesService.class);
                    Call<ResponseBody> call = apiService.addProductToCart(shoeId,Integer.parseInt(editText.getText().toString()),userfirebase.getEmail());
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            // Xử lý phản hồi thành công
                            Toast.makeText(DetailActivity.this, "Add Success", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            System.out.println(t.toString());
                            Toast.makeText(DetailActivity.this, "Add Fail", Toast.LENGTH_SHORT).show();
                            // Xử lý lỗi
                        }
                    });
                    /*List<ProductOrder> productOrderList = new ArrayList<>();
                    ShoesOrder shoesOrder = new ShoesOrder(shoeId, (java.sql.Date) currentDateTime,0.0, (long) (Integer.parseInt(editText.toString())*shoePrice),false,user, productOrderList);
                    shoesOrderList.add(shoesOrder);*/

                }else {
                    Toast.makeText(DetailActivity.this, "Add Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    //notification
    private void sendNotification(){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        android.app.Notification notification = new Notification.Builder(this).setContentTitle("Title push notifitaction")
                .setContentText("Message push notification")
                .setSmallIcon(R.drawable.baseline_notifications_active_24)
                .setLargeIcon(bitmap)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null){
            notificationManager.notify(getNotificationId(), notification);
        }
    }
    //notification
    private int getNotificationId(){
        return (int)  new Date().getTime();
    }
}
package com.wintosoft.tecnical_interviwe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.wintosoft.tecnical_interviwe.Models.LiceneDetails;
import com.wintosoft.tecnical_interviwe.Models.UserDetails;
import com.wintosoft.tecnical_interviwe.Models.UserDetailsNew;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView fname,lname,pno,email,nic,pw;
    ImageView front_img,Back_img;
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://reqres.in/api/";
//    https://reqres.in/api/users?page=2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.tv_fname);
        lname = findViewById(R.id.tv_lname);
        pno = findViewById(R.id.tv_pno);
        email = findViewById(R.id.tv_email);
        nic = findViewById(R.id.tv_nic);
        pw = findViewById(R.id.tv_pw);
        front_img = findViewById(R.id.front_img);
        Back_img = findViewById(R.id.back_img);


        getAPIData();



    }

    private void getAPIData() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://38re9.mocklab.io/user/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<UserDetails> call = jsonPlaceHolderApi.getUserDetails();

        call.enqueue(new Callback<UserDetails>() {
            @Override
            public void onResponse(Call<UserDetails> call, Response<UserDetails> response) {


 //user details
                UserDetailsNew ud = response.body().getUserDetails();
                fname.setText(ud.getFirstName());
                lname.setText(ud.getLastName());
                pno.setText(ud.getPhone());
                email.setText(ud.getEmail());
                pw.setText(ud.getPassword());

                LiceneDetails ld = response.body().getLiceneDetail();

//Image Set
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.placeholder(R.drawable.ic_launcher_background);
                requestOptions.error(R.drawable.ic_launcher_foreground);
                Glide.with(MainActivity.this)
                        .setDefaultRequestOptions(requestOptions)
                        .load(ld.getImageFront())
                        .into(front_img);

                Glide.with(MainActivity.this)
                        .setDefaultRequestOptions(requestOptions)
                        .load(ld.getImageBack())
                        .into(Back_img);


            }

            @Override
            public void onFailure(Call<UserDetails> call, Throwable t) {
                Toast.makeText(MainActivity.this, "fail"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();


            }
        });

    }
}
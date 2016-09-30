package com.projeto.sumula.sumulaeletronica.resources;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.projeto.sumula.sumulaeletronica.model.Clube;
import com.projeto.sumula.sumulaeletronica.services.ClubeServices;
import com.projeto.sumula.sumulaeletronica.util.ClubeDes;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pedro on 29/09/2016.
 */

public class BuscarClubesAsync extends AsyncTask<Void, Void, Void> {

    private Context context;
    public static final String TAG = "RETROFIT";

    public BuscarClubesAsync(Context context) {
        this.context = context;
    }


    @Override
    protected Void doInBackground(Void... params) {
        String url = "http://192.168.0.14:8080/RestFul/clube/listarTodos/";

        Gson gsonConverter = new GsonBuilder().registerTypeAdapter(Clube.class, new ClubeDes()).create();

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gsonConverter))
                .build();

        ClubeServices services  = retrofit.create(ClubeServices.class);

        Call<List<Clube>> listaClubeService = services.listarTodos();

        listaClubeService.enqueue(new Callback<List<Clube>>() {
            @Override
            public void onResponse(Call<List<Clube>> call, Response<List<Clube>> response) {
                List<Clube> clubes = response.body();

                if (!clubes.isEmpty()) {
                    for (Clube c : clubes) {
                        Log.i(TAG, c.getNome());
                    }
                }else{
                    Log.i("SAPORRA", "TA VAZIA");
                }



            }

            @Override
            public void onFailure(Call<List<Clube>> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return null;
    }
}
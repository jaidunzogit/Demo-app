package com.learn.demoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.learn.demoapplication.activity5simpleretrofit.ApiInterface
import com.learn.demoapplication.activity5simpleretrofit.RetrofitClient
import com.learn.demoapplication.activity5simpleretrofit.ResponceListUsers
import com.learn.demoapplication.activity5simpleretrofit.Data
import com.learn.demoapplication.activity5simpleretrofit.Support
import com.google.gson.Gson
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import java.lang.Exception

class MainActivity5 : AppCompatActivity() {

    lateinit var txtData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        txtData = findViewById(R.id.txtData)
        getUserList()
    }

    val msg = "MSG:"
    fun getUserList(){
        var retrofit:Retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated{
            try {
                val response = apiInterface.getAllUsers()
                if(response.isSuccessful()){
                    Log.d(msg,"It is Successful")
                    println("Successful")
                }
                else {
                    Toast.makeText(
                        this@MainActivity5,
                        response.errorBody().toString(),
                        Toast.LENGTH_LONG
                    ).show()
                    Log.d(msg,"Crash")
                }
            } catch (Ex:Exception){
                Log.e("Error",Ex.localizedMessage)
            }
        }
        Log.d(msg,"COMPLETED")
    }
}
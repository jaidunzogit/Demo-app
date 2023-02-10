package com.learn.demoapplication.activity5simpleretrofit

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("avatar")
    var avatar: String,

    @SerializedName("email")
    var email: String,

    @SerializedName("first_name")
    var first_name:String,

    @SerializedName("id")
    var id: Int,

    @SerializedName("last_name")
    var lastName: String,

)
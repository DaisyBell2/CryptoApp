package com.daisybell.cryptoapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONObject


data class CoinPriceInfoRowData(
    @SerializedName("RAW")
    @Expose
    val coinPriceInfoJsonObject: JSONObject? = null
)
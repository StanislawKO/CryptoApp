package com.codexample.cryptoapp.data.network.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.codexample.cryptoapp.data.network.ApiFactory.BASE_IMAGE_URL
import com.codexample.cryptoapp.utils.convertTimestampToTime
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinInfoDto(
    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    val price: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Int? = null,

    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastvolumeto: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lasttradeid: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeday: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumedayto: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24hour: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24hourto: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    val openday: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    val open24hour: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24hour: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumehour: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumehourto: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    val openhour: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    val highhour: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    val lowhour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val toptiervolume24hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val toptiervolume24hourto: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changepct24hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeday: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changepctday: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changehour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changepcthour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversiontype: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionsymbol: String? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String? = null
) {
    fun getFormattedTime(): String {
        return convertTimestampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return BASE_IMAGE_URL + imageUrl
    }
}
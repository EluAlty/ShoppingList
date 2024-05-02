package com.example.shoppinglist.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "shopItems")
data class ShopItem(

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "count")
    val count: Int,

    @ColumnInfo(name = "enable")
    val enabled: Boolean,

    @PrimaryKey(autoGenerate = true)
    var id: Int = UNDEFINED_ID

    ){
    companion object{
        const val UNDEFINED_ID = -1;
    }
}


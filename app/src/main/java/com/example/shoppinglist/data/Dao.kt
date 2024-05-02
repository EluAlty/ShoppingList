package com.example.shoppinglist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.shoppinglist.domain.ShopItem
import kotlinx.coroutines.flow.Flow


@Dao
interface Dao {
    @Insert
    fun insertShopItem(shopItem: ShopItem)

    @Delete
    fun deleteShopItem(shopItem: ShopItem)

    @Update
    fun updateShopItem(shopItem: ShopItem)

    @Query("SELECT * FROM shopItems")
    fun getAllItems(): Flow<List<ShopItem>>




}
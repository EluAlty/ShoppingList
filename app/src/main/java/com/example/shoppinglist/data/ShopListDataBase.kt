package com.example.shoppinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.shoppinglist.domain.ShopItem


@Database(entities = [ShopItem::class], version = 1)
abstract class ShopListDataBase : RoomDatabase() {

    abstract fun getDao(): Dao

    companion object{
        fun getDataBase(context: Context): ShopListDataBase{
            return Room.databaseBuilder(
                context.applicationContext,
                ShopListDataBase::class.java,
                "shopListDataBase.db"
            ).build()

        }

    }
}
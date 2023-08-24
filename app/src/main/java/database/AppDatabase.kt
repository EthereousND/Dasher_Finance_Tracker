package com.example.dasherfinancetracker.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dasherfinancetracker.model.RecurringExpense
import com.example.dasherfinancetracker.model.WorkData


@Database(entities = [RecurringExpense::class, WorkData::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class) // If you have any type converters
abstract class AppDatabase : RoomDatabase() {

    abstract fun recurringExpenseDao(): RecurringExpenseDao
    abstract fun workDataDao(): WorkDataDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "finance_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

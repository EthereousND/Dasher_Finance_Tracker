package com.example.dasherfinancetracker.workdata

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WorkData::class], version = 1)
abstract class WorkDataDatabase : RoomDatabase() {

    abstract fun workDataDao(): WorkDataDao

    companion object {
        @Volatile
        private var INSTANCE: WorkDataDatabase? = null

        fun getDatabase(context: Context): WorkDataDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WorkDataDatabase::class.java,
                    "work_data_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

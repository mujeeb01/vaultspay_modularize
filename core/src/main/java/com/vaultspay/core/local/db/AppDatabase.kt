package com.vaultspay.core.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vaultspay.core.local.models.ShipsModel
import javax.inject.Inject

@Database(
    entities = [ShipsModel::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun shipDao(): AppDao

    @Inject
    internal lateinit var myRoomDatabase: AppDatabase

    companion object {
        const val DB_NAME = "vaultspay_db"
    }
}
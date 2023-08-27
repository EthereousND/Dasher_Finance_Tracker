package com.example.dasherfinancetracker.workdata

import androidx.lifecycle.LiveData

class WorkDataRepository(private val workDataDao: WorkDataDao) {

    val allWorkData: LiveData<List<WorkData>> = workDataDao.getAll()

    suspend fun insert(workData: WorkData) {
        workDataDao.insert(workData)
    }

    suspend fun deleteById(id: Int) {
        workDataDao.deleteById(id)
    }
}

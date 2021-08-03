package com.brignerbranch.android.criminalintent.datebase

import android.app.Application
import com.brignerbranch.android.criminalintent.CrimeRepository

class CriminalIntentApplication:Application() {

    override fun onCreate(){
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
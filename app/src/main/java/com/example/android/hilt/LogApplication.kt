/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hilt

import android.app.Application
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.DatabaseLogger
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class LogApplication : Application() {

    @DatabaseLogger
    lateinit var serviceLocator: LoggerDataSource

    override fun onCreate() {
        super.onCreate()
//        serviceLocator = ServiceLocator(applicationContext)
        serviceLocator.addLog("App Log Begin")
    }

}

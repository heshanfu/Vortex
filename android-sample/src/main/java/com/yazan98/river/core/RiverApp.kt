package com.yazan98.river.core

import android.content.Context
import com.yazan98.river.android.common.application.RiverApplicationConfiguration
import com.yazan98.river.android.common.application.app.RiverMultiApplication

/**
 *    Copyright [2019] [Yazan Tarifi]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

class RiverApp : RiverMultiApplication() {

    override fun onCreate() {
        super.onCreate()

        RiverApplicationConfiguration.LocalBuilder()
            .enableStrictMode(this)
            .withCompatVectorEnabled()
            .withPicassoCachingImages(this)


    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}

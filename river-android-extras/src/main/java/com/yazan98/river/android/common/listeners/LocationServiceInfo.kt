
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
package com.yazan98.river.android.common.listeners

/**
 * Created By : Yazan Tarifi
 * Date : 5/4/2019
 * Time : 8:35 PM
 */

data class LocationServiceInfo(
    val interval: Long,
    val fastestInterval: Long,

    //LocationRequest.PRIORITY_HIGH_ACCURACY
    val priority: Int,
    val serviceTargetClass: Class<*>,
    val minTime: Long,
    val minDistance: Float,

    //Criteria.POWER_HIGH
    val criteria: Int
)
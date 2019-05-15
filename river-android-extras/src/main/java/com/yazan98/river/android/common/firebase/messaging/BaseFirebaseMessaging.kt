
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
package com.yazan98.river.android.common.firebase.messaging

import androidx.annotation.CallSuper
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.yazan98.river.android.common.utils.NotificationUtils

/**
 * Created By : Yazan Tarifi
 * Date : 5/4/2019
 * Time : 12:06 PM
 */

abstract class BaseFirebaseMessaging : FirebaseMessagingService() {

    @CallSuper
    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        NotificationUtils.showNotificationWithIntent(
            getNotificationInformation().title,
            getNotificationInformation().content,
            getNotificationInformation().context,
            getNotificationInformation().smallIcon,
            getNotificationInformation().largeIcon,
            getNotificationInformation().reqCode,
            getNotificationInformation().targetClass
        )
    }

    protected abstract fun getNotificationInformation(): FirebaseMessage

}
package com.yazan98.river.android.external.vm

import com.yazan98.river.android.external.vm.base.RiverViewModel
import com.yazan98.river.base.RiverConsts
import com.yazan98.river.base.error.ViewNotAttatchedError
import com.yazan98.river.base.view.BaseView
import com.yazan98.river.base.view.LocalView
import java.lang.ref.WeakReference
import java.util.concurrent.atomic.AtomicBoolean

/**
 *    Copyright 2019 Yazan Tarifi
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

/**
 * Created By : Yazan Tarifi
 * Date : 5/26/2019
 * Time : 9:46 PM
 */

open class RiverLocalViewModel<View: LocalView> : RiverViewModel.RiverLocalViewModelImpl<View>() {

    private lateinit var view: WeakReference<View>
    private val viewStatus: AtomicBoolean = AtomicBoolean(false)

    override fun getView(): View {
        if (::view.isInitialized) {
            return view.get()!!
        } else {
            throw ViewNotAttatchedError(
                RiverConsts.VIEW_NULL
            )
        }
    }

    override fun getViewStatus(): Boolean {
        return this.viewStatus.get()
    }

    override fun attachView(v: View) {
        changeViewStatus(true)
        this.view = WeakReference(v)
    }

    override fun changeViewStatus(newStatus: Boolean) {
        this.viewStatus.set(newStatus)
    }

}
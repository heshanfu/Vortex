import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yazan98.river.base.presenter.RiverRxPresenter
import com.yazan98.river.base.view.NetworkView

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

abstract class RiverNetworkFragment<View : NetworkView, Presenter : RiverRxPresenter<View>, Router> : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): android.view.View? {
        handlePresenterStatus()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    @SuppressLint("CheckResult")
    private fun handlePresenterStatus() {
        getPresenter().getPresenterStatus().subscribe {
            getPresenter().getView().acceptPresenterStatus(it)
        }
    }

    protected abstract fun getPresenter(): Presenter
    protected abstract fun getRouter(): Router

}

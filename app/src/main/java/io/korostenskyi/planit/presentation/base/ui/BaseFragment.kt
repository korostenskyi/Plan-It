package io.korostenskyi.planit.presentation.base.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import timber.log.Timber

abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {

    private val baseActivity: BaseActivity by lazy { activity as BaseActivity }

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    @CallSuper
    override fun onDestroyView() {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onDestroyView")
        super.onDestroyView()
    }

    @CallSuper
    override fun onDestroy() {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }

    companion object {
        private const val LIFECYCLE_TAG = "LifecycleEvent"
    }
}

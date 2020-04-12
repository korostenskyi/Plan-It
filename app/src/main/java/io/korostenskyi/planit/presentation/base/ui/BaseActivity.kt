package io.korostenskyi.planit.presentation.base.ui

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

abstract class BaseActivity(@LayoutRes layoutId: Int) : AppCompatActivity(layoutId) {

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
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

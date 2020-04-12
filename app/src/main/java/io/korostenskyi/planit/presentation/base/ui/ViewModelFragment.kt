package io.korostenskyi.planit.presentation.base.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import io.korostenskyi.planit.presentation.base.viewModel.BaseViewModel

abstract class ViewModelFragment<V : BaseViewModel>(
    @LayoutRes layoutId: Int
) : BaseFragment(layoutId) {

    protected abstract val viewModel: V

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.onCreate()
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.onViewCreated()
        super.onViewCreated(view, savedInstanceState)
    }

    @CallSuper
    override fun onDestroyView() {
        viewModel.onDestroyView()
        super.onDestroyView()
    }

    @CallSuper
    override fun onDestroy() {
        viewModel.onDestroy()
        super.onDestroy()
    }
}

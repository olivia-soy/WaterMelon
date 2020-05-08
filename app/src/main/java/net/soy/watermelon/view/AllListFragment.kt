package net.soy.watermelon.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.soy.watermelon.R
import net.soy.watermelon.base.BaseFragment
import net.soy.watermelon.databinding.FragmentAllListBinding
import net.soy.watermelon.viewmodel.AllListViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AllListFragment : BaseFragment<FragmentAllListBinding>() {

    override var layoutResId = R.layout.fragment_all_list

    private val allListViewModel: AllListViewModel by viewModel()
    private var page: Int = 1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewDataBinding.vm = getViewModel()
        viewDataBinding.setClickListener {
            allListViewModel.searchBook(page)
        }
    }


}
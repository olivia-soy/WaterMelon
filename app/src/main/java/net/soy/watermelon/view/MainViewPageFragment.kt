package net.soy.watermelon.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import net.soy.watermelon.ALL_LIST_INDEX
import net.soy.watermelon.MY_LIST_INDEX
import net.soy.watermelon.R
import net.soy.watermelon.adapter.MainFragmentStateAdapter
import net.soy.watermelon.base.BaseFragment
import net.soy.watermelon.databinding.FragmentMainBinding

class MainViewPageFragment : BaseFragment<FragmentMainBinding>() {

    override var layoutResId = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tab = viewDataBinding.tabs
        val viewpager2 = viewDataBinding.viewpager
        viewpager2.adapter = MainFragmentStateAdapter(this)

        TabLayoutMediator(tab, viewpager2){
                tab, position ->
            tab.text = getTabTitle(position)
            tab.setIcon(getTabIcon(position))
        }.attach()
    }

    private fun getTabIcon(position: Int): Int {
        return when (position) {
            ALL_LIST_INDEX -> R.drawable.ic_toc_24px
            MY_LIST_INDEX -> R.drawable.ic_grade_black_24dp
            else -> throw IndexOutOfBoundsException()
        }
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            ALL_LIST_INDEX -> getString(R.string.all_list_tab)
            MY_LIST_INDEX -> getString(R.string.my_list_tab)
            else -> null
        }
    }

}
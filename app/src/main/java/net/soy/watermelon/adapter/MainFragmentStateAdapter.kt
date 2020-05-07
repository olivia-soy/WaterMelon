package net.soy.watermelon.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import net.soy.watermelon.ALL_LIST_INDEX
import net.soy.watermelon.view.AllListFragment
import net.soy.watermelon.MY_LIST_INDEX
import net.soy.watermelon.view.MyListFragment
import java.lang.IndexOutOfBoundsException


class MainFragmentStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount() =  tabFragments.size

    private val tabFragments: Map<Int, () -> Fragment> = mapOf(
        ALL_LIST_INDEX to { AllListFragment() },
        MY_LIST_INDEX to { MyListFragment() }
    )

    override fun createFragment(position: Int) = tabFragments[position]?.invoke() ?: throw IndexOutOfBoundsException()
}
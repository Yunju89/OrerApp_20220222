package org.techtown.orerapp_20220222.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.techtown.orerapp_20220222.fragments.MyProfileFagment
import org.techtown.orerapp_20220222.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() =2

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFagment()
        }
    }
}
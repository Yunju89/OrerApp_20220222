package org.techtown.orerapp_20220222.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.orerapp_20220222.R

class PizzaStoreListFragment : Fragment () {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list,container,false)   // xml 끌어오기
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {       // 프래그먼트 동작
        super.onActivityCreated(savedInstanceState)

//        피자가게 리스트뷰의 동작 코드
    }
}
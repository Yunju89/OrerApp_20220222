package org.techtown.orerapp_20220222.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*
import org.techtown.orerapp_20220222.R
import org.techtown.orerapp_20220222.ViewStoreDetailActivity
import org.techtown.orerapp_20220222.adapters.StoreAdapter
import org.techtown.orerapp_20220222.datas.StoreData

class PizzaStoreListFragment : Fragment () {

    val mPizzaStoreList = ArrayList<StoreData>()
    lateinit var mPizzaStoreAdapter : StoreAdapter      //화면이 만들어진 후 대입해야 해서 lateinit var

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
        setupEvents()
        setValues()

    }

    fun setupEvents(){

        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickStore = mPizzaStoreList[position]

            val myIntent = Intent(requireContext(),ViewStoreDetailActivity::class.java)        //액티비티가 아니기때문에 requireContext
            myIntent.putExtra("store",clickStore)                                       // putExtra 담길 class 는 Serializable 상속 받아야함.
            startActivity(myIntent)
        }

    }
    fun setValues(){
        mPizzaStoreList.add(StoreData("피자헛",4.5, "1588-5588", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStoreList.add(StoreData("파파존스", 3.5, "1577-8080", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        mPizzaStoreList.add(StoreData("도미노피자", 5.0, "1577-3082", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"))
        mPizzaStoreList.add(StoreData("미스터피자", 4.toDouble(), "1577-0077", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"))

        mPizzaStoreAdapter = StoreAdapter(requireContext(), R.layout.store_list_item, mPizzaStoreList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter

    }

}
package org.techtown.orerapp_20220222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.techtown.orerapp_20220222.adapters.MainViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : MainViewPagerAdapter          //자료형만 입력

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents(){
    }

    fun setValues(){

        mAdapter = MainViewPagerAdapter(supportFragmentManager)      //프래그먼트매니저 받는
        mainViewPager.adapter = mAdapter                            //mainViewPager 어댑터 연결

    }
}
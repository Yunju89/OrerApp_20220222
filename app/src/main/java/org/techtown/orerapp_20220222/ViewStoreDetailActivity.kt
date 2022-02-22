package org.techtown.orerapp_20220222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import org.techtown.orerapp_20220222.datas.StoreData
import java.lang.System.load

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues(){

        Glide.with(this).load(mStoreData.logoImageUrl).into(imgLogo)

        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.PhoneNum
        ratingBar.rating = mStoreData.rating.toFloat()
        txtRating.text = "${mStoreData.rating}"

    }
}
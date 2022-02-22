package org.techtown.orerapp_20220222.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_profile.*
import org.techtown.orerapp_20220222.EditNicknameActivity
import org.techtown.orerapp_20220222.R

class MyProfileFagment : Fragment () {

    val REQ_CODE_NICKNAME = 2000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile,container,false)   // xml 끌어오기
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {       // 프래그먼트 동작
        super.onActivityCreated(savedInstanceState)
//        내 정보 화면의 동작 코드

        setupEvents()
        setValues()

    }

    fun setupEvents(){

        btnEditNickname.setOnClickListener {

            val myIntent = Intent(requireContext(), EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)


        }

    }

    fun setValues(){

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_CODE_NICKNAME){
            if(resultCode == Activity.RESULT_OK) {
                val nickname = data!!.getStringExtra("nick")
                txtNickname.text = nickname
            }
        }

    }

}
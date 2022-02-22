package org.techtown.orerapp_20220222.adapters

import android.content.Context
import android.widget.ArrayAdapter
import org.techtown.orerapp_20220222.datas.StoreData

class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StoreData>
    ) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}
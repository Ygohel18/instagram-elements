package com.uigitdev.instagramelements.preview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uigitdev.instagramelements.R
import com.uigitdev.instagramelements.util.MUtil
import kotlinx.android.synthetic.main.activity_preview_1.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_1)
        initUI()
    }

    private fun initUI(){
        item_element_1.setText("uigitdev")
        item_element_1.setLabel("David Toth")
        item_element_1.setFollowButtonText("Follow me")
        item_element_1.setImageURL("https://uigitdev.com/wp-content/uploads/2021/04/logo.png")
        item_element_1.getFollowButton()!!.setOnClickListener { MUtil.openIG(this) }
        item_element_1.getItemButton()!!.setOnClickListener { MUtil.openIG(this) }
    }
}
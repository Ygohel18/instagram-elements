package com.uigitdev.instagramelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uigitdev.instagramelements.preview.PreviewActivity
import com.uigitdev.instagramelements.util.MUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startPreview()
    }

    private fun startPreview(){
        button_1.setOnClickListener {
            MUtil.openActivity(this, PreviewActivity::class.java)
        }
    }
}
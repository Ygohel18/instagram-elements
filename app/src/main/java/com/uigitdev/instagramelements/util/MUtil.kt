package com.uigitdev.instagramelements.util

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

class MUtil {

    companion object {

        fun openActivity(context: AppCompatActivity, nextContext: Class<*>) {
            context.startActivity(Intent(context, nextContext))
        }

        fun openIG(context: AppCompatActivity) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/uigitdev/")
                )
            )
        }
    }
}
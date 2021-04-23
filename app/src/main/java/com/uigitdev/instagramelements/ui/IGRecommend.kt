package com.uigitdev.instagramelements.ui

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.bumptech.glide.Glide
import com.uigitdev.instagramelements.R
import kotlinx.android.synthetic.main.ui_ig_recommend.view.*

class IGRecommend(context: Context, attributeSet: AttributeSet): RelativeLayout(context, attributeSet) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.ui_ig_recommend, this, true)
    }

    fun setText(text: String?) {
        item_text.text = text
    }

    fun setTextColor(color: String?) {
        item_text.setTextColor(Color.parseColor(color))
    }

    fun setLabel(text: String?) {
        item_label.text = text
    }

    fun setLabelColor(color: String?) {
        item_label.setTextColor(Color.parseColor(color))
    }

    fun setItemBackgroundColor(color: String?) {
        item_card_parent.setCardBackgroundColor(Color.parseColor(color))
    }

    fun setFollowButtonBackgroundColor(color: String?) {
        item_follow_button_card_parent.setCardBackgroundColor(Color.parseColor(color))
    }

    fun setFollowButtonText(text: String?) {
        item_button_text.text = text
    }

    fun setFollowButtonTextColor(color: String?) {
        item_button_text.setTextColor(Color.parseColor(color))
    }

    fun setImageURL(imageURL: String?) {
        Glide.with(this).load(imageURL).centerCrop().into(item_picture)
    }

    fun getFollowButton(): RelativeLayout? {
        return this.item_follow_button_click_parent
    }

    fun getItemButton(): RelativeLayout? {
        return this.item_parent
    }
}
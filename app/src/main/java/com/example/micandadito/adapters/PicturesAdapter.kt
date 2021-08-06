package com.example.micandadito.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.example.micandadito.R
import com.example.micandadito.model.ImagenesJson


class PicturesAdapter(private val context: Context?, info: List<ImagenesJson>) :
    PagerAdapter() {

    private var myList = info.map { it.imagenes }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view === `object`
    }

    override fun getCount(): Int {

        return myList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view =
            LayoutInflater.from(context).inflate(R.layout.image_slider_item, container, false)
        val image = view.findViewById<ImageView>(R.id.imageView_slide)

        Glide.with(view)
            .load(myList[position])
            .into(image)

        val vp = container as ViewPager
        vp.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val view = `object` as View
        vp.removeView(view)
    }
}

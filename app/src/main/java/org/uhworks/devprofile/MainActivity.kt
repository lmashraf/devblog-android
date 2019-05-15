package org.uhworks.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a bitmap
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)

        // Round the bitmap
        rounded.cornerRadius = 20f
        //rounded.isCircular = true

        // Set the UI image to the rounded bitmap
        logoImg.setImageDrawable(rounded)
    }
}

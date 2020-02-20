package com.diego.anvil.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import trikita.anvil.RenderableView

abstract class RenderableActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(object: RenderableView(this) {
            override fun view() {
                content()
            }
        })
    }

    abstract fun content()

}

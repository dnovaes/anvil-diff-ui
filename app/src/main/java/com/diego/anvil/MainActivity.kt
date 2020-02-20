package com.diego.anvil

import android.graphics.Color
import android.widget.LinearLayout.VERTICAL
import android.widget.Toast
import com.diego.anvil.activities.RenderableActivity
import trikita.anvil.DSL.*

class MainActivity : RenderableActivity() {

    override fun content() {
        val size = 500
        linearLayout {
            width(MATCH)
            height(MATCH)
            weightSum(10f)
            orientation(VERTICAL)

            scrollView {
                width(MATCH)
                height(0)
                weight(9f)

                linearLayout {
                    backgroundColor(Color.DKGRAY)
                    orientation(VERTICAL)

                    for (i in 0..size) {
                        row(i)
                    }
                }
            }

            button {
                text("render")
                onClick {
                    Toast.makeText(this@MainActivity, "render firing!!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun row(i: Int) {
        linearLayout {
            textView {
                text("$i setText")
                textColor(Color.WHITE)
                margin(dip(10))
            }
            textView {
                text("$i setText")
                textColor(Color.RED)
                margin(dip(10))
            }
            textView {
                text("$i setText")
                textColor(Color.BLUE)
                margin(dip(10))
            }
            textView {
                text("$i setText")
                textColor(Color.YELLOW)
                margin(dip(10))
            }
            textView {
                text("$i setText")
                textColor(Color.MAGENTA)
                margin(dip(10))
            }
        }
    }
}

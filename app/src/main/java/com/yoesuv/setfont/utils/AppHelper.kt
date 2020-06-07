package com.yoesuv.setfont.utils

import android.os.Build

fun lOrAbove(body:() -> Unit) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        body()
    }
}
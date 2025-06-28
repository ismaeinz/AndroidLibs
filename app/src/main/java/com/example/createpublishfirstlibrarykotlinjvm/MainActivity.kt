package com.example.createpublishfirstlibrarykotlinjvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.createpublishfirstlibrarykotlinjvm.ui.theme.CreatePublishFirstLibraryKotlinJVMTheme
import com.example.mylibrary.lib.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreatePublishFirstLibraryKotlinJVMTheme {
                ImagePreview()
            }
        }
    }
}
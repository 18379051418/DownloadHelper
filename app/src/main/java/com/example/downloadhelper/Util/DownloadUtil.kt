package com.example.downloadhelper.Util

import android.content.Context
import com.example.downloadhelper.base.IDownload
import java.io.File

class DownloadUtil(val context : Context) : IDownload{

    override fun downloadFile(url: String): File? {
        if(isLegalUrl(url)){
            throw IllegalArgumentException("error url")
        }
        return null
    }

    private fun isLegalUrl(url : String) : Boolean{
        return url.startsWith("http")
    }
}
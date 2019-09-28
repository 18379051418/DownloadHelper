package com.example.downloadhelper.base

import java.io.File

interface IDownload {
    fun downloadFile(url : String) : File?
}
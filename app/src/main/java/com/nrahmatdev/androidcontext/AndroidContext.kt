package com.nrahmatdev.androidcontext

import android.app.Application
import android.content.Context
import android.util.Log
import kotlin.jvm.internal.Intrinsics

open class AndroidContext : Application() {

    companion object {

        private lateinit var mAppContext: Context

        private fun setAppContext(con: Context) {
            mAppContext = con
        }

        fun getAppContext(): Context {
            if (mAppContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAppContext")
            }
            return mAppContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        setAppContext(this as Context)
        if (mAppContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAppContext")
        }
        this.initiate(mAppContext)
    }

    private fun initiate(context: Context?) {
        Intrinsics.checkParameterIsNotNull(context, "context")
        Log.i(
            AndroidContext::class.java.getName(),
            Thread.currentThread().stackTrace[5].methodName + " called"
        )
    }
}

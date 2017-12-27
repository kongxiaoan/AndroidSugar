package cn.tcm.androidsugar

import android.app.Application
import com.orm.SugarContext

/**
 * Created by mr.kong on 2017/12/27.
 * 配置的时候一般在Application 中进行初始化
 */
class AndroidSugarApplication : Application() {
	override fun onCreate() {
		super.onCreate()
	}

	override fun onTerminate() {
		super.onTerminate()
		SugarContext.terminate()
	}
}
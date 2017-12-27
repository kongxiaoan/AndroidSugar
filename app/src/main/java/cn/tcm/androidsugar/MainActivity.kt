package cn.tcm.androidsugar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.tcm.androidsugar.table.Book
import com.orm.SugarRecord
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
	override fun onClick(v: View) {
		when (v.id) {
			R.id.button_insert -> {
				val book = Book("《平凡的世界》", "路遥")
				SugarRecord.save(book)
			}
			R.id.button_delete -> {
			}
			R.id.button_update -> {
			}
			R.id.button_select -> {
			}
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		initClick()
	}

	private fun initClick() {
		button_insert.setOnClickListener(this)
		button_delete.setOnClickListener(this)
		button_update.setOnClickListener(this)
		button_select.setOnClickListener(this)
	}
}

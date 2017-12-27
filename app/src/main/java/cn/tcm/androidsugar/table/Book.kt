package cn.tcm.androidsugar.table

import com.orm.dsl.Table

/**
 * Created by mr.kong on 2017/12/27.
 */
@Table
class Book {
	var id: Long = 0

	var title: String = ""
	var edition: String = ""

	constructor(title: String, edition: String) {
		this.title = title
		this.edition = edition
	}
}
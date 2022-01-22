/**Dto型の検索結果、入力パラメータ　の　setter、getterを記述*/
package com.example.demo.form;

import com.example.demo.dto.BookInfoDto;

/**
 * @author user
 *
 */
public class ExForm {

	//入力パラメータ
	private String id;
	
	//検索結果
	private BookInfoDto bookInfo;

	
	//各　setter　getter
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setBookInfo(BookInfoDto bookInfo) {
		this.bookInfo = bookInfo;
	}

	public BookInfoDto getBookInfo() {
		return bookInfo;
	}
}

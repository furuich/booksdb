/** DAO →　DTO　→　Service 
 * 取得したいデータのカラム名をキャメルケースで定義
 * 　→　private　フィールド　, getter　,　setter
 */
package com.example.demo.dto;

import org.springframework.stereotype.Component;

//spring　フレームワークに　DTOだとわかるように記述する
/**
 * @author user
 *
 */
@Component
public class BookInfoDto {

	/** 本のID */
	private String id;

	/** 本のタイトル */
	private String title;

	/** 本の著者名 */
	private String author;

	/** 本のジャンル */
	private String category;

	/** 本の保管場所コード */
	private String depositoryCd;

	// setter getter
	/**
	 * IDのsetter
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * IDのgetter
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * title setter
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * title getter
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 著者名 setter
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 著者名 getter
	 * 
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * category setter
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * category getter
	 * 
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 保管場所コード setter
	 * 
	 * @param depositoryCd
	 */
	public void setDepositoryCd(String depositoryCd) {
		this.depositoryCd = depositoryCd;
	}

	/**
	 * 保管場所コード getter
	 * 
	 * @return depositoryCd
	 */
	public String getDepositoryCd() {
		return depositoryCd;
	}

}

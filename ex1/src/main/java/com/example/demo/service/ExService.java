package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookInfoDto;
import com.example.demo.form.ExForm;
import com.example.demo.mapper.BookInfoDaoMapper;

//Controller　→Service　→　DAOMapper
//DTO　→　Service　→　Controller

//検索機能の実装をする。DAOクラスを利用して、結果をsetする

/**
 * 画面から受け取ったidを使ってDB検索 →結果をFormを通して設定する DB検索 → DAOMapper型 Mapperを使う Mapperを使う →
 * Autowiredで DIコンテナからインスタンスを生成する
 * 
 */

@Service
public class ExService {

	// 上り（検索のための記述）
	@Autowired
	private BookInfoDaoMapper mapper;

	public void select(ExForm form) {

		BookInfoDto bookInfo = null;

//下り
		// 値が入力された場合に、KenshuForm.javaのsetterを呼んで、
		// 上のformに格納する →Controllerに返す

		if (form.getId() != null) {

			// mapperの、String idに ID（入力パラメータ）を詰めて、selectに渡す
			bookInfo = mapper.select(form.getId());

			// その結果をform.setで詰めてる
			form.setBookInfo(bookInfo);
			
			// 入力されたら、DAOMapperの（DAO型mapper の.selectで） select メソッドが動く。
			// そして、Form型 form.setterを呼んで、Dto型に結果を格納する。
		}

	}

}

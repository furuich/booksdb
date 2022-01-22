package com.example.demo.mapper;
//データリソースにアクセスするオブジェクト

//I/Fであることを利用して、抽象メソッドを用いてSQL文を隠匿することもできる

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.BookInfoDto;
//Dtoをimport する

@Mapper
public interface BookInfoDaoMapper {

	public BookInfoDto select(String id);

//Dto型で戻る　、select　を　IDを渡して実行する
	//　→　入力パラメータ（ID）で検索した結果を、BookInfoDtoに格納して返す
	//select　を実行して、結果をDto型に格納する
}

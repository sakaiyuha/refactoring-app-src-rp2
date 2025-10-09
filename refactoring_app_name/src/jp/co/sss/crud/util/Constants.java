package jp.co.sss.crud.util;

public class Constants {
	public static final String TARGET_PERSON_NONE = "該当者はいませんでした";

	public static final int GENDER_MEN = 1;
	//男性
	public static final int GENDER_WOMEN = 2;
	//女性
	public static final int GENDER_NO_ANSWER = 0;
	//回答なし
	public static final int GENDER_OTHER = 9;
	//該当なし

	//営業部
	public static final int SALES_DEPARTMENT = 1;

	//経理部
	public static final int ACCOUNTING_DEPARTMENT = 2;

	//総務部
	public static final int GENERAL_AFFAIRS_PART = 3;

	//検索条件となる値をバインド
	public static final int FOR_SEARCH = 1;

	//入力値バインド用
	public static final int BIND_NAME = 1;

	public static final int BIND_GENDER = 2;

	public static final int BIND_BIRTHDAY = 3;

	public static final int BIND_DEPTID = 4;

	public static final int BIND_EMPID = 5;

	//case文用

	public static final int MENU_ALL = 1;

	public static final int MENU_EMPNAME = 2;

	public static final int MENU_DEPTID = 3;

	public static final int MENU_REGIST = 4;

	public static final int MENU_UPDATE = 5;

	public static final int MENU_DELETE = 6;

	public static final int MENU_END = 7;

}

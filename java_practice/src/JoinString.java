// 文字の結合の確認クラス
public class JoinString {
	// メインメソッド
	public static void main(String[] args) {
		// 変数の宣言
		String str1 = "aa";
		String str2 = "bbb";

		// 文字の結合の出力
		System.out.println(str1 + str2);	// 変数同士の結合
		System.out.println(str1 + "cccc");	// 値とも結合出来る
		// 処理の結果は変数に直接設定出来る
		String str3 = str2 + "!!!";
		System.out.println(str3);
		// 文字に+する場合は数字でも文字として扱う
		System.out.println(str1 + 100);
	}
}
// 論理演算子の例クラス
public class LogicOperator {
	// メインメソッド
	public static void main(String[] args) {
		// 性別
		String sex = "男性";
		// 年齢
		int age = 20;

		// 出力メッセージ
		String printMessage;
		// 女性、もしくは小学生(12歳)以下の子供、もしくは75歳以上の高齢の人
		if ( sex.equals("女性") || age <= 12 || age >= 75 ) {
			// 女性専用車両に乗れます
			printMessage = "女性専用車両に乗れます";
		}
		// その他の場合
		else {
			// 通報します
			printMessage = "おまわりさんこいつです";
		}
		// メッセージ出力
		System.out.println(printMessage);
	}
}

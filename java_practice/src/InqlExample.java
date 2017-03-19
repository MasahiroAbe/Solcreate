//
public class InqlExample {
	// メインメソッド
	public static void main(String[] args) {
		// パラメーター
		int weight = 109;

		// 出力メッセージ
		String printMessage;
		// パラメーターが100を超える場合
		if ( weight > 100 ) {
			// 忠告のメッセージ設定
			printMessage = "まず痩せようか？";
		}
		// パラメーターが100と等しい場合
		else if ( weight == 100 ) {
			// 忠告のメッセージ設定
			printMessage = "あと少し！";
		}
		// その他、パラメーターが100未満の場合
		else {
			// 忠告のメッセージ設定
			printMessage = "よく頑張った！";
		}
		// メッセージ出力
		System.out.println(printMessage);
	}
}

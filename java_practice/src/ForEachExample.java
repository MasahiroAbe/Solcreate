// ForEach文の例クラス
public class ForEachExample {
	// メインメソッド
	public static void main(String[] args) {
		// 配列の宣言
		int[] params = { 10, 23, 96, 47, 80 };
		// カウンタ変数の初期化
		int i = 0;
		// 配列の終わりまでループする
		for (int param: params) {
			// 文字の出力
			System.out.println(
					i + "番目のパラメーターは" + params[i] + "です。");
			// カウンタのカウントアップ
			i++;
		}
	}
}
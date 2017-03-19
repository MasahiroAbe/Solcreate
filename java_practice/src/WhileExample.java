// while文の例クラス
public class WhileExample {
	// メインメソッド
	public static void main(String[] args) {
		// 配列の宣言
		int[] params = { 10, 23, 96, 47, 80 };
		// カウンタ変数の初期化
		int i = 0;
		// 配列の終わりまでループする
		while (i < 5) {
			// 文字の出力
			System.out.println(
				i + "番目のパラメーターは" + params[i] + "です。");
			// カウンタのカウントアップ
			i++;
		}
	}
}
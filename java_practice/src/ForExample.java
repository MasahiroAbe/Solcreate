// For文の例クラス
public class ForExample {
	// メインメソッド
	public static void main(String[] args) {
		// 配列の宣言
		int[] params = { 10, 23, 96, 47, 80 };
		// 配列の終わりまでループする
		for (int i = 0; i < 5; i++) {
			// 文字の出力
			System.out.println(
				i + "番目のパラメーターは" + params[i] + "です。");
		}
	}
}
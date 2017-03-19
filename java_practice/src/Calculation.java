// 算術演算子の確認クラス
public class Calculation {
	// メインメソッド
	public static void main(String[] args) {
		// 変数の宣言
		int x = 3;
		int y = 21;

		// 算術演算子の出力
		System.out.println(x + y); // 和
		System.out.println(y - x); // 差
		System.out.println(x * 15); // 積 変数と値でも計算出来る
		// 処理の結果は変数に直接設定出来る
		int z = y / x;
		System.out.println(z); // 商
		System.out.println(y % 4); // 余り
	}

}

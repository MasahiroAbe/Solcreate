// 年齢出力クラス
public class PrintAge {
	// メインメソッド
	public static void main(String[] args) {
		// コマンドから入力された数値を受け取る　→1
		String strBirthYear = args[0];
		// 文字列では計算出来ないので数値に変換
		int birthYear = Integer.parseInt(strBirthYear);
		// 年齢を計算　→2
		int age = 2017 - birthYear;

		// 誕生年を出力　→3
		System.out.println("貴方の誕生年は " + birthYear + " です。");
		// 年齢を出力　→4
		System.out.println("貴方は今年 " + age + " 歳 になります。");
	}
}
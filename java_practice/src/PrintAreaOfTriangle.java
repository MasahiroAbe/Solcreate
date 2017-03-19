// 三角形の面積出力クラス
public class PrintAreaOfTriangle {
	// メインメソッド
	public static void main(String[] args) {
		// コマンドから底辺を受け取る
		String strX = args[0];
		// コマンドから底辺を受け取る
		String strY = args[1];

		// 底辺を数値に型変換する
		int x = Integer.parseInt(strX);
		// 高さを数値に型変換する
		int y = Integer.parseInt(strY);

		// 三角形の面積を算出(底辺✕高さ÷2)
		int areaOfTriangle = x * y / 2;

		// 三角形の面積を出力　→3
		System.out.println("三角形の面積は " + areaOfTriangle + " です。");
	}
}
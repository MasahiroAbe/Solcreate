// 九九の計算
public class MultiplicationTable {
	// メインメソッド
	public static void main(String[] args) {
		// かけ算用の数字の配列
		int[] numberList1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // その1
		int[] numberList2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // その2

		// 数字の配列1の数だけ繰り返し
		for (int i = 0; i < 9; i++) {
			// 1から2、6から9の段だけ処理する
			if (numberList1[i] < 3 || 5 < numberList1[i]) {
				// ・・・の段を出力
				System.out.println("■かけ算：" + (i + 1) + "の段");

				// かけ算の回数だけ繰り返し
				for (int j = 0; j < 9; j++) {
					// かけ算実施
					int result = numberList1[i] * numberList2[j];

					System.out.println(numberList1[i] + " × " + numberList2[j] + " ＝ " + result);
				}
			}
		}
	}
}
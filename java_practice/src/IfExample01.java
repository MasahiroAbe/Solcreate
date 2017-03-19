// 条件文の例クラス その1
public class IfExample01 {
	// メインメソッド
	public static void main(String[] args) {
		// 死亡セリフ
		String deadMessage = "俺、この戦争が終わったら結婚するんだ";

		// 出力メッセージ
		String printMessage = "貴方は死にました。。。";
		// 入力値と死亡セリフが一致しない場合
		if ( !deadMessage.equals(args[0]) ) {
			// 生還メッセージ
			printMessage = "貴方は助かりました。";
		}
		// メッセージ出力
		System.out.println(printMessage);
	}
}

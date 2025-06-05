/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driverr {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 商品のインスタンス化・情報表示
		Product prod = new Product("キーボード", 2000);
		System.out.println();
		prod.display();

		// 値上げ・情報表示
		prod.up(1000);
		System.out.println();
		prod.display();
	}
}

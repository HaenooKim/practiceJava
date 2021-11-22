interface ICallback {
	public void onEvent(int i);
}


class Button {
	public void onClick(ICallback cb) {
		System.out.println("onclick...");
		if (cb != null) {
			cb.onEvent(100);
		}
	}
}



public class Test120 {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.onClick(new ICallback() {
			public void onEvent(int i) {
				System.out.println("onEvent XX" + i);
			}
		});
	}
}
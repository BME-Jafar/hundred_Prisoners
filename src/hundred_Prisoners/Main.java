package hundred_Prisoners;

public class Main {
	public static void main(String[] args) {
		final App app = AppFactory.createApp(args);
		if (null == app)
			return;
		app.run();
	}
}

package hundred_Prisoners;

public class AppFactory {
    private AppFactory() {
    }
    public static App createApp(String[] args) {
        if (args.length != 2) {
            return null;
        }
          try {
                return new App(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            } catch (Exception e) {
                return null;
            }
        } 
    }


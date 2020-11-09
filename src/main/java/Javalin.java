import io.javalin.Javalin;
public class Javalin {



    public class HelloWorld {
        public static void main(String[] args) {
            Javalin app = Javalin.create().start(9090);
            app.get("/", ctx -> ctx.result("Hello World"));
        }
    }

}

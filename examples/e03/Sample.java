import org.graalvm.polyglot.*;
import java.io.*;
public class Sample {
  public static void main(String[] args) throws Exception {
    File f = new File("hello.bc");
    Source source = Source.newBuilder("llvm",
      new File("hello.bc")).build();
    try (Context context =
      Context.newBuilder().allowAllAccess(true).build()) {
      context.eval(source).execute();
    }
} }

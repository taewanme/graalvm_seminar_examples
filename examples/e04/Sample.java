import org.graalvm.polyglot.*; 
public class Sample { 
    public static void main(String[] args) { 
        try (Context context = Context.newBuilder().allowAllAccess(true).build()){ 
            System.out.println( context.getEngine().getLanguages().keySet()); 
            context.eval("ruby", "puts '안녕, 루비'"); 
            context.eval("python", "print('안녕, 파이썬')"); 
            context.eval("js", "console.log('안녕, JS')"); 
            context.eval("R", "cat('안녕, R')"); 
        } catch (PolyglotException e) { 
            e.printStackTrace(); 
        } 
    } 
} 



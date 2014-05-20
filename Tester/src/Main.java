
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;


import com.rocketscience.CLexer;
import com.rocketscience.CParser;


public class Main {
	public static void main(String[] params) throws IOException {
String path="C:/Users/Piotr/workspaceKepler/Test/src/Test.c";
ArrayList<String>listOfErrors;
		List<String> lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
		
		String text=new String(Files.readAllBytes(Paths.get(path)));
		System.out.println(text);
		
		ANTLRInputStream input = new ANTLRFileStream(path);
		CLexer lexer = new CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree =parser.compilationUnit();
        listOfErrors=parser.compilationUnit().listOfErrors;
        
        for(String gramErr:listOfErrors){
        	System.out.println(gramErr);
        }
        tree.inspect(parser); 
	}
}
 
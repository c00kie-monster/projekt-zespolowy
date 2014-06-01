import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.rocketscience.CLexer;
import com.rocketscience.CParser;

public class Main {
	public static void main(String[] params) throws IOException {
		String path = "C:/Users/Piotr/workspaceKepler/Test/src/Test.c";
		ArrayList<ArrayList<String>> listOfErrors;
		List<String> lines = Files.readAllLines(Paths.get(path),
				Charset.defaultCharset());
		String text = new String(Files.readAllBytes(Paths.get(path)));

		ANTLRInputStream input = new ANTLRFileStream(path);
		CLexer lexer = new CLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CParser parser = new CParser(tokens);
		parser.setBuildParseTree(true);
		// ParserRuleContext tree =parser.compilationUnit();    wykomentowane poniewaz pojawialy sie zdublowane tablice
		listOfErrors = parser.compilationUnit().resultLists;
		for (ArrayList<String> list : listOfErrors) {
			for (String value : list) {
				System.out.println(value);
			}
		}
		// tree.inspect(parser);
	}
}

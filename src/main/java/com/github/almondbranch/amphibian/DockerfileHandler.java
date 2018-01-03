package com.github.almondbranch.amphibian;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class DockerfileHandler {
    public static String toShellScript(String dockerfile) throws Exception, RecognitionException {
        DockerfileLexer lexer = new DockerfileLexer(CharStreams.fromString(dockerfile.trim()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DockerfileParser parser = new DockerfileParser(tokens);
	//ParseTree parseTree = parser.input();

	DockerfileVisitorImpl visitor = new DockerfileVisitorImpl();
	return "";
        //return visitor.visit(parseTree);
    }
}

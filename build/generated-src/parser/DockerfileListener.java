// Generated from /home/ubuntu/code/amphibian/src/main/antlr4/Dockerfile.g4 by ANTLR 4.2.2
package com.github.almondbranch.amphibian;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DockerfileParser}.
 */
public interface DockerfileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DockerfileParser#runLine}.
	 * @param ctx the parse tree
	 */
	void enterRunLine(@NotNull DockerfileParser.RunLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DockerfileParser#runLine}.
	 * @param ctx the parse tree
	 */
	void exitRunLine(@NotNull DockerfileParser.RunLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link DockerfileParser#commentLine}.
	 * @param ctx the parse tree
	 */
	void enterCommentLine(@NotNull DockerfileParser.CommentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DockerfileParser#commentLine}.
	 * @param ctx the parse tree
	 */
	void exitCommentLine(@NotNull DockerfileParser.CommentLineContext ctx);
}
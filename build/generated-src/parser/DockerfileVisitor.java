// Generated from /home/ubuntu/code/amphibian/src/main/antlr4/Dockerfile.g4 by ANTLR 4.2.2
package com.github.almondbranch.amphibian;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DockerfileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DockerfileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DockerfileParser#runLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunLine(@NotNull DockerfileParser.RunLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link DockerfileParser#commentLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentLine(@NotNull DockerfileParser.CommentLineContext ctx);
}
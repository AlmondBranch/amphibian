// Generated from /home/ubuntu/code/amphibian/src/main/antlr4/Dockerfile.g4 by ANTLR 4.2.2
package com.github.almondbranch.amphibian;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link DockerfileVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class DockerfileBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DockerfileVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRunLine(@NotNull DockerfileParser.RunLineContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCommentLine(@NotNull DockerfileParser.CommentLineContext ctx) { return visitChildren(ctx); }
}
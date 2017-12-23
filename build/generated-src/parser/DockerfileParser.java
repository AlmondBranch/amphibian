// Generated from /home/ubuntu/code/amphibian/src/main/antlr4/Dockerfile.g4 by ANTLR 4.2.2
package com.github.almondbranch.amphibian;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DockerfileParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2;
	public static final String[] tokenNames = {
		"<INVALID>", "'RUN'", "'#'"
	};
	public static final int
		RULE_commentLine = 0, RULE_runLine = 1;
	public static final String[] ruleNames = {
		"commentLine", "runLine"
	};

	@Override
	public String getGrammarFileName() { return "Dockerfile.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DockerfileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommentLineContext extends ParserRuleContext {
		public CommentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DockerfileListener ) ((DockerfileListener)listener).enterCommentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DockerfileListener ) ((DockerfileListener)listener).exitCommentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DockerfileVisitor ) return ((DockerfileVisitor<? extends T>)visitor).visitCommentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentLineContext commentLine() throws RecognitionException {
		CommentLineContext _localctx = new CommentLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commentLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); match(2);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1 || _la==2) {
				{
				{
				setState(5);
				matchWildcard();
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunLineContext extends ParserRuleContext {
		public RunLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DockerfileListener ) ((DockerfileListener)listener).enterRunLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DockerfileListener ) ((DockerfileListener)listener).exitRunLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DockerfileVisitor ) return ((DockerfileVisitor<? extends T>)visitor).visitRunLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunLineContext runLine() throws RecognitionException {
		RunLineContext _localctx = new RunLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_runLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); match(1);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1 || _la==2) {
				{
				{
				setState(12);
				matchWildcard();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\4\25\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\7\2\t\n\2\f\2\16\2\f\13\2\3\3\3\3\7\3\20\n\3\f\3\16\3\23"+
		"\13\3\3\3\2\2\4\2\4\2\2\24\2\6\3\2\2\2\4\r\3\2\2\2\6\n\7\4\2\2\7\t\13"+
		"\2\2\2\b\7\3\2\2\2\t\f\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\3\3\2\2\2\f"+
		"\n\3\2\2\2\r\21\7\3\2\2\16\20\13\2\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\5\3\2\2\2\23\21\3\2\2\2\4\n\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
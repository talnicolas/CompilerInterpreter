/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

import java.io.*;

public class Lexer {

  private final BufferedReader br;
  private final StringBuilder buffer = new StringBuilder();
  private boolean eof;
  private int line = 1;
  private int pos = 1;
  private boolean last_is_cr;
  private StringBuilder sb;
  private int acceptLine;
  private int acceptPos;
  private int current_sb_length;
  private boolean sb_contains_eof;
  private int marker0;

  void setMarker0() {
    this.marker0 = this.current_sb_length;
  }

  public Lexer(Reader reader) {

    this.br = new BufferedReader(reader);
  }

  public Token next()
      throws LexerException, IOException {
    Token token;
    do {
      token = internalNext();
    } while (token == null);
    return token;
  }

  Token internalNext()
      throws LexerException, IOException {

    boolean first = true;

    StringBuilder sb = new StringBuilder();
    State state = S_0.instance;

    while(state.getStateType() == State.StateType.TRANSITION) {
      TransitionState transitionState = (TransitionState) state;

      this.current_sb_length = sb.length();
      transitionState.setMarker(this);

      Symbol symbol;
      if(buffer.length() > 0) {
        char c = buffer.charAt(0);
        buffer.deleteCharAt(0);

        sb.append(c);
        symbol = Symbol.getSymbol(c);
      }
      else if(this.eof) {
        if(sb.length() == 0) {
          return new End(this.line, this.pos);
        }
        this.sb_contains_eof = true;
        symbol = Symbol.Symbol_end;
      }
      else {
        int i = br.read();
        if(i == -1) {
          this.eof = true;
          br.close();

          if(sb.length() == 0) {
            return new End(this.line, this.pos);
          }
          this.sb_contains_eof = true;
          symbol = Symbol.Symbol_end;
        }
        else {
          char c = (char) i;

          sb.append(c);
          symbol = Symbol.getSymbol(c);
        }
      }

      if(symbol == null) {
        throw new LexerException(sb.charAt(0), this.line, this.pos);
      }

      state = transitionState.getTarget(symbol);

      if(state == null) {
        throw new LexerException(sb.charAt(0), this.line, this.pos);
      }
    }

    FinalState finalState = (FinalState) state;

    this.sb = sb;

    return finalState.getToken(this);
  }

  int getAcceptLine() {
    return this.acceptLine;
  }

  int getAcceptPos() {
    return this.acceptPos;
  }

  private void updateLinePos(String text) {
    if(this.last_is_cr) {
      if(text.length() > 0) {
        if(text.charAt(0) != 10) {
          this.last_is_cr = false;
          this.line++;
          this.pos = 1;
        }
      }
      else if(this.buffer.length() > 0) {
        if(this.buffer.charAt(0) != 10) {
          this.last_is_cr = false;
          this.line++;
          this.pos = 1;
        }
      }
    }

    this.acceptLine = line;
    this.acceptPos = pos;

    for(int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);

      if(c == 10) {
        this.line++;
        this.pos = 1;
      }
      else {
        if(last_is_cr) {
          this.line++;
          this.pos = 2;
        }
        else {
          this.pos++;
        }
      }

      this.last_is_cr = c == 13;
    }
  }

  String accept(int backCount) {
    if(this.sb_contains_eof) {
      this.sb_contains_eof = false;
      backCount--;
    }
    String text = this.sb.toString().substring(0, this.sb.length() - backCount);
    String leftover = this.sb.toString().substring(this.sb.length() - backCount, this.sb.length());
    this.buffer.insert(0, leftover);
    updateLinePos(text);
    return text;
  }

  String acceptWithMarker0(int backCount) {
    if(this.sb_contains_eof) {
      this.sb_contains_eof = false;
      backCount--;
    }
    String text = this.sb.toString().substring(0, this.marker0 - backCount);
    String leftover = this.sb.toString().substring(this.marker0 - backCount, this.sb.length());
    this.buffer.insert(0, leftover);
    updateLinePos(text);
    return text;
  }

}

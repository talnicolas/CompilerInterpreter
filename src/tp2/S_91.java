/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_91
    extends FinalState {

  static final S_91 instance = new S_91();

  private S_91() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$27(text, line, pos);
  }
}
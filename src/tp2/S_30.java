/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_30
    extends FinalState {

  static final S_30 instance = new S_30();

  private S_30() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$4(text, line, pos);
  }
}

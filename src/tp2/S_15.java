/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_15
    extends FinalState {

  static final S_15 instance = new S_15();

  private S_15() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$7(text, line, pos);
  }
}

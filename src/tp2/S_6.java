/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_6
    extends FinalState {

  static final S_6 instance = new S_6();

  private S_6() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$23(text, line, pos);
  }
}
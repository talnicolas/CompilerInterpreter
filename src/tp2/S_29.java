/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_29
    extends FinalState {

  static final S_29 instance = new S_29();

  private S_29() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$3(text, line, pos);
  }
}

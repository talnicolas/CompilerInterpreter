/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_9
    extends FinalState {

  static final S_9 instance = new S_9();

  private S_9() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$22(text, line, pos);
  }
}

/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_81
    extends FinalState {

  static final S_81 instance = new S_81();

  private S_81() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$16(text, line, pos);
  }
}
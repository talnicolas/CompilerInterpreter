/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_73
    extends FinalState {

  static final S_73 instance = new S_73();

  private S_73() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$28(text, line, pos);
  }
}

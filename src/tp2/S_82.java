/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_82
    extends FinalState {

  static final S_82 instance = new S_82();

  private S_82() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$14(text, line, pos);
  }
}

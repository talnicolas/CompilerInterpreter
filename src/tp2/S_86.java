/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class S_86
    extends FinalState {

  static final S_86 instance = new S_86();

  private S_86() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$29(text, line, pos);
  }
}

/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

abstract class State {

  enum StateType {
    TRANSITION,
    FINAL;
  }

  abstract StateType getStateType();
}
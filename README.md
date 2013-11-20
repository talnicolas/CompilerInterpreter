Compiler - Interpreter
===================

Parser generator: SableCC (http://sablecc.org/)

The objective of this work is to write an interpreter and a compiler for a language (MiniLang++) that support strings, arrays, functions and procedures (with or without parameters), type conversion and command line parameters.

The grammar of the language is available in the folder "grammar".

The compiler outputs valid Java code directly executable in a JVM.

There are a few test files in the folders "test" and "testwithargs" that gives good examples of the capabilities of the language.

  Interpreter example:

    java MiniLangInterpreter testwithargs/comm1 toto tata titi

  Compiler example:

    java MiniLangCompiler test/conv1
  
  
For more information on the language or the interpreter/compiler, please write to nicolas.tallineau@gmail.com

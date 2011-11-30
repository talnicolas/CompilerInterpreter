/* Le fichier comm1.ml.attendu assume que le programme
   est invoque avec les parametres suivants: tata toto titi
   i.e.
   java MiniLangInterpreter comm1.ml tata toto titi
*/
{
  int i = 0;
  while(i < size(args)) {
    print(args[i]);
    println();
    i = i + 1;
  }
}

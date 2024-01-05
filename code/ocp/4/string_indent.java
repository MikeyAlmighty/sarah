public String indent(int numberSpaces)

String text = " My favourite movie is: deadpool";
System.out.println(text); //  " My favourite movie is: deadpool"
System.out.println(text.indent(-1)); // "My favourite movie is: deadpool"
System.out.println(text.indent(1)); // "  My favourite movie is: deadpool"

/*
    for (datatype instance: collection) {
        //Body
    }
*/

String[] fruits = { "Apple", "Mango", "Orange" };

for (String fruit: fruits) {
  System.out.println(fruit);
}

String birds = "Jay";
for(String bird : birds) // DOES NOT COMPILE
    System.out.print(bird + " ");

String[] sloths = new String[3];
for(int sloth : sloths) // DOES NOT COMPILE
    System.out.print(sloth + " ");

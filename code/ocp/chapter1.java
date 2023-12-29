// WildCards
import java.util.*; // imports java.util.Random among other things
public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}

// Invalid Imports
import java.nio.*;// NO GOOD -­a wildcard only matches // class names, not "file.Files"
import java.nio.*.*;// NO GOOD -­you can only have one wildcard // and it must be at the end
import java.nio.file.Paths.*; // NO GOOD -­you cannot import methods // only class names

// Valid Imports
import java.nio.file.*;
// OR
import java.nio.file.Files;
import java.nio.file.Paths;

// Collision
import java.util.*;
import java.sql.*; // causes Date declaration to not compile

// Correct imports
import java.util.Date;
import java.sql.*;

// Using Fully-Qualified Domain Names
public class Conflicts {
    java.util.Date date;
    java.sql.Date sqlDate;
}

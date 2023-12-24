// UIControl (Parent)
package com.demo;

public class UIControl {
    private boolean isEnabled = true;
    
    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}

// TextBox (Child)
package com.demo;

public class TextBox extends UIControl {
   private String text = "";

   public void setText(String text) {
    this.text = text;
   }
   public void clear() {
    text = "";
   }
}

// Child / Sub Class
public class TextBox extends UIControl {
   public TextBox() {
      super(true); // Call to Base (Parent) constructor
      System.out.println("TextBox");
   }
}

// Parent / Base Class
public class UIControl {
    private boolean isEnabled = true;
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
       System.out.println("UIControl");
    }
}

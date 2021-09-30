package September8.Specifer;



 class  animal{
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}

// Main.java
 class PublicExample {
    public static void main( String[] args ) {
   
    	animal a = new animal();

        // accessing the public variable
       a.legCount = 4;
     //   // accessing the public method
       a.display();
    }
}
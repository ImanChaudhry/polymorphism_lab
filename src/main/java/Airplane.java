public class Airplane extends Vehicle{

//unsure why end-code for animal_inheritance uses private boolean
 private boolean (isFunctional);

    public Airplane(String type, int size){
        super(type, size);
      this.isFunctional = isFunctional;
    }

    public String getType() {
        return super.getType();
    }

    public int getSize() {
        return super.getSize();
    }

    public String sound() {
        return "whoosh";
    }

  public boolean getIsFunctional() {
      return this.isFunctional; }
}


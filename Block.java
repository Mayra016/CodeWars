public class Block{
  int width = 0;
  int length = 0;
  int height = 0;

  // constructor
  public Block(int[] dimensions) {
    this.width = dimensions[0];
    this.length = dimensions[1];
    this.height = dimensions[2];
  }
  
  // get methods
	public int getWidth() {
    return this.width;
  }
  
  public int getLength() {
    return this.length;
  } 
  
  public int getHeight() {
    return this.height;
  }
  
  public int getVolume() {
    return this.width * this.length * this.height;
  }
  
  public int getSurfaceArea() {
    return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
  }
  
}

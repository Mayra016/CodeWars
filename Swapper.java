class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
    Object temp = this.arguments[0];
    arguments[0] = this.arguments[1];
    arguments[1] = temp;
  }
}

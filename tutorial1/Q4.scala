object Q4 {
  def main(args: Array[String]): Unit = {
    var bookPrice=24.95F;
    var afterDis=bookPrice - bookPrice*40/100;

    var copy=60;
    var cost=50*3.0F;

    if(copy>=50){
      cost=(copy*afterDis)+cost+((copy-50)*0.75F);
    }else{
      cost=(copy*afterDis)+cost;
    }
    println("Wholesale cost for the copy is "+ cost);
  }
}

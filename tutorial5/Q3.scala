object Q3 {
  def main(args: Array[String]): Unit = {
    def sum(number :Int): Int ={
      if(number==1){
        return 1
      }else{
        return number+sum(number-1)
      }
    }
    println(sum(5))
  }
}

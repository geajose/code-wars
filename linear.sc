object linear_reg {
  def main(args : Array[String]): Unit={
    val x = List(1.1,1.3,1.5,2.0,2.2)
    val y = List(39343.0,39891.0,43525.0,37731.0,46205.0)

    println(getY(x,cal_coff_slope(x,y)))

  }
  def getY(value:List[Double],value2:List[Double]):List[Double]={
    value.map(_*value2(0)+value(1))
  }
  def cal_coff_slope(value: List[Double], value1: List[Double]): List[Double]={
    val mean_val=value.sum/value.length
    val mean_val1=value1.sum/value1.length
    val mean_x=value.map(v => v - mean_val)
    val mean_y=value1.map(v => v - mean_val1)
    val m= ((mean_x, mean_y).zipped.map(_*_).sum)/((mean_x,mean_x).zipped.map(_*_).sum)
    val c=  mean_val1-(m*mean_val)
    List(m,c)
  }


}
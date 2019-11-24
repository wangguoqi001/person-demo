import scala.io.Source

object FileDemo {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("E:\\Text\\nihao.txt","gbk")
    val lines=source.getLines()
    for(i<-lines){
      println(i)
    }
  }
}

package OptionScala

object EitherFormation {
  /**
   * Function f : A=>B 
   */ 
   def f(a : Int):String ={
    val str = a.toString()
          str  
  }
   /**
    * Function g : Either[A,B] => Either[B,A] :
    * Either is PARAM type 
    */
   def g(a :Either[Int,String]):Either[String ,Int]={
    val result = a.isLeft  
    result match {
      case true => Left(f(a.left.get))
      case _ =>  Right(a.left.get)
    }  
   }
  def main (args : Array[String]){
    
    println(g(Right("zied")))
    
  }
}
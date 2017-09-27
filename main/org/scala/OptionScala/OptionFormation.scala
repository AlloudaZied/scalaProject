package org.scala.OptionScala
/**
 * Type MONADIQUE 
 */
object OptionFormation {
  
  /***********************************Option Type********************/
  /**
   * Function f : A => B
   */
  def f(a : Int):String ={
    val str = a.toString()
          str  
  }
  /**
   * Function g :Option[A]=> Option[B] using Pattern Matching
   */
  def g(a:Option[Int]):Option[String] = a match {       
    case None => None
    case _    => Some(f(a.get))    
  }
  /**
   * Function h Option[A] => B using Pattern Matching
   */
  def h(a :Option[Int]): String = a match {
    case None =>  "Without value"
    case _    => f(a.get)
  }
  /**
   * Function k A => Option[B]
   */
  def k(a :Int) : Option[String]=a match {
    case 0 => None
    case _ => Some(f(a))
  }
def main(args :Array[String]){
  println(f(1))
  println(g(Some(1)))
  println(h(None))
  println(k(1))   
  }  
}
package xmlExtractor

import scala.collection.mutable.ListBuffer
import scala.xml.Elem

/**
 * Problem: In a SCALA application, you want to extract information from XML you receive,
 * so you can use the data in your application
 * @author ZIED
 */
class Xml {
  case class Couple(str: String, number: Int)
  /**
   * Function that reduce a  List of Couple object
   * @param list : List of Couple
   * @return List of Couple
   */
  def reduceByKey(list: List[Couple]): List[Couple] = {
    var count = 1
    var size = list.size - 1
    var listBuffer = new ListBuffer[Couple]
    for (cp1 <- 0 to size) {
      if (!exist(list(cp1).str, listBuffer)) {
        for (cp2 <- 1 to size) {
          if (list(cp1).str == list(cp2).str) {
            count += 1
          }
        }
        listBuffer += Couple(list(cp1).str, count)
      }
    }
    listBuffer.toList
  }
  /**
   * Function for existence used By $reduceByKey
   * @param str
   * @param listBuffer
   */
  def exist(str: String, listBuffer: ListBuffer[Couple]): Boolean = {
    var bool = false
    var cp = 0
    var size = listBuffer.size
    while ((bool == false) && (cp < size)) {
      if ((str == listBuffer(cp).str) && (cp != 0)) {
        bool = true
        cp = size
      } else cp += 1
    }
    bool
  }
  /**
   * Function getting the name 
   */
  def getNode(url :String):Elem ={
    val musicfile = scala.xml.XML.loadFile(getClass.getResource(url).getFile)
    println(musicfile.child.head)
    val fileLabel = musicfile.label
    fileLabel match {
      case "music" => musicfile
      case _ => null
    }
  }
}